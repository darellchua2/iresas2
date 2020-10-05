package com.gdipsa.iresas2.v1;

import com.gdipsa.iresas2.model.User;
import com.gdipsa.iresas2.service.RoleService;
import com.gdipsa.iresas2.service.UserService;
import com.gdipsa.iresas2.serviceimpl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/login")
public class LoginApiController {

    @Autowired
    protected UserService uService;

    @Autowired
    protected RoleService rService;

    @Autowired
    public void setRoleService (RoleServiceImpl rServiceImpl){
        this.rService= rServiceImpl;
    }

    @GetMapping("/login")
    public User login(@ModelAttribute User user){
        //check username and password match
        if(uService.login(user.getUsername(), user.getPassword())){
            return uService.findByUsername(user.getUsername());
        }
        return null;
    }





}
