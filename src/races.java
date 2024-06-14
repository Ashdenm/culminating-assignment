import javax.swing.JOptionPane;

public class races {
    Object races[] = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Half-Orc", "Halfling", "Human", "Tiefling"};
    Object dbSubraces[] = {"Black", "Blue", "Green", "Red", "White", "Brass", "Bronze", "Copper", "Gold", "Silver"};
    Object dwarfSubraces[] = {"Hill", "Mountain"};
    Object elfSubraces[] = {"High", "Wood"};
    Object halflingSubraces[] = {"Lightfoot", "Stout"};
    Object heAbilities[] = {"str", "dex", "con", "int", "wis"};
    boolean darkvision = false;
    static String breathweapon;
    int bWDmg;
    int bWDC;
    static String resistance;
    static int speed = 30;
    static int bonusHP;

    public void race() {
        String userRace = (String)JOptionPane.showInputDialog(null, "Choose a race", "Race choice", JOptionPane.QUESTION_MESSAGE, null,  races, "Dragonborn");
        if (userRace == "Dragonborn") {
            stats.str = stats.str + 2;
            stats.cha++;
            bWDC = 8 + stats.conMod + App.proficiency; 
            if (App.level > 6) {
                bWDmg = 2;
            } else if (App.level > 5 && App.level < 11) {
                bWDmg = 3;
            } else if (App.level < 10 && App.level > 16) {
                bWDmg = 4;
            } else {
                bWDmg = 5;
            }
            
            String uDBSubrace = (String)JOptionPane.showInputDialog(null, "Choose a subrace", "Subrace choice", JOptionPane.QUESTION_MESSAGE, null,  dbSubraces, "Black");
            if (uDBSubrace == "Black" || uDBSubrace == "Copper") {
                breathweapon = "Acid, 5 by 30 ft. line, dex save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Acid";
            } else if (uDBSubrace == "Blue" || uDBSubrace == "Bronze") {
                breathweapon = "Lightning, 5 by 30 ft. line, dex save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Lightning";
            } else if (uDBSubrace == "Brass") {
                breathweapon = "Fire, 5 by 30 ft. line, dex save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Fire";
            } else if (uDBSubrace == "Gold" || uDBSubrace == "Red") {
                breathweapon = "Fire, 15 ft. cone, dex save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "fire";
            } else if (uDBSubrace == "Copper") {
                breathweapon = "Acid, 5 by 30 ft. line, dex save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Acid";
            } else if (uDBSubrace == "Green") {
                breathweapon = "Poison, 15 ft. cone, con save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Poison";
            } else if (uDBSubrace == "Silver" || uDBSubrace == "White") {
                breathweapon = "Cold, 15 ft. cone, con save DC: " + bWDC + " , " + bWDmg + "d6 damage";
                JOptionPane.showMessageDialog(null, breathweapon);
                resistance = "Cold";
            }
        } else if (userRace == "Dwarf") {
            stats.con = stats.con + 2;
            darkvision = true;
            speed = 25;
            String uDwarfSubrace = (String)JOptionPane.showInputDialog(null, "Choose a subrace", "Subrace choice", JOptionPane.QUESTION_MESSAGE, null,  dwarfSubraces, "Hill");
            if (uDwarfSubrace == "Hill") {
                stats.wis++;
                bonusHP = App.level;
            } else {
                stats.str = stats.str + 2;
            }
        } else if (userRace == "Elf") {
            stats.dex = stats.dex + 2;
            darkvision = true;
            String uElfSubrace = (String)JOptionPane.showInputDialog(null, "Choose a subrace", "Subrace choice", JOptionPane.QUESTION_MESSAGE, null,  elfSubraces, "High");
            if (uElfSubrace == "High") {
                stats.inte++;
                // wizard cantrip
                //language
            } else {
                stats.wis++;
                speed = 35;
            }
        } else if (userRace == "Gnome") {
            stats.inte = stats.inte + 2;
            stats.con++;
            darkvision = true;
            speed = 25;
        } else if (userRace == "Half-Elf") {
            stats.cha = stats.cha + 2;
            resistance = "Adv. on saves against charmed, cant be put to sleep magically";
            String asi1 = (String)JOptionPane.showInputDialog(null, "Choose an ability to increase by 1", "Half-elf asi", JOptionPane.PLAIN_MESSAGE, null, heAbilities, "str");
            if (asi1 == "str") {
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
        } else if (userRace == "Half-Orc") {
            stats.str = stats.str + 2;
            stats.con++;
            darkvision = true;
        } else if (userRace == "Halfling") {
            stats.dex = stats.dex + 2;
            String uHLSubrace = (String)JOptionPane.showInputDialog(null, "Choose a subrace", "Subrace choice", JOptionPane.QUESTION_MESSAGE, null,  halflingSubraces, "Lightfoot");
            if (uHLSubrace == "Lightfoot") {
                stats.cha++;
            } else {
                stats.con++;
                resistance = "Adv. on saves against poison, Resistance to poison dmg";
            }
        } else if (userRace == "Human") {
            stats.str++;
            stats.dex++;
            stats.con++;
            stats.inte++;
            stats.wis++;
            stats.cha++;
        } else {
            stats.inte++;
            stats.cha = stats.cha + 2;
            darkvision = true;
        }
        
        Object aS[] = {"Str: "+ stats.str + " (" + stats.strMod + ")", "Dex: " + stats.dex + " (" + stats.dexMod + ")", "Con: " + stats.con + " (" + stats.conMod + ")", "Int: " + stats.inte + " (" + stats.inteMod + ")", "Wis: " + stats.wis + " (" + stats.wisMod + ")", "Cha: " + stats.cha + " (" + stats.chaMod + ")"};
        JOptionPane.showMessageDialog(null, aS, "New stats after race choice", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
