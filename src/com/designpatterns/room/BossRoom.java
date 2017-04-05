package com.designpatterns.room;

import java.util.ArrayList;

public class BossRoom implements Room {
    ArrayList options = new ArrayList<String>();

    @Override
    public ArrayList getArray(){
        options.add("Basement");
        return options;
    }
    @Override
    public void init() {
        System.out.println("Bossroom");
    }
}
