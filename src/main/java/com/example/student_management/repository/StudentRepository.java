package com.example.student_management.repository;

import com.example.student_management.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// tạo 1 repository để tương tác với db
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
