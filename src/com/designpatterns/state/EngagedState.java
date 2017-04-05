package com.designpatterns.state;
import com.designpatterns.player.Player;
import com.designpatterns.room.RoomFactory;

import java.util.ArrayList;

public class EngagedState implements State {
    @Override
    public void getDialogue(Player player, RoomFactory roomFactory){
        System.out.println("You enter the engaged state");

    }
}
