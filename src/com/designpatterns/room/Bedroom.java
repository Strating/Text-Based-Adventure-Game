package com.designpatterns.room;

import java.util.ArrayList;

public class Bedroom implements Room {
    ArrayList options = new ArrayList<String>();

    @Override
    public ArrayList getArray(){
        options.add("Stairway");
        options.add("Storage Room");
        return options;
    }
    @Override
    public void init() {
        System.out.println("Bedroom");
    }
}
