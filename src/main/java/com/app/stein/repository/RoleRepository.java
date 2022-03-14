package com.app.stein.repository;

import com.app.stein.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository <Role, Integer> {
    Role findByName(String name);
}
