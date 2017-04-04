package com.designpatterns.monster;

public class Skeleton extends Monster {

    public int health = 1;

    @Override
    public void attack() {
        System.out.println("I'm a fucking skeleton, bitch!");
    }
}
