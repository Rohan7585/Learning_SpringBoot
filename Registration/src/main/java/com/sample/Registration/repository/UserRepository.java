package com.sample.Registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.Registration.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{

}
