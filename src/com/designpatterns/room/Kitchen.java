package com.designpatterns.room;

import java.util.ArrayList;

public class Kitchen implements Room {
    ArrayList options = new ArrayList<String>();

    @Override
    public ArrayList getArray(){
        options.add("Ballroom");
        return options;
    }

    @Override
    public void init() {
        System.out.println("Kitchen");
    }
}
