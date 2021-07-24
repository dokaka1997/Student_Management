package com.example.student_management.controller;

import com.example.student_management.entity.StudentEntity;
import com.example.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("student")
@CrossOrigin
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentEntity> createStudent(@RequestBody StudentEntity studentEntity) {
        return ResponseEntity.ok(studentService.createStudent(studentEntity));
    }

    @GetMapping
    public ResponseEntity<List<StudentEntity>> getAllStudent() {
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteStudent(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.deleteStudent(id));
    }
}
