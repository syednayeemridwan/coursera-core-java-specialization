package com.learnquest.vehicles;

// import com.learnquest.vehicles.Cargo;

public class StationWagon extends Cargo {
    public StationWagon() {
        super();
    }

    public StationWagon(String name) {
        super(name);
    }

    public StationWagon(String name, int speed, int fuel, boolean running) {
        super(name, speed, fuel, running);
    }

    @Override
    public String toString() {
        System.out.println("Name of the StationWagon = " + getName());
        System.out.println("Speed of the StationWagon = " + getSpeed());
        return "--------------";
    }
}
