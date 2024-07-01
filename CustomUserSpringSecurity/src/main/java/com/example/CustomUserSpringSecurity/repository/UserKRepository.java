package com.example.CustomUserSpringSecurity.repository;

import com.example.CustomUserSpringSecurity.models.UserK;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserKRepository extends JpaRepository<UserK,Long>
{
    Optional<UserK> findByUsername(String username);
}
