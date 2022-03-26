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
public class Knight extends Infantry{

    private Boolean shield;

    public Knight(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer attack, Boolean shield)
    {
        super(infantryType, moveSpeed, durability, attack);
        this.shield = shield;
    }
}
