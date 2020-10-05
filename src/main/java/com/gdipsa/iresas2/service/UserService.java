package com.gdipsa.iresas2.service;

import com.gdipsa.iresas2.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findByUsername(String username);
    public Boolean login(String username, String password);
}
