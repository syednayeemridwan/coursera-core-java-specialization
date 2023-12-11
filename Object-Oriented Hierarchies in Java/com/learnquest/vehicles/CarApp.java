package com.learnquest.vehicles;

import com.learnquest.vehicles.Car;
import com.learnquest.vehicles.Vehicle;
import com.learnquest.vehicles.StationWagon;
import com.learnquest.vehicles.SportsCar;

public class CarApp {
    public static void travelAtSpeedLimit(Vehicle someVehicle) {
        someVehicle.setSpeed(55);
    }

    public static void main(String[] args) {
        // StationWagon s = new StationWagon();
        // Car car1 = new Car();
        // car1.setName("Car 01");
        // car1.setSpeed(20);

        // Car car2 = new Car("Toyota", 120, 21, true);

        Car stationWagon1 = new StationWagon("Toyota Probox");
        stationWagon1.setSpeed(70);
        // stationWagon1.setCargoLoad(10); // This method is not accessible

        Car sportsCar = new SportsCar("Mach V", 250, 21, true);

        for (Vehicle vehicle : new Vehicle[] { stationWagon1, sportsCar }) {
            System.out.println("Name of the car is :" + vehicle.getName());
            System.out.println("Speed of the car is :" + vehicle.getSpeed());
            System.out.println("-------------------------");

        }
    }

}
