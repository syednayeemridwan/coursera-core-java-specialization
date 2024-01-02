package com.learnquest.collections;

import java.util.*;

public class ArtistExerciser {
    public static void main(String[] args) {
        Artist hotPlate = new Artist();

        TreeSet<String> instruments1 = new TreeSet<>();
        instruments1.add("Piano");
        instruments1.add("Clarinet");
        instruments1.add("Hurdy Gurdy");
        instruments1.add("Tuba");
        hotPlate.addMember("Tom", instruments1);

        TreeSet<String> instruments2 = new TreeSet<>();
        instruments2.add("Piano");
        instruments2.add("Flute");
        instruments2.add("Tuba");
        instruments2.add("Tuba");
        hotPlate.addMember("Steve", instruments2);

        printMemberInstruments(hotPlate, "Tom");
        printMemberInstruments(hotPlate, "Steve");
    }

    private static void printMemberInstruments(Artist artist, String memberName) {
        System.out.println("Member " + memberName + " plays: \n");
        SortedSet<String> memberInstruments = artist.getInstruments(memberName);
        for (String instrument : memberInstruments) {
            System.out.println("\t " + instrument);
        }
    }
}
