package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repo.ICourseRepo;

@Service
public class CourseService {
	@Autowired
	ICourseRepo icourseRepo;
	
	public void addWorker(Course worker) {
		icourseRepo.save(worker);
	}
}
