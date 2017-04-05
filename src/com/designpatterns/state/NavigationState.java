package com.designpatterns.state;
import com.designpatterns.player.Player;
import com.designpatterns.room.Room;
import com.designpatterns.room.RoomFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class NavigationState implements State {

    @Override
    public void getDialogue(Player player, RoomFactory roomFactory){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You find yourself in the " + player.getLocation());
        Room room = roomFactory.getRoom(player.getLocation());
        System.out.println("Your options of navigation are: ");
        int i = 0;
        for (Object s : room.getArray()) {
            System.out.println(i + " " + s);
            i++;
        }
        System.out.println("Where would you like to go? ");

        String answer = scanner.next();
        if(Integer.parseInt(answer) > i){
            System.out.println("Thats not a valid option, since you dont want to think about your choices, I'll decide for you ");
            System.out.println("* You proceed to the "+ room.getArray().get(i) + " *");
            player.setLocation(room.getArray().get(i).toString());
        } else {
            System.out.println("*You proceed to the "+ room.getArray().get(Integer.parseInt(answer)) + " *");
            player.setLocation(room.getArray().get(Integer.parseInt(answer)).toString());
        }
    }
}
