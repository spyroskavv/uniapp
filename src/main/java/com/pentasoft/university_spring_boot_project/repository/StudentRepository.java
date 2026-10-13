package com.pentasoft.university_spring_boot_project.repository;

import com.pentasoft.university_spring_boot_project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
