package com.example.classfour.repository;

import com.example.classfour.model.Student;
import com.example.classfour.model.University;
import org.springframework.data.repository.CrudRepository;

public interface UniversityRepository extends CrudRepository<University,Long> {
}
