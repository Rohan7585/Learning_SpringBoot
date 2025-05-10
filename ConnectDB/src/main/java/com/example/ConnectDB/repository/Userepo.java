package com.example.ConnectDB.repository;

import com.example.ConnectDB.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userepo extends JpaRepository<UserDetails, Long> {

}
