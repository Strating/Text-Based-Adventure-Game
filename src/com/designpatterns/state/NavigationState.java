package com.designpatterns.state;
import com.designpatterns.player.Player;
import com.designpatterns.room.Room;
import com.designpatterns.room.RoomFactory;

import java.util.ArrayList;

public class NavigationState implements State {

    @Override
    public void getDialogue(Player player, RoomFactory roomFactory){
        System.out.println("You find yourself in the " + player.getLocation());
        Room room = roomFactory.getRoom(player.getLocation());
        System.out.println("Your options of navigation are: ");
        int i = 0;
        for (Object s : room.getArray()) {
            System.out.println(i + " " + s);
            i++;
        }
        System.out.println("Where would you like to go? ");
    }
}
