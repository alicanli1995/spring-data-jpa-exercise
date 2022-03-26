package com.example.jointable;

import com.example.jointable.model.Archer;
import com.example.jointable.model.Infantry;
import com.example.jointable.model.Knight;
import com.example.jointable.model.enums.InfantryType;
import com.example.jointable.repository.ArcherRepository;
import com.example.jointable.repository.InfantryRepository;
import com.example.jointable.repository.KnightRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JoinTableApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(JoinTableApplication.class, args);

        InfantryRepository archerRepository = context.getBean(ArcherRepository.class);
        InfantryRepository knigthRepository = context.getBean(KnightRepository.class);

        Infantry archer = new Archer
                (InfantryType.LIGHT,400,500,200,1000);
        Infantry knight = new Knight(
                InfantryType.HEAVY, 300,200,100,Boolean.FALSE
        );

        archerRepository.save(archer);

        knigthRepository.save(knight);

        

    }

}
