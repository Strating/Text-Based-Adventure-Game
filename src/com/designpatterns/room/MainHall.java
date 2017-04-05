package com.designpatterns.room;

import java.util.ArrayList;

public class MainHall implements Room {
    ArrayList options = new ArrayList<String>();

    @Override
    public ArrayList getArray(){
        options.add("Stairway");
        options.add("Ballroom");
        return options;
    }
    @Override
    public void init() {
        System.out.println("Main Hall");
    }
}
