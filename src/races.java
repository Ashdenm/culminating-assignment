import javax.swing.JOptionPane;

public class races {
    //creates variables to be called later
    Object races[] = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Half-Orc", "Halfling", "Human", "Tiefling"};
    Object dbSubraces[] = {"Black", "Blue", "Green", "Red", "White", "Brass", "Bronze", "Copper", "Gold", "Silver"};
    Object dwarfSubraces[] = {"Hill", "Mountain"};
    Object elfSubraces[] = {"High", "Wood"};
    Object halflingSubraces[] = {"Lightfoot", "Stout"};
    Object heAbilities[] = {"str", "dex", "con", "int", "wis"};
    static String userRace;
    boolean darkvision = false;
    static String breathweapon;
    int bWDmg;
    int bWDC;
    static String resistance;
    static int speed = 30;
    static int bonusHP;

    public void race() {
        userRace = (String)JOptionPane.showInputDialog(null, "Choose a race", "Race choice", JOptionPane.QUESTION_MESSAGE, null,  races, "Dragonborn"); //lets user choose race
        if (userRace == "Dragonborn") { //racial bonuses for Dragonborn
            stats.str = stats.str + 2;
            stats.cha++;
            bWDC = 8 + stats.conMod + App.proficiency; 
            if (App.level < 6) {
                bWDmg = 2;
            } else if (App.level > 5 && App.level < 11) {
                bWDmg = 3;
            } else if (App.level < 10 && App.level > 16) {
                bWDmg = 4;
            } else {
                bWDmg = 5;
            }
            
            String uDBSubrace = (String)JOptionPane.showInputDialog(null, "Choose a subrace", "Subrace choice", JOptionPane.QUESTION_MESSAGE, null,  dbSubraces, "Black"); //dragonborn subraces
            if (uDBSubrace == "Black" || uDBSubrace == "Copper") {
                breathweapon = "Breath weapon: Acid, 5 by 30 ft. line, dex save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Acid";
            } else if (uDBSubrace == "Blue" || uDBSubrace == "Bronze") {
                breathweapon = "Breath weapon: Lightning, 5 by 30 ft. line, dex save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Lightning";
            } else if (uDBSubrace == "Brass") {
                breathweapon = "Breath weapon: Fire, 5 by 30 ft. line, dex save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Fire";
            } else if (uDBSubrace == "Gold" || uDBSubrace == "Red") {
                breathweapon = "Breath weapon: Fire, 15 ft. cone, dex save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Fire";
            } else if (uDBSubrace == "Copper") {
                breathweapon = "Breath weapon: Acid, 5 by 30 ft. line, dex save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Acid";
            } else if (uDBSubrace == "Green") {
                breathweapon = "Breath weapon: Poison, 15 ft. cone, con save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Poison";
            } else if (uDBSubrace == "Silver" || uDBSubrace == "White") {
                breathweapon = "Breath weapon: Cold, 15 ft. cone, con save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Breath weapon: Cold";
            }
        } else if (userRace == "Dwarf") { //racials for dwarves
            stats.con = stats.con + 2;
            darkvision = true;
            speed = 25;
            String uDwarfSubrace = (String)JOptionPane.showInputDialog(null, "Choose a subrace", "Subrace choice", JOptionPane.QUESTION_MESSAGE, null,  dwarfSubraces, "Hill"); //dwarf subraces
            if (uDwarfSubrace == "Hill") {
                stats.wis++;
                bonusHP = App.level;
            } else {
                stats.str = stats.str + 2;
            }
        } else if (userRace == "Elf") { //racials for elves
            stats.dex = stats.dex + 2;
            darkvision = true;
            String uElfSubrace = (String)JOptionPane.showInputDialog(null, "Choose a subrace", "Subrace choice", JOptionPane.QUESTION_MESSAGE, null,  elfSubraces, "High"); //elf subraces
            if (uElfSubrace == "High") {
                stats.inte++;
            } else {
                stats.wis++;
                speed = 35;
            }
        } else if (userRace == "Gnome") { //racials for gnomes
            stats.inte = stats.inte + 2;
            stats.con++;
            darkvision = true;
            speed = 25;
        } else if (userRace == "Half-Elf") { //racials for half-elves
            stats.cha = stats.cha + 2;
            resistance = "Adv. on saves against charmed, cant be put to sleep magically";
            String asi1 = (String)JOptionPane.showInputDialog(null, "Choose an ability to increase by 1", "Half-elf asi", JOptionPane.PLAIN_MESSAGE, null, heAbilities, "str");
            if (asi1 == "str") { //half-elves get a lot of ability score increases
                stats.str++;
            } else if (asi1 == "dex") {
                stats.dex++;
            } else if (asi1 == "con") {
                stats.con++;
            } else if (asi1 == "int") {
                stats.inte++;
            } else {
                stats.wis++;
            }
            String asi2 = (String)JOptionPane.showInputDialog(null, "Choose a different ability to increase by 1", "Half-elf asi 2", JOptionPane.PLAIN_MESSAGE, null, heAbilities, "str");
            while (asi2 == asi1) {
                asi2 = (String)JOptionPane.showInputDialog(null, "Choose a different ability to increase by 1", "Half-elf asi 2", JOptionPane.ERROR_MESSAGE, null, heAbilities, "str");
            }
            if (asi2 == "str") {
                stats.str++;
            } else if (asi2 == "dex") {
                stats.dex++;
            } else if (asi2 == "con") {
                stats.con++;
            } else if (asi2 == "int") {
                stats.inte++;
            } else {
                stats.wis++;
            }
            darkvision = true;
        } else if (userRace == "Half-Orc") { //racials for half-orcs
            stats.str = stats.str + 2;
            stats.con++;
            darkvision = true;
        } else if (userRace == "Halfling") { //racials for halflings
            stats.dex = stats.dex + 2;
            String uHLSubrace = (String)JOptionPane.showInputDialog(null, "Choose a subrace", "Subrace choice", JOptionPane.QUESTION_MESSAGE, null,  halflingSubraces, "Lightfoot"); //halfling subraces
            if (uHLSubrace == "Lightfoot") {
                stats.cha++;
            } else {
                stats.con++;
                resistance = "Adv. on saves against poison, Resistance to poison dmg";
            }
        } else if (userRace == "Human") { //racials for humans
            stats.str++;
            stats.dex++;
            stats.con++;
            stats.inte++;
            stats.wis++;
            stats.cha++;
        } else { //racials for tieflings
            stats.inte++;
            stats.cha = stats.cha + 2;
            darkvision = true;
        }
        
    }
    
}
