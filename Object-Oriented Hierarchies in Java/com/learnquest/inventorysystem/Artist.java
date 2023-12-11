package com.learnquest.inventorysystem;

public class Artist {
    private String name;
    private String memberNames[] = new String[20];
    private String memberInstruments[] = new String[20];

    public Artist(String name) {
        super();
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
