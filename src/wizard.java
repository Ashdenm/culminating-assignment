import javax.swing.JOptionPane;


public class wizard {
    int wizardLvl = App.level;
    int hp;

    public void pc() {

        if (wizardLvl == 1) {
            hp = 6 + stats.conMod;
        } else {
            hp = 6 + (4 * (wizardLvl - 1) + stats.conMod * wizardLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
        Object[] sheet = {"Level " + App.level + "   Race: " + races.userRace + "   Speed: " + races.speed + "ft.", "Str: "+ stats.str + " (" + stats.strMod + ")   AC: " + App.ac +  "   HP: " + hp + "   Hit die: " + App.level + "d6", "Dex: " + stats.dex + " (" + stats.dexMod + ")   Initiative: " + stats.dexMod + "   Proficiency: " + App.proficiency, "Con: " + stats.con + " (" + stats.conMod + ")   Damage resistance: " + races.resistance, "Int: " + stats.inte + " (" + stats.inteMod + ")", "Wis: " + stats.wis + " (" + stats.wisMod + ")", "Cha: " + stats.cha + " (" + stats.chaMod + ")"};
        JOptionPane.showMessageDialog(null, sheet, "Created character", JOptionPane.INFORMATION_MESSAGE);
    } 

}