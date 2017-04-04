package com.designpatterns.player;

import com.designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Observer> observers = new ArrayList<Observer>();
    private String name;
    private String state;
    private int health = 5;
    private String location = "Ballroom";

    public Player(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public String getState() {
        return state;
    }

    public int getHealth() { return health; }

    public void setState(String state) {
        this.state = state;
    }

    // Observer methods
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
