package com.designpatterns.room;
import java.util.ArrayList;
import java.util.List;

public class Stairway implements Room {
    ArrayList options = new ArrayList<String>();

    @Override
    public ArrayList getArray(){
        options.add("Main Hall");
        options.add("Basement");
        options.add("Bedroom");
        return options;
    }

    @Override
    public void init() {
        System.out.println("Stairway");
    }
}
