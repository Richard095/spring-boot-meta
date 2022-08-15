package com.metaphorce.test.controllers;

import com.metaphorce.test.models.User;
import com.metaphorce.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ArrayList<User> getAll(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable("id") Integer id){
        return this.userService.getUserById(id);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return this.userService.saveUser(user);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable("id") Integer id){
        if(this.userService.deleteUserById(id))
        {
            return "User deleted.";
        }else{
            return "Error to try delete user";
        }
    }

}
