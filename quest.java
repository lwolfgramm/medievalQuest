public class Quest {

    public static void main(String[] args) {

        System.out.println("You are walking in the woods.");

        String playerName;
        String playerWeapon;
        String playerArmor;

        playerWeapon; = "Rusted Sword";
        playerArmor = "Leather Tunic";

        System.out.println("Your current weapon is " + playerWeapon);
        System.out.println("Your current armor is " + playerArmor);

        int playerHP;

        playerHP = 10;

        System.out.println("Your current health points is " + playerHP);

        System.out.println("While walking you stumble upon a pond and as you approach it, a giant serpent surfaces and wraps around your legs. The attack cost you 4 damage! ")

        playerHP = playerHP - 4;

        System.out.println("Your current health points is " + playerHP);

    }

}