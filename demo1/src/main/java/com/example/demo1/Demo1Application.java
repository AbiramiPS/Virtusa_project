package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO details(id, name, email, password) VALUES (?, ?, ?, ?)";

		int result = jdbcTemplate.update(sql, 2, "Abi", "abi@gmail.com", "12345");

		if (result > 0) {
			System.out.println("A new row has been inserted");
		}
	}
}
