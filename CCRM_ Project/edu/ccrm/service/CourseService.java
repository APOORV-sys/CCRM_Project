package edu.ccrm.service;

import edu.ccrm.domain.Course;
import java.util.List;
import java.util.stream.Collectors;

public class CourseService {
    private List<Course> courseDatabase; // Assume this list is initialized elsewhere

    public CourseService(List<Course> courseDatabase) {
        this.courseDatabase = courseDatabase;
    }

    // Example of filtering using a lambda expression
    public List<Course> findCoursesByDepartment(String department) {
        return courseDatabase.stream()
            .filter(course -> course.getDepartment().equalsIgnoreCase(department))
            .collect(Collectors.toList());
    }
}
