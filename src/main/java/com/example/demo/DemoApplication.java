package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner  {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	TestRepo testRepo;

	@Autowired
	AuthRepo authRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		String name ="nhan";
		User user = authRepo.findAuthByUsername(name);
		System.err.println(user.getRole());
	}
}
