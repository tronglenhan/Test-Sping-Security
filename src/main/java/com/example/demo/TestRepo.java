package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TestRepo extends JpaRepository<Test, Long> {

    @Query("select t from Test t where t.name = ?1")
    Test findTestByName(String name);
}
