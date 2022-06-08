package com.vestra.kataspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vestra.kataspringsecurity.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String username);

}
