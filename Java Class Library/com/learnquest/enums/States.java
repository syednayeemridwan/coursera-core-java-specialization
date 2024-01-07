package com.learnquest.enums;

public enum States {
    UK("London"),
    Canada("Toronto"),
    Portugal("Lisbon");

    private String name;

    private States(String name) {
        super();
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
