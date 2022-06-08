package com.vestra.kataspringsecurity.service;

import com.vestra.kataspringsecurity.model.User;
import com.vestra.kataspringsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {

        return userRepository.findAll();
    }

    @Override
    public void save(User user) {

        userRepository.save(user);
    }
    @Override
    public void update(User updatedUser) {
        userRepository.save(updatedUser);
    }

    @Override
    public User show(Long id) {
        User newUser = null;
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            newUser = user.get();
        }
        return newUser;
    }
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
