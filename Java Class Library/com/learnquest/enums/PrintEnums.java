package com.learnquest.enums;

public class PrintEnums {
    public static void main(String[] args) {
        for (TirePressures tp : TirePressures.values()) {
            System.out.println(tp + " has name = " + tp.getName() + " and pressure of = " + tp.getPressure());
        }

        TirePressures tp = TirePressures.LR;
        tp.overridePressure(20);
        System.out.println(tp + " has name = " + tp.getName() + " and pressure of = " + tp.getPressure());

    }
}
