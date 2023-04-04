package com.xenonstack.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xenonstack.entity.Teachers;



public interface TeachersDao extends JpaRepository<Teachers, Long> {
	   Optional<Teachers> findByEmailAndPassword(String email,String password);

	   Teachers findByEmail(String email);

}
