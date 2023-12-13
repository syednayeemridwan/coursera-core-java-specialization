package com.learnquest.vehicles;

public class UnknownTrain {
    private String name;
    private int newSpeed;

    public int getNewSpeed() {
        return newSpeed;
    }

    public void setNewSpeed(int newSpeed) {
        this.newSpeed = newSpeed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnknownTrain() {
        super();
    }

    public UnknownTrain(String name) {
        setName(name);
    }

}
