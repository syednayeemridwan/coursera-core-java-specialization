package com.learnquest.vehicles;

public interface Vehicle {
    public String getName();

    public void setName(String name);

    public int getSpeed();

    public void setSpeed(int newSpeed);

    public default void stop() {
        setSpeed(0);
    }

    public default void slow() {
        setSpeed(getSpeed() - 10);
    }

    public static void travelAtSpeedLimit(Vehicle someVehicle) {
        someVehicle.setSpeed(55);
    }

    public static void vehiclePrinter(Vehicle[] vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            // System.out.println("Name of the car is :" + vehicle.getName());
            // System.out.println("Speed of the car is :" + vehicle.getSpeed());
            // System.out.println("-------------------------");
            System.out.println(vehicle);

        }
    }
}