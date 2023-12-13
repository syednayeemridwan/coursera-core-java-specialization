package com.learnquest.vehicles;

// import com.learnquest.vehicles.Car;

public class Cargo extends Car {

    public Cargo() {
        super();
    }

    public Cargo(String name) {
        super(name);
    }

    public Cargo(String name, int speed, int fuel, boolean running) {
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
    public void setSpeed(int speed) {
        // Changing logic of parent method inside child method
        super.setSpeed(speed - getCargoLoad() / 10);
    }
}
