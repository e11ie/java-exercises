package org.launchcode.java.exercises.school;

import java.util.ArrayList;

public class Course {

    private static int nextCourseId = 1;
    private int courseId;
    private final String name;
    private ArrayList<Student> students;

    public Course(String name, int courseId,
                  ArrayList<Student> students) {
        this.name = name;
        this.courseId = courseId;
        this.students = students;
    }

    public Course(String name, ArrayList<Student> students) {
        this(name, nextCourseId, students);
        nextCourseId++;
    }

    /* Getters and Setters */

    public String getName() {
        return name;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCoursId() {
        courseId = nextCourseId;
        nextCourseId++;
    }

    public void setCourseId(int aCourseId) {
        courseId = aCourseId;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> someStudents) {
        students = someStudents;
    }
}
