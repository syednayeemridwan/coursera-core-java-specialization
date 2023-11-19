// package com.demo2.something;

public class CarApp {
    public static void main(String[] args) {
        // StationWagon s = new StationWagon();
        Car car1 = new Car();
        car1.setName("Car 01");
        car1.setSpeed(20);

        Car car2 = new Car("Toyota", 120, 21, true);

        Car stationWagon1 = new StationWagon("Toyota Probox");
        stationWagon1.setSpeed(70);
        // stationWagon1.setCargoLoad(10); // This method is not accessible

        Car sportsCar = new SportsCar("Mach V", 250, 21, true);

        for (Car car : new Car[] { car1, car2, stationWagon1, sportsCar }) {
            System.out.println("Name of the car is :" + car.getName());
            System.out.println("Speed of the car is :" + car.getSpeed());
            System.out.println("Fuel of the car is :" + car.getFuel());
            System.out.println("The car is running :" + car.isRunning());
            System.out.println("-------------------------");

        }
    }

}
