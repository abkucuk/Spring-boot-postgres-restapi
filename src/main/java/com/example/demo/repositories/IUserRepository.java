package com.example.demo.repositories;

import com.example.demo.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {

}
