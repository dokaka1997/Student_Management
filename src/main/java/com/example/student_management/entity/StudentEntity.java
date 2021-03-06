package com.example.student_management.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
// tạo table trong database với tên và các cột
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private int age;
    private String teacher;

}
