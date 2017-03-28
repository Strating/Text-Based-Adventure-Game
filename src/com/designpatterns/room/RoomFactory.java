package com.designpatterns.room;

public class RoomFactory {

    public Room getRoom(String roomType){
        if(roomType == null){
            return null;
        }
        if(roomType.equalsIgnoreCase("STAIRWAY")){
            return new Stairway();
        } else if(roomType.equalsIgnoreCase("BALLROOM")){
            return new Ballroom();
        } else if(roomType.equalsIgnoreCase("BASEMENT")){
            return new Basement();
        } else if(roomType.equalsIgnoreCase("BEDROOM")){
            return new Bedroom();
        } else if(roomType.equalsIgnoreCase("KITCHEN")){
            return new Kitchen();
        }

        return null;
    }
}
