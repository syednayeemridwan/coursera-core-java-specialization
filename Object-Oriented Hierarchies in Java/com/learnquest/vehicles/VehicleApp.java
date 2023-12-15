package com.learnquest.vehicles;

import java.util.Arrays;
import java.util.List;

// import com.learnquest.vehicles.Car;
// import com.learnquest.vehicles.Vehicle;
// import com.learnquest.vehicles.StationWagon;
// import com.learnquest.vehicles.SportsCar;

public class VehicleApp {

    public static void main(String[] args) {
        Train train = new Train("Aldean Express");

        Car stationWagon1 = new StationWagon("Toyota Probox");
        stationWagon1.setSpeed(70);
        // stationWagon1.setCargoLoad(10); // This method is not accessible

        Car sportsCar = new SportsCar("Mach V", 250, 21, true);
        System.out.println("\n######## Printing with static method from Interface ###########\n");
        Vehicle vehicleList[] = new Vehicle[] { stationWagon1, sportsCar, train };
        Vehicle.vehiclePrinter(vehicleList);
        System.out.println("\n######## Printing with lambda  ###########\n");
        List<Vehicle> vehicleList2 = Arrays.asList(stationWagon1, sportsCar, train);
        // Lambda example 1
        vehicleList2.forEach(vehicle -> System.out.println(vehicle));
        System.out.println("\n######## Printing with method reference ###########\n");
        // Lambda example 2
        vehicleList2.forEach(System.out::println);

    }

}
