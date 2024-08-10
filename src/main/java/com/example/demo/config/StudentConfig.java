package com.example.demo.config;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student mariam = new Student(1L,"Mariam","mariam.jamal@gmail.com", LocalDate.of(2000, Month.MARCH,11));
            Student alex = new Student(2L,"alex","alex.jamal@gmail.com", LocalDate.of(2004, Month.MARCH,11));
            repository.saveAll(List.of(mariam,alex));
        };

    }
}
