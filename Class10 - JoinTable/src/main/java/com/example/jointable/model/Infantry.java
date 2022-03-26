package com.example.jointable.model;


import com.example.jointable.model.enums.InfantryType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
// Ayrı ayrı sub tipleri table olarak tutar ama kendi fieldları halinde .!
// Ana table ise abstract sınıfın fieldları ile tutulur. Genelde kullanılmaz gibi duruyor.
@Getter
@NoArgsConstructor
public abstract class Infantry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private InfantryType infantryType;

    private Integer moveSpeed;

    private Integer durability;

    private Integer attack;

    public Infantry(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer attack) {
        this.infantryType = infantryType;
        this.moveSpeed = moveSpeed;
        this.durability = durability;
        this.attack = attack;
    }
}
