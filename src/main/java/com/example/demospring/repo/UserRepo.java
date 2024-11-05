package com.example.demospring.repo;

import com.example.demospring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer>{

}