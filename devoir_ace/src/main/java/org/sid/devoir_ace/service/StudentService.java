package org.sid.devoir_ace.service;

import org.sid.devoir_ace.dto.StudentDTO;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {

    List<StudentDTO> getStudentsByDateNaissance(LocalDate dateNaissance);

    StudentDTO saveStudent(StudentDTO studentDTO);
}

