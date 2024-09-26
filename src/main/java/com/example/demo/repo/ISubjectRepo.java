package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Subject;
@Repository
public interface ISubjectRepo extends CrudRepository<Subject, Long>{

}
