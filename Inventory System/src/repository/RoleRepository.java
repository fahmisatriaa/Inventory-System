package repository;

import java.util.ArrayList;
import models.Role;

public class RoleRepository implements IRepository<Role> {
    private ArrayList<Role> roles;

    public RoleRepository() {
        this.roles = new ArrayList<>();
    }

    @Override
    public void save(Role role) {
        roles.add(role);
    }

    @Override
    public ArrayList<Role> findAll() {
        return roles;
    }
}