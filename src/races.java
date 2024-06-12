import javax.swing.JOptionPane;

public class races {
    Object races[] = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Half-Orc", "Halfling", "Human", "Tiefling"};
    Object heAbilities[] = {"str", "dex", "con", "int", "wis"};
    

    public void race() {
        String userRace = (String)JOptionPane.showInputDialog(null, "Choose a race", "Race choice", JOptionPane.PLAIN_MESSAGE, null,  races, "Dragonborn");
        if (userRace == "Dragonborn") {
            stats.str = stats.str + 2;
            stats.cha++;
        } else if (userRace == "Dwarf") {
            stats.con = stats.con + 2;
        } else if (userRace == "Elf") {
            stats.dex = stats.dex + 2;
        } else if (userRace == "Gnome") {
            stats.inte = stats.inte + 2;
        } else if (userRace == "Half-Elf") {
            stats.cha = stats.cha + 2;
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
        } else if (userRace == "Half-Orc") {
            stats.str = stats.str + 2;
            stats.con++;
        } else if (userRace == "Halfling") {
            stats.dex = stats.dex + 2;
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
        }
        
        Object aS[] = {"Str: "+ stats.str + " (" + stats.strMod + ")", "Dex: " + stats.dex + " (" + stats.dexMod + ")", "Con: " + stats.con + " (" + stats.conMod + ")", "Int: " + stats.inte + " (" + stats.inteMod + ")", "Wis: " + stats.wis + " (" + stats.wisMod + ")", "Cha: " + stats.cha + " (" + stats.chaMod + ")"};
        JOptionPane.showMessageDialog(null, aS, "New stats after race choice", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
