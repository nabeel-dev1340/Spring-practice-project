package com.example.Springpractice.Repository;

import com.example.Springpractice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
