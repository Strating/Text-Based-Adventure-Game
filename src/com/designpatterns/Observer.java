package com.designpatterns;

import com.designpatterns.player.Player;

public abstract class Observer {
    protected Player player;
    public abstract void update();
}
