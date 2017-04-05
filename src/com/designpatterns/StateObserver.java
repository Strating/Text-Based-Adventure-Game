package com.designpatterns;

import com.designpatterns.observer.Observer;
import com.designpatterns.player.Player;

public class StateObserver extends Observer {

    public StateObserver(Player player) {
        this.player = player;
        this.player.attach(this);
    }

    @Override
    public void update() {
        System.out.print(player.getState());
    }
}
