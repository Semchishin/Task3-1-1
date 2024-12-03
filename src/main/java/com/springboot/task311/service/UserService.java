package com.springboot.task311.service;


import com.springboot.task311.model.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    void addUser(User user);

    public User showUserById(long id);

    public void updateUser(User user);

    void deleteUser(long id);
}
