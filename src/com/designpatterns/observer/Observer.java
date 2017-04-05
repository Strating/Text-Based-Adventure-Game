package com.designpatterns.observer;

import com.designpatterns.player.Player;

public abstract class Observer {
    protected Player player;
    public abstract void update();
}
