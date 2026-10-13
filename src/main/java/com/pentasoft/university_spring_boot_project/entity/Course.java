package com.pentasoft.university_spring_boot_project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Boolean mandatory;
    private int credits;
    private int duration;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    private Department department;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    private Professor professor;

    @ManyToMany(mappedBy = "enrolledCourses", fetch = FetchType.LAZY)
    private List<Student> students;
}
