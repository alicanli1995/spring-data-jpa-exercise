package com.example.classfour.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "university_id")
    private List<Student> students = new ArrayList<>();

}

// OrphanRemoval =>

// orphanRemoval Hangi Tür İlişkilerde Kullanılır
// Bu alan sadece @OneToOne ve @OneToMany ilişkilerde kullanılır.
// Yani bu seçenek ile başı boş kalan dependent nesne de otomatik olarak silinir.

