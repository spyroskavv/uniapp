package com.pentasoft.university_spring_boot_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pentasoft.university_spring_boot_project.entity.Department;
import com.pentasoft.university_spring_boot_project.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Retrieve all departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Retrieve a department by its id
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }
}
