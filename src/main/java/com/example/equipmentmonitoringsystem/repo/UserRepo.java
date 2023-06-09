package com.example.equipmentmonitoringsystem.repo;

import com.example.equipmentmonitoringsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo  extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);
    User findUserByEmail(String email);

}
