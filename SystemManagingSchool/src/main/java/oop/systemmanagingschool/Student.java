package oop.systemmanagingschool;

public class Student extends Person {

    private  String grade;
    private  String studentId;

      public Student(String name, int age, String address, String grade, String studentID) {
        super(name, age, address);
        this.grade = grade;
        this.studentId = studentID;
    }

    public  String getGrade() {
        return grade;
    }

    public  void setGrade(String grade) {
        this.grade = grade;
    }

    public  String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void Study() {
        System.out.println(getName() + " is studing in grade " + grade);
    }

    @Override
    public String Role() {
        return "student";
    }

}
