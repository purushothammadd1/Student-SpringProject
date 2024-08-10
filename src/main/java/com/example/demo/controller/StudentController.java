package com.example.demo.controller;

import com.example.demo.service.StudentService;
import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentServ;
    @Autowired
    public StudentController(StudentService studentServ) {
        this.studentServ = studentServ;
    }

    @GetMapping
    public List<Student> getStudents(){
       return studentServ.getStudents();
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentServ.addNewStudent(student);
    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentServ.deleteStudent(studentId);
    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId,@RequestParam(required = false) String name,@RequestParam(required = false) String email){
        studentServ.updateStudent(studentId, name,email);
    }
}