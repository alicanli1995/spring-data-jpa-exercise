package com.example.tableperclass.repository;

import com.example.tableperclass.model.Spell;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface SpellRepository extends CrudRepository<Spell, Long> {
}