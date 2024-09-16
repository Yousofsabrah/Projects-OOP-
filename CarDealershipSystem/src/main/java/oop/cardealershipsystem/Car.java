package oop.cardealershipsystem;

/**
 *
 * @author youse
 */
public class Car extends Vehicle {

    private String fuelType;
    private int numberOfDoors;
    boolean isSold;

    public Car(String model, String brand, int price, String fuelType, int numberOfDoors) {
        super(model, brand, price);
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        this.isSold=false;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public static void AddCar(Car[] c1, Car c, int index) {
        if (index < c1.length) {
            c1[index] = c;
            System.out.println(c.getBrand() + " has been added ");
        } else {
            System.out.println("No space available to add the car");
        }
    }
    public void IsSold() {
        if (this.isSold) {
            System.out.println("\n Sorry,This Car is sold.");
        } else {
            System.out.println("\n congratulations ,now the Car for you!");
            this.isSold = true;
        }
    }
}
