package com.example.singletable.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "ART_PIECE_TYPE",
        discriminatorType = DiscriminatorType.STRING
)
@NoArgsConstructor
public abstract class ArtPiece {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;

    public ArtPiece(String author) {
        this.author = author;
    }
}
