package com.example.singletable.model;


import com.example.singletable.model.enums.PaintingTechnique;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue(value = "PAINTING")
public class Painting extends ArtPiece{

    @Enumerated(EnumType.STRING)
    private PaintingTechnique technique;

    private Double width;

    private Double height;

    public Painting(String author, PaintingTechnique technique, Double width, Double height) {
        super(author);
        this.technique = technique;
        this.width = width;
        this.height = height;
    }
}
