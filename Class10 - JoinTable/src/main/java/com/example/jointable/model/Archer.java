package com.example.jointable.model;

import com.example.jointable.model.enums.InfantryType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Archer extends Infantry{

    private Integer range;

    public Archer(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer attack, Integer range) {
        super(infantryType, moveSpeed, durability, attack);
        this.range = range;
    }
}
