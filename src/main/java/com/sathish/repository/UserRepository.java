package com.sathish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
