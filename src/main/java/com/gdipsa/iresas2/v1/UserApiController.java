package com.gdipsa.iresas2.v1;

import com.gdipsa.iresas2.model.User;
import com.gdipsa.iresas2.service.UserService;
import com.gdipsa.iresas2.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserApiController {


    @Autowired
    private UserService uService;

    @Autowired
    public void setUserService(UserServiceImpl uServiceImpl){
        this.uService=uServiceImpl;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return uService.findAll();
    }

    @GetMapping("/user")
    public User getUser(@PathVariable String username) {
        return uService.findByUsername(username);
    }

}
