package com.designpatterns.state;
import com.designpatterns.player.Player;
import com.designpatterns.room.RoomFactory;

import java.util.ArrayList;

public interface State {
    public void getDialogue(Player player, RoomFactory roomFactory);
}
