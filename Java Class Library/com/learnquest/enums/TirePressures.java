package com.learnquest.enums;

public enum TirePressures {
    LF(30, "Left Front"),
    RF(30, "Right Front"),
    LR(32, "Left Rear"),
    RR(32, "Right Read");

    private int pressure;
    private String name;

    private TirePressures(int pressure, String name) {
        super();
        setName(name);
        setPressure(pressure);
    }

    public int getPressure() {
        return pressure;
    }

    public String getName() {
        return name;
    }

    private void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void overridePressure(int pressure) {
        this.pressure = pressure;
    }

    private void setName(String name) {
        this.name = name;
    }

}
