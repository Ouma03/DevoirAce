package org.sid.devoir_ace.dao.repository;

import org.sid.devoir_ace.dao.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDateNaissance(LocalDate dateNaissance);
}