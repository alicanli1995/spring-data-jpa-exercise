package com.example.classtwo;

import com.example.classtwo.model.Car;
import com.example.classtwo.model.Owner;
import com.example.classtwo.repository.CarRepository;
import com.example.classtwo.repository.OwnerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ClassTwoApplication {

    public static void main(String[] args) {
       var appContext = SpringApplication.run(ClassTwoApplication.class, args);

        var carRepository = appContext.getBean(CarRepository.class);
        var ownerRepository = appContext.getBean(OwnerRepository.class);

        var car = new Car("BMW");
        carRepository.save(car);
        var owner = new Owner("Ali CANLI");
        owner.setCar(car);
        ownerRepository.save(owner);

        var optCar = carRepository.findById(1L);
        var optOwner = ownerRepository.findById(1L);
        if (optCar.isPresent() && optOwner.isPresent()) {
            log.info(optCar.get() + " is owned by " + optCar.get().getOwner());
            log.info(optOwner.get() + " has a car " + optOwner.get().getCar());
        }
    }

}
