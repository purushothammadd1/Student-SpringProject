package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.IStudentRepo;
@Service
public class StudentService {
	@Autowired
	IStudentRepo istudentRepo;
	
	public void addStudent(Student student) {
		istudentRepo.save(student);
	}

}
