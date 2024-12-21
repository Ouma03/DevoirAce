package org.sid.devoir_ace;

import org.sid.devoir_ace.dao.entities.Student;
import org.sid.devoir_ace.dao.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@SpringBootApplication
public class DevoirAceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DevoirAceApplication.class, args);
    }


    private StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(new Student(1L, "John Doe", "john.doe@example.com", LocalDate.of(2000, 5, 15)));
        studentRepository.save(new Student(2L, "Jane Smith", "jane.smith@example.com", LocalDate.of(1999, 10, 10)));
        studentRepository.save(new Student(3L, "Mike Johnson", "mike.johnson@example.com", LocalDate.of(2001, 12, 25)));
        studentRepository.save(new Student(4L, "Emily Davis", "emily.davis@example.com", LocalDate.of(1998, 3, 5)));
    }
}

