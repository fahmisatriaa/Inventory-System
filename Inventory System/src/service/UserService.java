package service;

import java.util.ArrayList;

import models.User;
import repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public ArrayList<User> getAllUsers(){
        return userRepository.findAll();
    }
}
