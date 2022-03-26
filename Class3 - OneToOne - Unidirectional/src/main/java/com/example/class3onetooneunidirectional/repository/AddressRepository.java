package com.example.class3onetooneunidirectional.repository;

import com.example.class3onetooneunidirectional.model.Address;
import com.example.class3onetooneunidirectional.model.User;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Long> {

}
