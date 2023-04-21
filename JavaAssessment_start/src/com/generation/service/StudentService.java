package com.generation.service;

import com.generation.model.Course;
import com.generation.model.EnrolledCourse;
import com.generation.model.Student;

import java.util.HashMap;

public class StudentService
{
    private final HashMap<String, Student> students = new HashMap<>();

    public void registerStudent( Student student )
    {   //Option (1): Register Student
        //TODO Add new student to the students hashmap
        students.put(student.getId(), student);
    }

    public Student findStudent( String studentId )
    {   //Option (2): Find Student
        //TODO Find the student from the Hashmap with the student id
        return students.get(studentId);
    }

    public void enrollToCourse( String studentId, Course course )
    {   //Option (4): Enroll Student to Course
        //TODO check if students hashmap contains the studentsId, if not enroll student to the course
        //check if students hashmap contains the studentsId
        Student student = findStudent(studentId);
        if (student == null) {
            //if studentsId not found, create new student object with new studentsId
            student = new Student(studentId);
            //then add the new student object to the students hashmap
            registerStudent(student);
        }
        //enrol student to course
        student.enrollToCourse(course);

    }

    public void showSummary()
    {   //Option (5): Show Student Summary
        //TODO Loop through students hashmap and print out students' details including the enrolled courses
        for (Student student : students.values()) {
            System.out.println(student.toString());
        }
    }

    public HashMap<String, EnrolledCourse> enrolledCourses(Student student)
    {    //Option (3): Grade Student
        //TODO return a HashMap of all the enrolledCourses
        return student.getEnrolledCourses();
        //return null;
    }

    public Course findEnrolledCourse( Student student, String courseId ) {
        //Option (3): Grade Student
        //TODO return the course enrolled by the student from the course Id
       //Can't do this
            return null;

    }


    public void gradeStudent(Student student, Course course, double grade) {
        student.gradeCourse(course.getCode(), grade);
    }



    public HashMap<String, EnrolledCourse> getPassedCourses(Student student) {
        return student.findPassedCourses();
    }
}
