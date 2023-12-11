package com.learnquest.vehicles;

import com.learnquest.vehicles.Vehicle;

public abstract class Car implements Vehicle {
    private static final int MAX_SPEED = 100;
    private String name;
    private int speed;
    private int fuel;
    private boolean running;

    public Car() {
    }

    public Car(String name, int speed, int fuel, boolean running) {
        setName(name);
        setSpeed(speed);
        setFuel(fuel);
        setRunning(running);

    }

    public Car(String name) {
        this(name, 0, 0, false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

}
