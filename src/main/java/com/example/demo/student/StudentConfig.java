package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student shashank =  new Student(
                    "Shashank",
                    "stiple@depaul.edu",
                    LocalDate.of(1993, Month.MAY, 7)


            );

            Student monu =  new Student(
                    "Monu",
                    "smonu@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 1)


            );

                repository.saveAll(
                        List.of(shashank,monu));



        };
    }
}
