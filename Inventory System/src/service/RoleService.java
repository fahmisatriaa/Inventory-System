package service;

import java.util.ArrayList;

import models.Role;
import repository.RoleRepository;

public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void addRole(Role role) {
        roleRepository.save(role);
    }

    public ArrayList<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}