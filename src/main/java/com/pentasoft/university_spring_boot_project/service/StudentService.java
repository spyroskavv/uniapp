package com.pentasoft.university_spring_boot_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pentasoft.university_spring_boot_project.entity.Student;
import com.pentasoft.university_spring_boot_project.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Retrieve all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Retrieve a student by their ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
    
    public void updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setTotalCredits(updatedStudent.getTotalCredits());
            existingStudent.setTotalHours(updatedStudent.getTotalHours());
            studentRepository.save(existingStudent);
        }
    }
    
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }    
}
