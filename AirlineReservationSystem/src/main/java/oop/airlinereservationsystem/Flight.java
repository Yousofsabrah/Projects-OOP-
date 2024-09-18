package oop.airlinereservationsystem;

public class Flight {

    private int flightNumber;
    private int availableSeats;

    public Flight(int flightNumber, int availableSeats) {
        this.flightNumber = flightNumber;
        this.availableSeats = availableSeats;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void bookSeat() {
    if( availableSeats>0){
       availableSeats--;
        System.out.println("The seat has been reserved.");
    }else{
        System.out.println("There are no seats available.");
    }
    }

    @Override
    public String toString() {
        return "Flight{" + "flightNumber=" + flightNumber + ", availableSeats=" + availableSeats + '}';
    }
    
}
