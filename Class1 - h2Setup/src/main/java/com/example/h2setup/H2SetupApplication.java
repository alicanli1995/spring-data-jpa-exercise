package com.example.h2setup;

import com.example.h2setup.model.Person;
import com.example.h2setup.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class H2SetupApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(H2SetupApplication.class, args);

        var personRepository = configurableApplicationContext.getBean(PersonRepository.class);
        var myPerson = new Person("John","Doe");
        personRepository.save(myPerson);

    }

}
