package com.example.singletable;

import com.example.singletable.model.ArtPiece;
import com.example.singletable.model.Painting;
import com.example.singletable.model.Sculpture;
import com.example.singletable.model.enums.Material;
import com.example.singletable.model.enums.PaintingTechnique;
import com.example.singletable.repository.PaintingRepository;
import com.example.singletable.repository.SculptureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingleTableApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(SingleTableApplication.class, args);

        var sculptureRepository = context.getBean(SculptureRepository.class);
        var paintingRepository = context.getBean(PaintingRepository.class);

        ArtPiece sculpture = new Sculpture("Ali CANLI", Material.METAL,200.2);
        ArtPiece painting = new Painting("Ali CANLI", PaintingTechnique.OIL,200.2,300.0);

        sculptureRepository.save(sculpture);

        paintingRepository.save(painting);


        sculptureRepository.delete(sculpture);


    }

}
