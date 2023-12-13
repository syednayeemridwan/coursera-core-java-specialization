package com.learnquest.vehicles;

// import com.learnquest.vehicles.Car;

public class SportsCar extends Car {
    public SportsCar() {
        super();
    }

    public SportsCar(String name) {
        super(name);
    }

    public SportsCar(String name, int speed, int fuel, boolean running) {
        super(name, speed, fuel, running);
    }

    private int cargoLoad;

    public int getCargoLoad() {
        return cargoLoad;
    }

    public void setCargoLoad(int cargoLoad) {
        this.cargoLoad = cargoLoad;
    }

    @Override
    public String toString() {
        System.out.println("Name of the Sportscar = " + getName());
        System.out.println("Speed of the Sportscar = " + getSpeed());
        return "--------------";
    }
}
