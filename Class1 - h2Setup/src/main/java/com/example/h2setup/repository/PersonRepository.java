package com.example.h2setup.repository;

import com.example.h2setup.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {

}
