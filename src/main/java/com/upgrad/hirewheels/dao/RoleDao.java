package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleDao extends JpaRepository<Role, Integer> {
    public Optional<Role> findByRoleName(String roleName);
}
