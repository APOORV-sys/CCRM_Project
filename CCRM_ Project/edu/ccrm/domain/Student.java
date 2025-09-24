package edu.ccrm.domain;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private final String regNo;
    private List<Enrollment> enrolledCourses;

    public Student(String id, String fullName, String email, String regNo) {
        super(id, fullName, email); // Call to superclass constructor
        this.regNo = regNo;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getRegNo() {
        return regNo;
    }

    // This is the implementation of the abstract method from Person
    @Override
    public String getProfileDetails() {
        return "Student Name: " + getFullName() + " | Registration No: " + regNo;
    }
}