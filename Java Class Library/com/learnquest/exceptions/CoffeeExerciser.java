package com.learnquest.exceptions;

public class CoffeeExerciser {
    public static void main(String[] args) {
        Coffee coffee = null;
        try {
            coffee = new Coffee(110);
        } catch (TooHotException e) {
            System.out.println(e.getMessage());
            System.out.println("The temperature of coffee is too hot");
            coffee.setTemperature(0);
            System.out.println("The temperature is now set to 0");
        } finally {
            System.out.println("The temperature of coffee is " + coffee.getTemperature());
        }
        // coffee.setTemperature(125);
    }
}
