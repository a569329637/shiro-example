package com.gsq.shiroweb.dao;

import com.gsq.shiroweb.entity.User;

import java.util.List;

public interface UserDao {

    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}
