package oop.systemmanagingschool;

public class Teacher extends Person {

    private  String subject;
    private  int numberOfYearsOfExperience;

    public Teacher(String name, int age, String address, String subject, int yearsOfExperience) {
        super(name, age, address);
        this.subject = subject;
        this.numberOfYearsOfExperience = yearsOfExperience;
    }

    public  String getSubjectHeTeach() {
        return subject;
    }

    public void setSubjectHeTeach(String subjectHeTeach) {
        this.subject = subjectHeTeach;
    }

    public  int getNumberOfYearsOfExperience() {
        return numberOfYearsOfExperience;
    }

    public void setNumberOfYearsOfExperience(int numberOfYearsOfExperience) {
        this.numberOfYearsOfExperience = numberOfYearsOfExperience;
    }

    public void Teach() {
        System.out.println(getName() + " is teaching " + subject);
    }

    @Override
    public String Role() {
        return "teacher";
    }

}
