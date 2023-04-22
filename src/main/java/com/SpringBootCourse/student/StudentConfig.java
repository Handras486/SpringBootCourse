package com.SpringBootCourse.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student peter = new Student(
                    "Peter",
                    "peter@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student yozsi = new Student(
                    "Yozsi",
                    "yozsi@gmail.com",
                    LocalDate.of(2007, Month.APRIL, 19)
            );

            repository.saveAll(List.of(peter, yozsi));
        };
    }
}
