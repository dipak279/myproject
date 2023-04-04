package com.xenonstack.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.xenonstack.entity.Student;

public interface StudentDao extends JpaRepository<Student, Long> {
	Optional<Student>findByEmailAndPassword(String email,String password);

	Student findByEmail(String email);
	

}
