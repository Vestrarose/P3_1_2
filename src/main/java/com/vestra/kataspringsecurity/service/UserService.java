package com.vestra.kataspringsecurity.service;

import com.vestra.kataspringsecurity.model.User;
import java.util.List;

public interface UserService {

    void save(User user);
    void update(User updatedUser);
    User show(Long id);
    void delete(Long id);
    List<User> getUsers();

}