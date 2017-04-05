package com.designpatterns.state;


public class NavigationState implements State {
    @Override
    public void doAction(){
        System.out.println("You enter the navigation state");
    }
}
