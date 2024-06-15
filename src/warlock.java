import javax.swing.JOptionPane;


public class warlock {
    int warlockLvl = App.level;
    int hp;

    public void pc() {

        if (warlockLvl == 1) { //calculates hp
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (warlockLvl - 1) + stats.conMod * warlockLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
        Object[] sheet = {"Level " + App.level + "   Race: " + races.userRace + "   Speed: " + races.speed + "ft.", "Str: "+ stats.str + " (" + stats.strMod + ")   AC: " + App.ac +  "   HP: " + hp + "   Hit die: " + App.level + "d8", "Dex: " + stats.dex + " (" + stats.dexMod + ")   Initiative: " + stats.dexMod + "   Proficiency: " + App.proficiency, "Con: " + stats.con + " (" + stats.conMod + ")   Damage resistance: " + races.resistance, "Int: " + stats.inte + " (" + stats.inteMod + ")", "Wis: " + stats.wis + " (" + stats.wisMod + ")", "Cha: " + stats.cha + " (" + stats.chaMod + ")"};
        JOptionPane.showMessageDialog(null, sheet, "Created character", JOptionPane.INFORMATION_MESSAGE); //displays character
    } 

}