
package edu.ccrm.service;

import edu.ccrm.domain.Course;
import edu.ccrm.domain.Student;
import edu.ccrm.util.MaxCreditLimitExceededException;

public class EnrollmentService {
    private static final int MAX_CREDITS_PER_SEMESTER = 21;

    public void enrollStudent(Student student, Course course) throws MaxCreditLimitExceededException {
        int currentCredits = 0; // Logic to calculate student's current credits would go here
        
        if (currentCredits + course.getCredits() > MAX_CREDITS_PER_SEMESTER) {
            // Throw the custom checked exception
            throw new MaxCreditLimitExceededException("Enrollment failed: Student exceeds the max credit limit of " + MAX_CREDITS_PER_SEMESTER);
        }

        // ... proceed with enrollment logic ...
        System.out.println("Student enrolled successfully!");
    }
}