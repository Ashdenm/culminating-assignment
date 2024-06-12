import javax.swing.JOptionPane;

public class races {
    Object races[] = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Half-Orc", "Halfling", "Human", "Tiefling"};
    stats mods = new stats();
    Object heAbilities[] = {"str", "dex", "con", "int", "wis"};

    public void race() {
        String userRace = (String)JOptionPane.showInputDialog(null, "Choose a race", "Race choice", JOptionPane.PLAIN_MESSAGE, null,  races, "Dragonborn");
        if (userRace == "Dragonborn") {
            mods.str = mods.str + 2;
            mods.cha++;
        } else if (userRace == "Dwarf") {
            mods.con = mods.con + 2;
        } else if (userRace == "Elf") {
            mods.dex = mods.dex + 2;
        } else if (userRace == "Gnome") {
            mods.inte = mods.inte + 2;
        } else if (userRace == "Half-Elf") {
            mods.cha = mods.cha + 2;
            String asi1 = (String)JOptionPane.showInputDialog(null, "Choose an ability to increase by 1", "Half-elf asi", JOptionPane.PLAIN_MESSAGE, null, heAbilities, "str");
            if (asi1 == "str") {
                mods.str++;
            } else if (asi1 == "dex") {
                mods.dex++;
            } else if (asi1 == "con") {
                mods.con++;
            } else if (asi1 == "int") {
                mods.inte++;
            } else {
                mods.wis++;
            }
            String asi2 = (String)JOptionPane.showInputDialog(null, "Choose a different ability to increase by 1", "Half-elf asi 2", JOptionPane.PLAIN_MESSAGE, null, heAbilities, "str");
            while (asi2 == asi1) {
                asi2 = (String)JOptionPane.showInputDialog(null, "Choose a different ability to increase by 1", "Half-elf asi 2", JOptionPane.ERROR_MESSAGE, null, heAbilities, "str");
            }
            if (asi2 == "str") {
                mods.str++;
            } else if (asi2 == "dex") {
                mods.dex++;
            } else if (asi2 == "con") {
                mods.con++;
            } else if (asi2 == "int") {
                mods.inte++;
            } else {
                mods.wis++;
            }
        } else if (userRace == "Half-Orc") {
            mods.str = mods.str + 2;
            mods.con++;
        } else if (userRace == "Halfling") {
            mods.dex = mods.dex + 2;
        } else if (userRace == "Human") {
            mods.str++;
            mods.dex++;
            mods.con++;
            mods.inte++;
            mods.wis++;
            mods.cha++;
        } else {
            mods.inte++;
            mods.cha = mods.cha + 2;
        }
    }
}
