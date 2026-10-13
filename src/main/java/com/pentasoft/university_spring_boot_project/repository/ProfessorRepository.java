package com.pentasoft.university_spring_boot_project.repository;

import com.pentasoft.university_spring_boot_project.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
