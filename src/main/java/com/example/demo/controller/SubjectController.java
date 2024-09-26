package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	SubjectService subjectServ;
	
	@PostMapping("subject")
	public void addSubject(@RequestBody Subject subject) {
		subjectServ.addSubject(subject);
	}
	
	@PostMapping("subject/special")
	public void addSubjectSpec(@RequestBody Subject subject) {
		subjectServ.addSubject(subject);
	}
}
