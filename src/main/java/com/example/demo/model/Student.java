package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	private String studentName;
	@Enumerated(value=EnumType.STRING)
	private Gender gender;
	
	//mappings
	@ManyToOne()
	@JoinColumn(name="fk_subject_id")
	private Subject subject;
	
	@OneToOne()
	@JoinColumn(name="fk_address_id")
	private Address address;
	
	@ManyToMany()
	@JoinTable(name="fk_student_course_table",joinColumns = @JoinColumn(name ="fk_student_id"),
	inverseJoinColumns = @JoinColumn(name ="fk_course_id"))
	private List<Course> courses;
	
	@OneToMany()
	@JoinColumn(name="fk_student_id")
	private List<Teacher> teachers;

}
