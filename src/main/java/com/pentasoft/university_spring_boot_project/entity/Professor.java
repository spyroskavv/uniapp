package com.pentasoft.university_spring_boot_project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "professor")
    private List<Course> courses;
}
