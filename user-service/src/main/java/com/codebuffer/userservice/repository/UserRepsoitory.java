package com.codebuffer.userservice.repository;

import com.codebuffer.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepsoitory extends JpaRepository<User, Long> {
    User findUserById(Long userId);
}
