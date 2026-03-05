package com.pulsechat.pulseSer.repository;

import com.pulsechat.pulseSer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);

    User getUserByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
}