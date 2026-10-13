package com.pentasoft.university_spring_boot_project;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.pentasoft.university_spring_boot_project.entity.Course;
import com.pentasoft.university_spring_boot_project.repository.CourseRepository;
import com.pentasoft.university_spring_boot_project.service.CourseService;

@SpringBootTest
public class CourseServiceTest {

    @Autowired
    private CourseService courseService;

    @MockBean
    private CourseRepository courseRepository;

    @Test
    public void testGetCourseById() {
        Course course = new Course();
        course.setId(1L);
        course.setName("Algorithms");

        when(courseRepository.findById(1L)).thenReturn(Optional.of(course));

        Course foundCourse = courseService.getCourseById(1L);
        assertNotNull(foundCourse);
        assertEquals("Algorithms", foundCourse.getName());
    }

    @Test
    public void testGetCourseById_NotFound() {
        when(courseRepository.findById(99L)).thenReturn(Optional.empty());

        Course foundCourse = courseService.getCourseById(99L);
        assertNull(foundCourse);
    }
}
