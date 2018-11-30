package org.launchcode.java.exercises.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private double totalQualityScore = 0.0;


    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    /* Constructers */

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }


    /* Overriders */

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }


    /* Instance Methods */

    public void addGrade(int courseCredits, double grade) {
        // Calculate individual course quality score
        double courseQualityScore = grade * courseCredits;

        // Update the appropriate fields: numberOfCredits, gpa, totalQualityScore
        this.totalQualityScore += courseQualityScore;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore / numberOfCredits;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        // freshman (0-29 credits), sophomore (30-59 credits), junior (60-89 credits), or senior (90+ credits)
        String gradeLevel;

        if (numberOfCredits < 30) {
            gradeLevel = "freshman";
        } else if (numberOfCredits < 60) {
            gradeLevel = "sophomore";
        } else if (numberOfCredits < 90) {
            gradeLevel = "junior";
        } else {
            gradeLevel = "senior";
        }

        return gradeLevel;
    }


    /* Getters and Setters */

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
}
