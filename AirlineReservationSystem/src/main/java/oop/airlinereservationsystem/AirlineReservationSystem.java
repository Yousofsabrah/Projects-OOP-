package oop.airlinereservationsystem;
//Design and implement an airline reservation system using Java. The system should include the following classes:
//
//Class Person:
//
//Represents a person in general. It should have the properties name and age.
//Use inheritance to create a Passenger class that extends from the Person class.
//Class Passenger:
//
//Represents a passenger. It should have the properties name, age, and passportNumber.
//Class Flight:
//
//Represents a flight. It should have the properties flightNumber and availableSeats.
//The class should include a method bookSeat() that books a seat and updates the available seats.
//Use encapsulation to hide the internal properties and allow access only through methods.
//Class Booking:
//
//Represents a flight booking. It should have objects of Passenger and Flight.
//The class should include a method confirmBooking() to confirm the booking and display the passenger and flight details.
//Requirements:
//
//Use inheritance to enhance code reuse between classes.
//Use encapsulation to protect the private data within the classes.
//Create objects from the classes and test the system by booking a flight for a specific passenger.
//Write the Java code and explain how the system works.

public class AirlineReservationSystem {

    public static void main(String[] args) {
        //String passportNumber, String name, int age
        Passenger passenger1 = new Passenger("1123456", "yousof", 19);
        //int flightNumber, int availableSeats 
        int AvailableSeats = 150;
        Flight flight1 = new Flight(100, AvailableSeats);
        //Passenger p1, Flight f1
        Booking book1 = new Booking(passenger1, flight1);
        flight1.bookSeat();
        AvailableSeats--;
        if (AvailableSeats == flight1.getAvailableSeats()) {
            book1.confrimeBooking();
        } else {
            System.out.println("No avalible seats.");
        }
    }
}
