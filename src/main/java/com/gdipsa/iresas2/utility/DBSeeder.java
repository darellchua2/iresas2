package com.gdipsa.iresas2.utility;

import com.gdipsa.iresas2.model.Role;
import com.gdipsa.iresas2.repo.RoleRepo;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Paths;

@Component
public class DBSeeder {

    @Autowired
    RoleRepo rRepo;

    @EventListener
    public void seed(ContextRefreshedEvent event) throws Exception {

        seedRolesTable();
        seedUsersTable();
    }

    private void seedUsersTable()throws Exception {

    }

    public void seedRolesTable() throws Exception {
        try{
            String[] HEADERS = {"id", "roleName", "roleCode"};

            //Find csv file
            URL resource = getClass().getClassLoader().getResource("csvuploads/role.csv");
            System.out.println((resource));

            File file = Paths.get(resource.toURI()).toFile();
            String path = file.getPath();
            System.out.println((path));

            System.out.println(("------------"));

            Reader in = new FileReader(path);
            System.out.println((path));

            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader(HEADERS)
                    .withFirstRecordAsHeader()
                    .parse(in);

            for (CSVRecord record : records) {
//            get refers to column number
                System.out.println((record.get(0) + ";" + record.get(1) + ";" + record.get(2)));

                //Create new obj
                Role roleSave = new Role();
                roleSave.setRoleType(record.get(1));
                roleSave.setRoleCode(record.get(2));

                //Check if database already have roles
                Role roleCheck = rRepo.findByRoleType(record.get(1));

                if (roleCheck != null) {
                    continue;
                } else {
                    rRepo.save(roleSave);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Something is wrong :" + e);
        }



    }

}
