package com.designpatterns.monster;

public abstract class Monster {
    protected abstract void attack();

    public final void spawn() {
        attack();
    }
}
