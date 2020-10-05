package com.gdipsa.iresas2.repo;

import com.gdipsa.iresas2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface RoleRepo  extends JpaRepository<Role, Integer> {
    Role findByRoleType(String roleType);
    ArrayList<Role> findAll();
}
