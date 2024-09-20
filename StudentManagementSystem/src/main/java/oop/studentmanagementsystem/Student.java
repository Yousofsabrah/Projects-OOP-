package oop.studentmanagementsystem;

class Student extends Person {

    private String studentId;
    private String coursesEnrolledIn;

    public Student(String studentId, String coursesEnrolledIn, String name, String address, int age) {
        super(name, address, age);
        this.studentId = studentId;
        this.coursesEnrolledIn = coursesEnrolledIn;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCoursesEnrolledIn() {
        return coursesEnrolledIn;
    }

    public void setCoursesEnrolledIn(String coursesEnrolledIn) {
        this.coursesEnrolledIn = coursesEnrolledIn;
    }

}
