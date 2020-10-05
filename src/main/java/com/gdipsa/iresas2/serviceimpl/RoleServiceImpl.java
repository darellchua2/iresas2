package com.gdipsa.iresas2.serviceimpl;

import com.gdipsa.iresas2.model.Role;
import com.gdipsa.iresas2.repo.RoleRepo;
import com.gdipsa.iresas2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepo rRepo;

    @Override
    public ArrayList<Role> findAllRoles() {
        return rRepo.findAll();
    }
}
