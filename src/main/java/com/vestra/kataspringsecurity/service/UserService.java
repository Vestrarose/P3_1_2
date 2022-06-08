package com.vestra.kataspringsecurity.service;

import com.vestra.kataspringsecurity.model.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService  {
    UserDetails loadUserByUsername(String username);
    User findById(Long id);
    List<User> findAll();
    boolean saveUser(User user);
    boolean deleteById(Long id);
    User findByUsername(String username);

}