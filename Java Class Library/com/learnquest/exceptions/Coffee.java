package com.learnquest.exceptions;

public class Coffee implements CoffeeInterface {
    private int temperature;

    public Coffee(int temperature) {
        super();
        setTemperature(temperature);
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(int temperature) throws TooHotException {
        if (temperature > 120) {
            throw new TooHotException("The coffee is too hot!!!");
        }
        this.temperature = temperature;
    }
}
