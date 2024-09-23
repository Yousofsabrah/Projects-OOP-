package oop.systemmanagingschool;

public class Administrator extends Person {

    private  String Position;
    private  int numberOfYearsOfExperience;

      public Administrator(String name, int age, String address, String position, int yearsOfExperience) {
        super(name, age, address);
        this.Position = position;
        this.numberOfYearsOfExperience = yearsOfExperience;
    }


    public  String getPosition() {
        return Position;
    }

    public void setAdministrativePosition(String Position) {
        this.Position = Position;
    }

    public  int getNumberOfYearsOfExperience() {
        return numberOfYearsOfExperience;
    }

    public void setNumberOfYearsOfExperience(int numberOfYearsOfExperience) {
        this.numberOfYearsOfExperience = numberOfYearsOfExperience;
    }

    public void Manage() {
        System.out.println(getName() + " is managing " + Position);
    }

    @Override
    public String Role() {
        return "administrator";
    }

}
