package oop.cardealershipsystem;

public class TheMotorcycle extends Vehicle {

    private String bikeType;
    boolean isSold;

    public TheMotorcycle(String model, String brand, int price, String bikeType) {
        super(model, brand, price);
        this.bikeType = bikeType;
        this.isSold = false;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public static void AddMotorcycle(TheMotorcycle[] m1, TheMotorcycle m, int index) {
        if (index < m1.length) {
            m1[index] = m;
            System.out.println(m.getBrand() + " has been added ");
        } else {
            System.out.println("No space available to add the motorCycle");
        }
    }

    public void IsSold() {
        if (this.isSold) {
            System.out.println("\n Sorry,This motorCycle is sold.");
        } else {
            System.out.println("\n congratulations ,now the motorCycle for you!");
            this.isSold = true;
        }
    }

}
