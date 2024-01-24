package com.example.SpringBoot1.service;


import com.example.SpringBoot1.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public void deleteUser(long id);
    public User getUser(long id);
}
