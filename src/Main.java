import com.designpatterns.monster.Skeleton;
import com.designpatterns.monster.Vampire;
import com.designpatterns.monster.Werewolf;
import com.designpatterns.monster.Zombie;
import com.designpatterns.player.Player;
import com.designpatterns.room.Room;
import com.designpatterns.room.RoomFactory;

import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomFactory roomFactory = new RoomFactory();
        Room room1 = roomFactory.getRoom("Stairway");
        Room room2 = roomFactory.getRoom("Ballroom");
        Room room3 = roomFactory.getRoom("Bedroom");
        Room room4 = roomFactory.getRoom("Kitchen");
        Room room5 = roomFactory.getRoom("Basement");

        System.out.print("Welcome to this text based adventure game! \n");
        System.out.print("First of all, what is your name? \n");

        String name = scanner.next();

        Player player = new Player(name);

        System.out.println(String.format("Nice to meet you %s! \n", player.getName()));

        System.out.print("Welcome to the Text Based Adventure Game! \n");
        System.out.print("You were send here to save the princess, she is held captive somewhere in this castle. \n");
        System.out.print("Your goal is to find your way through the castle and fight off all monsters you might encounter. \n");
        System.out.print("Are you ready? (Yes/No) \n");

        String answer = scanner.next();

        if (answer.equals("Yes") || answer.equals("yes")) {
            System.out.print("Great! Off you go! \n");
        } else if (answer.equals("No") || answer.equals("no")){
            System.out.print("I'm sorry but we've got no time to lose. Best of luck! \n");
        }

        System.out.print("*You pass through the big wooden frontgate of the castle and find yourself in the main hall* \n");

        Random rand = new Random();
        int roomCount = rand.nextInt(4) + 1;
        for (int i = 1; i <= roomCount; i++) {
            System.out.print(rand.nextInt(i) + 1);
        }

        Skeleton skeleton = new Skeleton();
        skeleton.attack();
        Zombie zombie = new Zombie();
        zombie.attack();
        Werewolf werewolf = new Werewolf();
        werewolf.attack();
        Vampire vampire = new Vampire();
        vampire.attack();
    }
}
