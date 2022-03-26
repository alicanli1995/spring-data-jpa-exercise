package com.example.classtwo.repository;

import com.example.classtwo.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car,Long> {
}
