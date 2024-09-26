package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Teacher;

@Repository
public interface ITeacherRepo extends JpaRepository<Teacher, Long>{

}
