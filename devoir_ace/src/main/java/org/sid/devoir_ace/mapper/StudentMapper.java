package org.sid.devoir_ace.mapper;

import org.modelmapper.ModelMapper;
import org.sid.devoir_ace.dto.StudentDTO;
import org.sid.devoir_ace.dao.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public StudentDTO toDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }

    public Student toEntity(StudentDTO studentDTO) {
        return modelMapper.map(studentDTO, Student.class);
    }
}

