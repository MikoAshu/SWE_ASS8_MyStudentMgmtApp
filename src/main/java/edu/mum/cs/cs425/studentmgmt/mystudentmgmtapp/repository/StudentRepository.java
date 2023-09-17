package edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.repository;

import edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}