package com.designpatterns.player;

import com.designpatterns.observer.Observer;
import com.designpatterns.room.RoomFactory;
import com.designpatterns.state.State;

import java.util.ArrayList;
import java.util.List;

public class Player implements State {
    RoomFactory roomFactory = new RoomFactory();
    private State state;
    private List<Observer> observers = new ArrayList<Observer>();
    private String name;
    private int health = 5;
    private String location = "Main Hall";

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
        getDialogue(this, roomFactory);
//        notifyAllObservers();
    }
    public String getLocation() {
        return location;
    }

    public State getState() {
        return this.state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public int getHealth() { return health; }

    // Observer methods
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void getDialogue(Player player, RoomFactory roomFactory){
        this.state.getDialogue(this, roomFactory);
    }
}
