package com.learnquest.vehicles;

import com.learnquest.vehicles.Car;

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

    private int cargoCapacity;

    private int cargoLoad;

    public void setCargoLoad(int cargoLoad) {
        this.cargoLoad = cargoLoad;
    }

}
