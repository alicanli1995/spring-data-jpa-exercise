package com.example.class3onetooneunidirectional.repository;

import com.example.class3onetooneunidirectional.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
