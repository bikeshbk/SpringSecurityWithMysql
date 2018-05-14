package com.security.mysql.springSecurityMysql.repository;

import com.security.mysql.springSecurityMysql.models.UserModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModels, Integer> {
    Optional<UserModels> findByUsername(String username);
}
