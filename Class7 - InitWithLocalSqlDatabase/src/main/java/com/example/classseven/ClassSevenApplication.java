package com.example.classseven;

import com.example.classseven.model.Person;
import com.example.classseven.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassSevenApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(ClassSevenApplication.class, args);

        var personRepository = context.getBean(PersonRepository.class);

        var ali = new Person();
        ali.setAge(55);
        ali.setFirstName("Ali");
        ali.setLastName("CANLI");

        personRepository.save(ali);
        

    }

}
