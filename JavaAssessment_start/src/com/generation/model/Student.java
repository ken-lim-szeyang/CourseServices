package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Student extends Person
{
    public static final double PASS_MIN_GRADE = 3.0;

    private final HashMap<String, EnrolledCourse> enrolledCourses = new HashMap<>();


    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public boolean enrollToCourse( Course course )
    {   //Option (4): Enroll Student to Course
        //TODO Check if student has already enrolled to the course, if not add the course to enrolledCourses hashmap

        // Check if student has already enrolled to the course
        if (enrolledCourses.containsKey(course.getCode())) {
            System.out.println("Student " + this.getId() + " is already enrolled in course " + course.getCode());
            return false;
        }
        // Add the course to enrolledCourses hashmap
        enrolledCourses.put(course.getCode(), new EnrolledCourse(course));
        System.out.println("Student " + this.getId() + " has now been enrolled in course " + course.getCode());
        return true;

    }

    public HashMap<String, EnrolledCourse> getEnrolledCourses()
    {   //Option (5): Show Student Summary
        //TODO return a Hashmap of all the enrolledCourses
        return enrolledCourses;
    }

    public void gradeCourse( String courseCode, double grade )
    {   //Option (3): Grade Student
        //TODO set the grade for the enrolled Course

        // Check if the student is enrolled in the given course
        if (!enrolledCourses.containsKey(courseCode)) {
            System.out.println("Student " + this.getId() + " is not enrolled in course " + courseCode);
            return;
        }

        // Check if the given grade is within the valid range (1 to 6)
        if (grade < 1 || grade > 6) {
            System.out.println("Invalid grade. Grade must be between 1 and 6 inclusive.");
            return;
        }

        // Set the grade for the enrolled course
        enrolledCourses.get(courseCode).setGrade(grade);
        System.out.println("Grade " + grade + " has been set for student " + this.getId() + " in course " + courseCode);

    }

    public Course findCourseById( String courseId )
    {    //Option (3): Grade Student
        //TODO return the enrolled courses with the course Id
        //Can't do this
        return null;
    }

    public HashMap<String, EnrolledCourse> findPassedCourses()
    {   //Option (7): Show Passed Course
        //TODO Check the enrolled courses grade and compare to the passing grade

        //Can't do this

        return null;
    }

    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
