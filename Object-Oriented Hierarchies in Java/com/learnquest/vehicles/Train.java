package com.learnquest.vehicles;

public class Train extends UnknownTrain implements Vehicle {

    public Train(String name) {
        super(name);
    }

    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public void setSpeed(int newSpeed) {
        setNewSpeed(newSpeed);
    }

    @Override
    public String toString() {
        System.out.println("Name of the train = " + getName());
        System.out.println("Speed of the train = " + getSpeed());
        return "--------------";
    }
}
