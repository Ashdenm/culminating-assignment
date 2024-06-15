import javax.swing.JOptionPane;


public class druid {
    int druidLvl = App.level;
    int hp;

    public void pc() {

        if (druidLvl == 1) { //calculates hp
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (druidLvl - 1) + stats.conMod * druidLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
        Object[] sheet = {"Level " + App.level + "   Race: " + races.userRace + "   Speed: " + races.speed + "ft.", "Str: "+ stats.str + " (" + stats.strMod + ")   AC: " + App.ac +  "   HP: " + hp + "   Hit die: " + App.level + "d8", "Dex: " + stats.dex + " (" + stats.dexMod + ")   Initiative: " + stats.dexMod + "   Proficiency: " + App.proficiency, "Con: " + stats.con + " (" + stats.conMod + ")   Damage resistance: " + races.resistance, "Int: " + stats.inte + " (" + stats.inteMod + ")", "Wis: " + stats.wis + " (" + stats.wisMod + ")", "Cha: " + stats.cha + " (" + stats.chaMod + ")"};
        JOptionPane.showMessageDialog(null, sheet, "Created character", JOptionPane.INFORMATION_MESSAGE); //
    } 

}