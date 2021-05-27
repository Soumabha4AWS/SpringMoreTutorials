package com.springboot.jdbc.api.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.jdbc.api.entity.Person;

@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;	
	
	public List<Person> findAll() {
		// BeanPropertyRowMapper<Person> beanPropertyRowMapper = new BeanPropertyRowMapper<Person>(Person.class);
		// List<Person> queryPerson =  jdbcTemplate.query("select * from person", beanPropertyRowMapper);
		List<Person> queryPerson =  jdbcTemplate.query("select * from person",new PersonRowMapper());
		return queryPerson;
	}
	
	
	public List<Person> findById(int id) {
		// BeanPropertyRowMapper<Person> beanPropertyRowMapper = new BeanPropertyRowMapper<Person>(Person.class);
		// List<Person> queryForPerson = (List<Person>) jdbcTemplate.query("select * from person where id = ?", new Object[] {id} , beanPropertyRowMapper);
		List<Person> queryForPerson = (List<Person>) jdbcTemplate.query("select * from person where id = ?", new Object[] {id} , new PersonRowMapper());
		return queryForPerson;
	}

	
	public int deleteById(int id) {
		return jdbcTemplate.update("delete from person where id = ?", new Object[] {id});
	}
	
	public int insert(Person person) {
		return jdbcTemplate.update("insert into person (id, name, location, birth_date ) values (?, ?, ?, ?)", 
				new Object[] {person.getId(), person.getName(), person.getLocation(), person.getBirthDate()});
	}
	
	public int update(Person person) {
		return jdbcTemplate.update("update person set name = ?, location = ?, birth_date = ? where id = ?", 
				new Object[] {person.getName(), person.getLocation(), person.getBirthDate(),person.getId()});
	}
}
