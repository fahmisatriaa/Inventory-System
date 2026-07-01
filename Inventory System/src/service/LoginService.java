package service;

import models.User;
import repository.UserRepository;

public class LoginService {

    private UserRepository userRepository;

    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String username, String password) {

        User user = userRepository.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return true;
        }

        return false;
    }
}