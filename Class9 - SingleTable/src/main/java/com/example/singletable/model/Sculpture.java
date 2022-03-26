package com.example.singletable.model;

import com.example.singletable.model.enums.Material;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@NoArgsConstructor
@DiscriminatorValue(value = "SCULPTURE")
public class Sculpture extends ArtPiece{

    @Enumerated(EnumType.STRING)
    private Material material;

    private Double weigth;


    public Sculpture(String author, Material material, Double weigth) {
        super(author);
        this.material = material;
        this.weigth = weigth;
    }
}
