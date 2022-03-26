package com.example.classsuppermapperclass.repository;

import com.example.classsuppermapperclass.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface VehicleRepository<T extends Vehicle> extends JpaRepository<T, Long> {
}