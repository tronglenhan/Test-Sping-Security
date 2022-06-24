package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AuthRepo extends JpaRepository<User, Long> {

//    @Query(value = "SELECT a from AUTH a where a.USERNAME like ?1", nativeQuery = true)
//    Optional<Auth> getAuthByUsername(String username);

    User findAuthByUsername(String username);

}
