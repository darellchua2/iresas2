package com.gdipsa.iresas2.v1;

import com.gdipsa.iresas2.model.Role;
import com.gdipsa.iresas2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/role")
public class RoleApiController {

    @Autowired
    private RoleService rService;

    @GetMapping("/list")
    public ArrayList<Role> getHoliday() {
        return rService.findAllRoles();
    }

}
