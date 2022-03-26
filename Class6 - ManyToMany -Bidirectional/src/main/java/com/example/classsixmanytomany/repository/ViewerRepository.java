package com.example.classsixmanytomany.repository;

import com.example.classsixmanytomany.models.Stream;
import com.example.classsixmanytomany.models.Viewer;
import org.springframework.data.repository.CrudRepository;

public interface ViewerRepository extends CrudRepository<Viewer,Long> {
}
