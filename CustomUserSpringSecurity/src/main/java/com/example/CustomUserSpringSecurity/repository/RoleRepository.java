package com.example.CustomUserSpringSecurity.repository;

import com.example.CustomUserSpringSecurity.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role,Long> {
}
