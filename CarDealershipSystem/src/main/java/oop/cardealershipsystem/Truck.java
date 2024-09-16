package oop.cardealershipsystem;

public class Truck extends Vehicle {

    private int loadCapacity;
    boolean isSold;

    public Truck(String model, String brand, int price, int loadCapacity) {
        super(model, brand, price);
        this.loadCapacity = loadCapacity;
        this.isSold = false;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public static void AddTruck(Truck[] t1, Truck t, int index) {
        if (index < t1.length) {
            t1[index] = t;
            System.out.println(t.getBrand() + " has been added ");
        } else {
            System.out.println("No space available to add the truck");
        }

    }

    public void IsSold() {
        if (this.isSold) {
            System.out.println("\n Sorry,This truck is sold.");
        } else {
            System.out.println("\n congratulations ,now the truck for you!");
            this.isSold = true;
        }
    }

}
