package com.example.SpringBoot1.dao;


import com.example.SpringBoot1.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public void save(User user);
    public void deleteUser(long id);
    public User getUser(long id);
}
