package com.gdipsa.iresas2.serviceimpl;

import com.gdipsa.iresas2.model.User;
import com.gdipsa.iresas2.repo.UserRepo;
import com.gdipsa.iresas2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo uRepo;

    @Transactional
    public List<User> findAll() {
        return uRepo.findAll();
    }

    @Transactional
    public User findByUsername(String username) {
        User user = uRepo.findByUsername(username);
        if(user!=null){
            return user;
        }
        return null;
    }

    @Override
    public Boolean login(String username, String password) {
        User user = findByUsername(username);
        if(user!=null && user.getPassword()==password){
            return true;
        }
        return false;
    }
}
