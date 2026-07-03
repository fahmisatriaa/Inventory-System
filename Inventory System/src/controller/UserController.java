package controller;

import java.util.ArrayList;

import models.User;
import service.UserService;

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(User user) {
        userService.addUser(user);
    }

    public ArrayList<User> getAllUsers() {
        return userService.getAllUsers();
    }

}