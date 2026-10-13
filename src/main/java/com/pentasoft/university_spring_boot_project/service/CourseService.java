package com.pentasoft.university_spring_boot_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pentasoft.university_spring_boot_project.entity.Course;
import com.pentasoft.university_spring_boot_project.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    // Retrieve all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
        }

    // Retrieve a course by its ID
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }
    
    public void updateCourse(Long id, Course updatedCourse) {
        Course existingCourse = courseRepository.findById(id).orElse(null);
        if (existingCourse != null) {
            existingCourse.setName(updatedCourse.getName());
            existingCourse.setCredits(updatedCourse.getCredits());
            existingCourse.setDuration(updatedCourse.getDuration());
            existingCourse.setMandatory(updatedCourse.getMandatory());
            courseRepository.save(existingCourse);
        }
    }
    
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }    
}
