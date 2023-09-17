package edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp;

import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model.Student;
import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentMgmtApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        saveStudent(new Student("000-61-0001", "Anna", "Lynn",
                "Smith", 3.45, LocalDate.of(2019, 5, 24)));
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
