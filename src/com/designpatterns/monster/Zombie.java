package com.designpatterns.monster;

public class Zombie extends Monster {
    @Override
    public void attack() {
        System.out.println("I eat brains, asshole!");
    }
}
