package controller;

import service.LoginService;

public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public boolean login(String username, String password) {
        return loginService.login(username, password);
    }
}