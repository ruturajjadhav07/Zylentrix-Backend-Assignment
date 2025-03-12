package com.backend.zylentrix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.zylentrix.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    // exist by email
    boolean existsByEmail(String email);
}
