package com.example.equipmentmonitoringsystem.repo;

import com.example.equipmentmonitoringsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<User, Long> {

}
