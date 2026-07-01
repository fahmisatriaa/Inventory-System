package controller;

import java.util.ArrayList;

import models.Role;
import service.RoleService;

public class RoleController {

    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    public void addRole(Role role) {
        roleService.addRole(role);
    }

    public ArrayList<Role> getAllRoles() {
        return roleService.getAllRoles();
    }
}