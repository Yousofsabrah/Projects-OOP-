package oop.studentmanagementsystem;

public class Course {

    private String courseId;
    private String CourseName;
    private String teacher;

    public Course(String courseId, String CourseName, String teacher) {
        this.courseId = courseId;
        this.CourseName = CourseName;
        this.teacher = teacher;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public boolean AddStudent(Student s) {
        if (s.getCoursesEnrolledIn() == getCourseName()) {
            return true;
        }
        return false;
    }

    public boolean AddTeacher(Teacher t) {
        if (t.getCoursesTaughtByTheTeacher() == getCourseName()) {
            return true;
        }
        return false;

    }
}
