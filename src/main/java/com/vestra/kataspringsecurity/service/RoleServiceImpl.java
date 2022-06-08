package com.vestra.kataspringsecurity.service;

import com.vestra.kataspringsecurity.model.Role;
import com.vestra.kataspringsecurity.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getRoles() {

        return roleRepository.findAll();
    }

    @Override
    public void save(Role role) {

        roleRepository.save(role);
    }

    @Override
    public void update(Role updatedRole) {
        roleRepository.save(updatedRole);

    }

    @Override
    public Role show(Long id) {
        Role newRole = null;
        Optional<Role> roleOptional = roleRepository.findById(id);
        if (roleOptional.isPresent()) {
            newRole = roleOptional.get();
        }
        return newRole;
    }

    @Override
    public void delete(Long id) {
        roleRepository.deleteById(id);
    }


}
