package com.example.classsuppermapperclass.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;

@Entity
@DynamicUpdate
public class Truck extends Vehicle{

    private Integer maxLoad;
    private Boolean sleeperCab;

    public Truck(String name, Integer seats, Integer maxLoad, Boolean sleeperCab) {
        super(name, seats);
        this.maxLoad = maxLoad;
        this.sleeperCab = sleeperCab;
    }
}
