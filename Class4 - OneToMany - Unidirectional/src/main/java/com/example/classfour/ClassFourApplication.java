package com.example.classfour;

import com.example.classfour.model.Student;
import com.example.classfour.model.University;
import com.example.classfour.repository.StudentRepository;
import com.example.classfour.repository.UniversityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ClassFourApplication {

    public static void main(String[] args) {
        var appConfigContext =
                SpringApplication.run(ClassFourApplication.class, args);

        var studentRepository = appConfigContext.getBean(StudentRepository.class);
        var universityRepository = appConfigContext.getBean(UniversityRepository.class);

        var studentOne = new Student();
        studentOne.setIndexNumber("123");
        var studentTwo = new Student();
        studentTwo.setIndexNumber("234");
        var students = Arrays.asList(studentOne,studentTwo);

        var studentForOrphanRemoval = new Student();
        studentForOrphanRemoval.setIndexNumber("12345");
        studentRepository.save(studentForOrphanRemoval);


        var university = new University();
        university.setName("Bozok University");
        university.setStudents(students);
        universityRepository.save(university);

//        -> Remove university for see orphanRemoval ->
        universityRepository.delete(university);
    }

}
