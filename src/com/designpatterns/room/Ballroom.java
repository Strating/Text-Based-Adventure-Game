package com.designpatterns.room;

import java.util.ArrayList;

public class Ballroom implements Room {
    ArrayList options = new ArrayList<String>();

    @Override
    public ArrayList getArray(){
        options.add("Main Hall");
        options.add("Kitchen");
        return options;
    }
    @Override
    public void init() {
        System.out.println("Ballroom");
    }
}
