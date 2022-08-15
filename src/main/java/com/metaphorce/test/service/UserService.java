package com.metaphorce.test.service;

import com.metaphorce.test.models.User;

import java.util.ArrayList;
import java.util.Optional;

public interface UserService {

    ArrayList<User> getAllUsers();

    Optional<User> getUserById(Integer id);

    User saveUser(User user);

    boolean deleteUserById(Integer id);
}
