package com.springboot.jdbc.api;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.jdbc.api.dao.PersonJdbcDao;
import com.springboot.jdbc.api.entity.Person;

@SpringBootApplication
public class SpringBootJdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All users -> {} ",personJdbcDao.findAll());
		
		logger.info("User found by Id as 1 -> {} ",personJdbcDao.findById(1));
		
		logger.info("User deleted by Id as 3 -> {} ",personJdbcDao.deleteById(3));
		
		logger.info("User inserted by Id as 3 -> {} ",personJdbcDao.insert(new Person(3,"Pieter","Amsterdam",new Date())));
		
		logger.info("User updated by Id as 3 -> {} ",personJdbcDao.update(new Person(3,"Pieter","Amsterdam",new Date())));
	}

}
