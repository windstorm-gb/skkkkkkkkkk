package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User ,Integer> {

	
	public List<User> findByName(String name);
	
	@Query("select u from User u")
	public List<User> getAll();
	
	@Query("select u from User u WHERE u.name=:n")
	public List<User> getUserBYName(@Param("n") String name);
	
	
	@Query(value="select * from user",nativeQuery=true)
	public List<User> getUsers();
}
