package oop.airlinereservationsystem;

public class Booking {

    private Passenger p1;
    private Flight f1;

    public Booking(Passenger p1, Flight f1) {
        this.p1 = p1;
        this.f1 = f1;
    }

    public Passenger getP1() {
        return p1;
    }

    public void setP1(Passenger p1) {
        this.p1 = p1;
    }

    public Flight getF1() {
        return f1;
    }

    public void setF1(Flight f1) {
        this.f1 = f1;
    }

    public Booking(Passenger p1) {
        this.p1 = p1;
    }

    public void confrimeBooking() {
        System.out.println("Booking confirme for " + p1.getName() + " on flight " + f1.getFlightNumber());
    }
}
