package com.example.classtwo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "owner")
@NoArgsConstructor
@Data
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @ToString.Exclude
    @JoinColumn(name = "car_id",referencedColumnName = "id")
    private Car car;

    public Owner(String name) {
        this.name = name;
    }
}
