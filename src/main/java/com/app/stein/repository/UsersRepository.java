package com.app.stein.repository;

import com.app.stein.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository <User, Integer> {
    User findByUsername(String username);
}
