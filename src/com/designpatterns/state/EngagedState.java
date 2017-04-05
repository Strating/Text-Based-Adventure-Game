package com.designpatterns.state;

public class EngagedState implements State {
    @Override
    public void doAction(){
        System.out.println("You enter the engaged state");

    }
}
