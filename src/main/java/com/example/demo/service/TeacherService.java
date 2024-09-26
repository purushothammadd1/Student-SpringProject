package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repo.ITeacherRepo;

@Service
public class TeacherService {
	
	@Autowired
	ITeacherRepo iteacherRepo;
	
	public void addTeacher(Teacher teacher) {
		iteacherRepo.save(teacher);
	}
}
