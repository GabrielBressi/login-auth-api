package com.gabriel.loginauthapi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.loginauthapi.domain.users.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

    Optional<User> findByEmail(String email);    
}
