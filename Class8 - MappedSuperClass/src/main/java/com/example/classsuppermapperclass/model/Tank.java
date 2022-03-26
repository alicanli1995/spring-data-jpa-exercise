package com.example.classsuppermapperclass.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DynamicUpdate
public class Tank extends Vehicle{

    private Integer firePower;


    public Tank(String name, Integer seats, Integer firePower) {
        super(name, seats);
        this.firePower = firePower;
    }
}
