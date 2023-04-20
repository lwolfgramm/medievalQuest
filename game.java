import java.util.Scanner

public class Game {

    Scanner scnr = new Scanner(System.in);
    int playerHP;
    int choice;
    String playerName;
    String playerWeapon;
    String playerArmor;

    public static void main(String[] args) {

        Game game;
        game = new game();

        game.playerSetup();
        game.townGate();

        
    }

    public void playerSetup() {

        playerHP = 15;
        playerWeapon = "Rusted Sword";
        playerArmor = "Leather Tunic";

        System.out.println("Your HP: " + playerHP);
        System.out.println("Your weapon: " + playerWeapon);
        System.out.println("Your armor: " + playerArmor);

        System.out.println("Please enter your name:");

        playerName = Scanner scnr.nextLine();

        System.out.println("Hello " + playerName + ", let's start your new adventure!");

    }

    //Beginning of narration

    public void townGate() {

        System.out.println("\n------------------------------------------\n");
        System.out.println("You start at the gate of town.");
        System.out.println("A guard is standing in front of you.");
        System.out.println("What do you want to do?");
        System.out.println();
        System.out.println("1: Talk to the guard");
        System.out.println("2: Attack the guard");
        System.out.println("3: Leave and enter woods");


        //player makes a choice
        choice = myScanner.nextInt();

        if(choice == 1) {
            System.out.println("Guard: Hello there " + playerName + "You should be on your way now to deliver the urgent message to the Northern realm!");
        }
        if(choice == 2) {
            System.out.println("Guard: Hey don't be stupid!\n\n The guard was stronger and you gave up.\n(You receive 1 damage)\n");

            //player takes damage
            playerHP = playerHP - 1;
            System.out.println("Your HP: " + playerHP);
        }
        if(choice == 3) {
            System.out.println("You've begun your quest to deliver this most important message. Be wary of what lurks in the woods.")
        }
        else(){
            townGate();
        }
    }

    public void crossRoad() {
        System.out.println("\n------------------------------------------\n");
        System.out.println("You are at a crossroad. If you go West you will go back to the Southern Town Gate.");
        System.out.println("1: Go north");
        System.out.println("2: Go east");
        System.out.println("3: Go west");
        System.out.println("\n------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice == 1) {
            north();
        }
        if(choice == 2) {
            east();
            
        }
        if(choice == 3) {
            townGate();
        }
        else() {
            crossRoad();
        
        }

    }

    public void north() {
        System.out.println("\n------------------------------------------\n");
        System.out.println("There is a Ease Tree ahead. You collect fruit and herbs for healing.");
        System.out.println("Your HP is recovered.");

        //player health goes up
        playerHP = playerHP + 1;
        System.out.println("Your HP: " + playerHP);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice == 1) {
            north();
        }
        if(choice == 2) {
            east();
            
        }
        if(choice == 3) {
            townGate();
        }
        else() {
            crossRoad();
        
        }

    }

    public void east() {
        System.out.println("\n------------------------------------------\n");
        System.out.println("You see an opening to a cave and found a Long Sword!");
        
        //player gains weapon
        playerWeapon = "Long Sword";
        System.out.println("Your Weapon: " + playerWeapon);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice == 1) {
            north();
        }
        if(choice == 2) {
            east();
            
        }
        if(choice == 3) {
            townGate();
        }
        else() {
            crossRoad();
        
        }

        
    }

    public void west() {
        System.out.println("\n------------------------------------------\n");
        System.out.println("You've chosen to go west. Without rest or substanance you circle back to the Southern Town Gate where you first started.\n(You receive 2 damage)\n");
        
        //player takes damage
        playerHP = playerHP - 2;
        System.out.println("Your HP: " + playerHP);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------\n");
    }






}