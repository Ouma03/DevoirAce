package org.sid.devoir_ace.service;

import org.sid.devoir_ace.dao.entities.Student;
import org.sid.devoir_ace.dao.repository.StudentRepository;
import org.sid.devoir_ace.dto.StudentDTO;
import org.sid.devoir_ace.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentManager implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentDTO> getStudentsByDateNaissance(LocalDate dateNaissance) {
        List<Student> students = studentRepository.findByDateNaissance(dateNaissance);
        return students.stream()
                .map(studentMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.toEntity(studentDTO);
        student = studentRepository.save(student);
        return studentMapper.toDTO(student);
    }
}
