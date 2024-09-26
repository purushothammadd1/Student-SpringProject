package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Subject;
import com.example.demo.repo.ISubjectRepo;

@Service
public class SubjectService {

	@Autowired
	ISubjectRepo isubjectRepo;
	
	public void addSubject(Subject subject) {
		isubjectRepo.save(subject);
	}
}
