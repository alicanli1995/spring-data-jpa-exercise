package com.example.classfive.repository;

import com.example.classfive.model.Cart;
import com.example.classfive.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Long> {
}
