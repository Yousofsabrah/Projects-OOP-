package oop.cardealershipsystem;
//
//. مشروع نظام بيع السيارات (Car Dealership System)

import java.util.Scanner;

//الوصف:
//
//قم بإنشاء نظام لبيع السيارات يحتوي على فئات متعددة مثل Vehicle و Car و Truck و Motorcycle.
//الفئة Vehicle تحتوي على معلومات عامة عن المركبات مثل الموديل، العلامة التجارية، والسعر.
//الفئة Car تحتوي على معلومات إضافية مثل نوع الوقود وعدد الأبواب.
//الفئة Truck تحتوي على معلومات إضافية مثل سعة الحمولة.
//الفئة Motorcycle تحتوي على معلومات إضافية مثل نوع الدراجة.
//المهام:
//
//الفئة Vehicle تكون الفئة الرئيسية.
//الفئة Car ترث من الفئة Vehicle.
//الفئة Truck ترث من الفئة Vehicle.
//الفئة Motorcycle ترث من الفئة Vehicle.
//المتطلبات:
//
//إضافة مركبة جديدة.
//عرض قائمة السيارات المتاحة.
//البحث عن مركبة بناءً على المواصفات.
//بيع مركبة.
//. Car Dealership System Project
//Description:
//
//Create a car dealership system that has multiple classes like Vehicle, Car, Truck, and Motorcycle.
//The Vehicle class contains general information about the vehicles like model, brand, and price.
//The Car class contains additional information like fuel type and number of doors.
//The Truck class contains additional information like load capacity.
//The Motorcycle class contains additional information like bike type.
//Tasks:
//
//The Vehicle class is the main class.
//The Car class inherits from the Vehicle class.
//The Truck class inherits from the Vehicle class.
//The Motorcycle class inherits from the Vehicle class.
//Requirements:
//
//Add a new vehicle.
//View the list of available vehicles.
//Search for a vehicle based on specifications.
//Sell a vehicle.
public class CarDealershipSystem {

    public static void main(String[] args) {
        Car[] car1 = new Car[3];
        Truck[] t1 = new Truck[3];
        TheMotorcycle[] m1 = new TheMotorcycle[3];

        car1[0] = new Car("2019", "BMW", 100000, "Diesel", 4);
        car1[1] = new Car("2023", "Toyota", 123000, "Hybrid", 4);
        t1[0] = new Truck("2022", "Pickup Trucks", 150000, 500);
        t1[1] = new Truck("2015", "Flatbed Trucks", 40000, 1000);
        m1[0] = new TheMotorcycle("2020", "Harley-Davidson", 50000, "Dual-Sport Bikes");
        m1[1] = new TheMotorcycle("2020", "Honda", 70000, "Sport Bikes");

        Car.AddCar(car1, new Car("2019", "Hondai", 188800, "Diesel", 4), 2);
        System.out.println("=========================");
        //View the list of available vehicles.
        System.out.println("\navailable  motorCycle ");
        for (TheMotorcycle theMotorcycle : m1) {
            if (theMotorcycle != null) {
                System.out.println(theMotorcycle.getBrand());
            }
        }
        System.out.println("\navailable cars");
        for (Car CAR : car1) {
            if (CAR != null) {
                System.out.println(CAR.getBrand());
            }
        }
        System.out.println("\navailable Trucks");
        for (Truck truck : t1) {
            if (truck != null) {
                System.out.println(truck.getBrand());
            }
        }
        System.out.println("=========================");
        //Search for a vehicle based on specifications.
        System.out.println("\nsearch for cars");
        for (Car CAR : car1) {
            if (CAR != null) {
                if (CAR.getBrand() == "BMW" && CAR.getPrice() == 100000) {
                    System.out.println("Your request is available");
                    break;
                } else {
                    System.out.println("Your request is not available");
                    break;
                }
            }
        }
        System.out.println("\nsearch for Trucks");
        for (Truck truck : t1) {
            if (truck != null) {
                if (truck.getBrand() == "BMW" && truck.getPrice() == 100000) {
                    System.out.println("Your request is available");
                    break;
                } else {
                    System.out.println("Your request is not available");
                    break;
                }
            }
        }
        System.out.println("\nsearch for motorCycle");
        for (TheMotorcycle motorCycle : m1) {
            if (motorCycle != null) {
                if (motorCycle.getBrand() == "Honda" && motorCycle.getPrice() == 70000) {
                    System.out.println("Your request is available");
                    break;
                } else {
                    System.out.println("Your request is not available");
                    break;
                }
            }
        }

        //Sell a vehicle.
        car1[0].IsSold();
        t1[0].IsSold();
        m1[0].IsSold();;

    }
}
