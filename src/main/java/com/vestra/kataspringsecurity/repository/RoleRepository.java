package com.vestra.kataspringsecurity.repository;

import com.vestra.kataspringsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
