// package com.something.somepack;

public class Car {
    private String name;
    private int speed;

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

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Nissan");
        car1.setSpeed(40);
        Car car2 = new Car();
        car2.setName("Toyota");
        car2.setSpeed(45);

        Car carList[] = new Car[2];
        carList[0] = car1;
        carList[1] = car2;

        for (Car car : carList) {
            System.out.println("Car " + car.getName() + " has speed of " + car.getSpeed() + " kmph");
        }

    }

}
