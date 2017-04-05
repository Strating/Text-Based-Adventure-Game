package com.designpatterns.room;

import java.util.ArrayList;

public class StorageRoom implements Room {
    ArrayList options = new ArrayList<String>();

    @Override
    public ArrayList getArray(){
        options.add("Bedroom");
        return options;
    }
    @Override
    public void init() {
        System.out.println("Storage Room");
    }
}
