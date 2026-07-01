package repository;

import java.util.ArrayList;

import models.User;

public class UserRepository implements IRepository<User> {

    private ArrayList<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public ArrayList<User> findAll() {
        return users;
    }

    public User findByUsername(String username) {

        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }

        return null;
    }

}
