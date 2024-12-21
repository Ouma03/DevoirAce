package org.sid.devoir_ace.web;


import org.sid.devoir_ace.dto.StudentDTO;
import org.sid.devoir_ace.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller
public class StudentGraphQLController {

    @Autowired
    private StudentService studentService;

    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(@Argument LocalDate dateNaissance) {
        return studentService.getStudentsByDateNaissance(dateNaissance);
    }

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO studentDTO) {
        return studentService.saveStudent(studentDTO);
    }
}