public class Inventory {

Inventory myInv= new Inventory ();



// Variables

private String weaponType;

private String armourType;

private int moneyAmt;



//Constructors

Public void Inventory (String weaponType, String armourType, int moneyAmt) {

This.weaponType = weapon;

This.armourType = armour;

This.moneyAmt = money;

This.curseType = curse;

This.potionType = potion;

This.ringType = ring;

This.cloakType = cloak;


//concept of the game = enter northern town
//how = go through woods
//gather items in woods, defeat opponents, and keep health up
//end you enter town



// Get/Set

Public String getWeapon ( ) {

Return weapon;

}

Public String getArmour ( ) {

Return armour;

}

Public int getMoney ( ) {

Return money;

}



Public void print ( ) {

System.out.println(“You’ve chosen a weapon!: ”);

Weapon.print();

System.out.println();



System.out.println(“You’ve chosen armour!: “);

Armour.print();

System.out.println();



System.out.println(“You’ve chosen money!: “);

Money.print();

System.out.prinln();
