import com.designpatterns.StateObserver;
import com.designpatterns.monster.Skeleton;
import com.designpatterns.monster.Vampire;
import com.designpatterns.monster.Werewolf;
import com.designpatterns.monster.Zombie;
import com.designpatterns.player.Player;
import com.designpatterns.room.Room;
import com.designpatterns.room.RoomFactory;
import com.designpatterns.state.EngagedState;
import com.designpatterns.state.NavigationState;
import com.designpatterns.state.State;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomFactory roomFactory = new RoomFactory();
        Room room1 = roomFactory.getRoom("Stairway");
        Room room2 = roomFactory.getRoom("Ballroom");
        Room room3 = roomFactory.getRoom("Bedroom");
        Room room4 = roomFactory.getRoom("Kitchen");
        Room room5 = roomFactory.getRoom("Basement");
        State navigation = new NavigationState();
        State engaged = new EngagedState();

        System.out.print("Welcome to this text based adventure game! \n");
        System.out.print("First of all, what is your name? \n");

        String name = scanner.next();

        Player player = new Player(name);
        new StateObserver(player);

        System.out.println(String.format("Nice to meet you %s! \n", player.getName()));

        System.out.print("Welcome to the Text Based Adventure Game! \n");
        System.out.print("You were send here to save the princess, she is held captive somewhere in this castle. \n");
        System.out.print("Your goal is to find your way through the castle and fight off all monsters you might encounter. \n");
        System.out.print("Are you ready? (Yes/No) \n");

        String answer = scanner.next();

        if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y")) {
            System.out.print("Great! Off you go! \n");
        } else if (answer.equals("No") || answer.equals("no") || answer.equals("n") || answer.equals("N")) {
            System.out.print("I'm sorry but we've got no time to lose. Best of luck! \n");
        }

        System.out.print("*You pass through the big wooden frontgate of the castle* \n");

        System.out.println("Player enters navigation state");
        player.setState(navigation);


        //Navigation code
        if (player.getState() == navigation) {
            String location = player.getLocation();
            switch (location) {
                case "Ballroom":
                    new Main().getNavigationDialogue(location, room2.getArray());
            }

        }
    }

    public void getNavigationDialogue(String location, ArrayList options) {
        //Dynamische Dialogue voor room navigatie
        System.out.println(String.format("*You currently find yourself in the %s!*", location));
        System.out.println(String.format("You can navigate to: "));
        int i = 0;
        for (Object s : options) {
            System.out.println(i + " " + s);
            i++;
        }
        System.out.println(String.format("Where would you like to go?"));
    }


//        ** Randomized numbers **
//        Random rand = new Random();
//        int roomCount = rand.nextInt(4) + 1;
//        for (int i = 1; i <= roomCount; i++) {
//            System.out.print(rand.nextInt(i) + 1);
//        }

//        ** Monster Spawns **
//        Skeleton skeleton = new Skeleton();
//        skeleton.attack();
//        Zombie zombie = new Zombie();
//        zombie.attack();
//        Werewolf werewolf = new Werewolf();
//        werewolf.attack();
//        Vampire vampire = new Vampire();
//        vampire.attack();

//        System.out.println(String.format("Your current amount of health is %s! \n", player.getHealth()));
    }

