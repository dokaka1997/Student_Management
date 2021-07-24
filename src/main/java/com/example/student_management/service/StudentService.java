package com.example.student_management.service;

import com.example.student_management.entity.StudentEntity;
import com.example.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentEntity createStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public List<StudentEntity> getAllStudent() {
        return studentRepository.findAll();
    }

    public Boolean deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return true;
    }

}
