package oop.airlinereservationsystem;

public class Passenger extends Person {

    private String passportNumber;

    public Passenger(String passportNumber, String name, int age) {
        super(name, age);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return super.toString()+ "Passenger{" + "passportNumber=" + passportNumber + '}';
    }
    

}
