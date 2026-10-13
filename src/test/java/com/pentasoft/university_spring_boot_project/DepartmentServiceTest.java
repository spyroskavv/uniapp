package com.pentasoft.university_spring_boot_project;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.pentasoft.university_spring_boot_project.entity.Department;
import com.pentasoft.university_spring_boot_project.repository.DepartmentRepository;
import com.pentasoft.university_spring_boot_project.service.DepartmentService;

@SpringBootTest
public class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @Test
    public void testGetAllDepartments() {
        Department dept1 = new Department();
        dept1.setId(1L);
        dept1.setName("IT");

        Department dept2 = new Department();
        dept2.setId(2L);
        dept2.setName("Physics");

        when(departmentRepository.findAll()).thenReturn(List.of(dept1, dept2));

        List<Department> departments = departmentService.getAllDepartments();
        assertEquals(2, departments.size());
        assertEquals("IT", departments.get(0).getName());
        assertEquals("Physics", departments.get(1).getName());
    }

    @Test
    public void testGetDepartmentById() {
        Department department = new Department();
        department.setId(1L);
        department.setName("IT");

        when(departmentRepository.findById(1L)).thenReturn(Optional.of(department));

        Department foundDepartment = departmentService.getDepartmentById(1L);
        assertNotNull(foundDepartment);
        assertEquals("IT", foundDepartment.getName());
    }

    @Test
    public void testGetDepartmentById_NotFound() {
        when(departmentRepository.findById(99L)).thenReturn(Optional.empty());

        Department foundDepartment = departmentService.getDepartmentById(99L);
        assertNull(foundDepartment);
    }
}
