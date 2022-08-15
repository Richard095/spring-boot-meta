package com.metaphorce.test.service;

import com.metaphorce.test.models.User;
import com.metaphorce.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userReporitory;

    @Override
    public ArrayList<User> getAllUsers() {
        return (ArrayList<User>) userReporitory.findAll();
    }

    @Override
    public Optional<User> getUserById(Integer id) {
        return userReporitory.findById(id);
    }

    @Override
    public User saveUser(User user) {
        return userReporitory.save(user);
    }

    @Override
    public boolean deleteUserById(Integer id) {
        try {
             Optional<User>  user = getUserById(id);
             userReporitory.delete(user.get());
             return true;
        }catch (Exception e){
            return false;
        }
    }
}
