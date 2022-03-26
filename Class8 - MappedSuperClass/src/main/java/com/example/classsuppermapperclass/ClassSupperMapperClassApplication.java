package com.example.classsuppermapperclass;

import com.example.classsuppermapperclass.model.Tank;
import com.example.classsuppermapperclass.model.Truck;
import com.example.classsuppermapperclass.repository.TankRepository;
import com.example.classsuppermapperclass.repository.TruckRepository;
import com.example.classsuppermapperclass.repository.VehicleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassSupperMapperClassApplication {

    public static void main(String[] args) {
        var context =
                SpringApplication.run(ClassSupperMapperClassApplication.class, args);

        VehicleRepository tankRepository =  context.getBean(TankRepository.class);
        VehicleRepository truckRepository = context.getBean(TruckRepository.class);

        var tank = new Tank("T-150",5,50);
        var truck = new Truck("Honda",5,10,Boolean.TRUE);

        tankRepository.save(tank);
        truckRepository.save(truck);

    }

}
