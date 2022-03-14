package com.app.stein.service;

import com.app.stein.model.Role;
import com.app.stein.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser (String username);
    List<User> getUsers();
}