package com.example.classtwo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "car")
@NoArgsConstructor
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    @OneToOne(mappedBy = "car")
    @ToString.Exclude
    private Owner owner;

    public Car(String model) {
        this.model = model;
    }
}
