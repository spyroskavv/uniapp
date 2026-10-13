package com.pentasoft.university_spring_boot_project.controller;

import com.pentasoft.university_spring_boot_project.entity.Department;
import com.pentasoft.university_spring_boot_project.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public String getAllDepartments(Model model) {
        List<Department> departments = departmentService.getAllDepartments();
        model.addAttribute("departments", departments);
        return "departments";
    }

    @GetMapping("/departments/{id}")
    public String getDepartmentById(@PathVariable Long id, Model model) {
        Department department = departmentService.getDepartmentById(id);
        model.addAttribute("department", department);
        model.addAttribute("courses", department.getCourses());
        return "department-details";
    }
}
