package oop.studentmanagementsystem;

public class Teacher extends Person {

    private String teacherId;
    private String coursesTaughtByTheTeacher;

    public Teacher(String teacherId, String coursesTaughtByTheTeacher, String name, String address, int age) {
        super(name, address, age);
        this.teacherId = teacherId;
        this.coursesTaughtByTheTeacher = coursesTaughtByTheTeacher;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getCoursesTaughtByTheTeacher() {
        return coursesTaughtByTheTeacher;
    }

    public void setCoursesTaughtByTheTeacher(String coursesTaughtByTheTeacher) {
        this.coursesTaughtByTheTeacher = coursesTaughtByTheTeacher;
    }

}
