package com.designpatterns.room;

import java.util.ArrayList;

public class Basement implements Room {
    ArrayList options = new ArrayList<String>();

    @Override
    public ArrayList getArray(){
        options.add("Stairway");
        options.add("Bossroom");
        return options;
    }

    @Override
    public void init() {
        System.out.println("Basement");
    }
}
