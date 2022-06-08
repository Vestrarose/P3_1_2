package com.vestra.kataspringsecurity.service;

import com.vestra.kataspringsecurity.model.Role;

import java.util.List;

public interface RoleService {

    void save(Role role);
    void update(Role updatedRole);
    Role show(Long id);
    void delete(Long id);
    List<Role> getRoles();


}
