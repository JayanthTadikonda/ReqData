package com.jay.SpringSecurityLoginAttempts.repository;

import com.jay.SpringSecurityLoginAttempts.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

        Student findByUsername(String username);
        List<Student> findAll();
        Optional<Student> findById(Integer integer);

}