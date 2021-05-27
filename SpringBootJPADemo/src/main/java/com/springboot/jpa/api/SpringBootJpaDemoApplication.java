package com.springboot.jpa.api;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.jpa.api.entity.Person;
import com.springboot.jpa.api.repo.PersonJpaRepository;

@SpringBootApplication
public class SpringBootJpaDemoApplication implements CommandLineRunner  {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository personJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		
		logger.info("*********** Before Transaction :- All users -> {} **********",personJpaRepository.findAll());
		
		logger.info("********** User found by Id as 1 -> {} ************",personJpaRepository.findById(1));
		
		personJpaRepository.deleteById(3);
		
		logger.info("********** User deleted by Id as 3 -> {} **********");
		
		logger.info("********** User inserted by Id as 3 -> {} **********",personJpaRepository.insert(new Person(3,"Pieter","Amsterdam",new Date())));
		
		logger.info("********** User updated by Id as 3 -> {} **********",personJpaRepository.update(new Person(3,"Pieter","Amsterdam",new Date())));
		
		logger.info("********** After Transaction :- All users -> {} **********",personJpaRepository.findAll());
	}

}
