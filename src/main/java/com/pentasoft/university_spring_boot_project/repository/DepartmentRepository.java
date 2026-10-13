package com.pentasoft.university_spring_boot_project.repository;

import com.pentasoft.university_spring_boot_project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
