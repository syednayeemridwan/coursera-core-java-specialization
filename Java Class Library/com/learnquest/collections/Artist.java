package com.learnquest.collections;

import java.util.*;

public class Artist {
    private String name;
    private SortedSet<String> memberNames;
    private Map<String, SortedSet<String>> memberInstruments;

    public Artist() {
        super();
        this.memberNames = new TreeSet<>();
        this.memberInstruments = new TreeMap<>();
    }

    public Artist(String name) {
        super();
        this();
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<String> getMembers() {
        return this.memberNames;
    }

    public SortedSet<String> getInstruments(String name) {
        return this.memberInstruments.get(name);
    }

    public void addMember(String name, SortedSet<String> instruments) {
        this.memberNames.add(name);
        this.memberInstruments.put(name, instruments);
    }

}
