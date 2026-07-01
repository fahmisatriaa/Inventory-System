package controller;

import service.AuthService;

public class AuthController {

    private AuthService loginService;

    public AuthController(AuthService loginService) {
        this.loginService = loginService;
    }

    public boolean login(String username, String password) {
        return loginService.login(username, password);
    }
}