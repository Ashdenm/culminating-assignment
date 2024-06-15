import javax.swing.JOptionPane;

public class barbarian {
    int barbarianLvl = App.level;
    int hp;

    public void pc() {

        if (barbarianLvl == 1) {
            hp = 12 + stats.conMod;
        } else {
            hp = 12 + (7 * (barbarianLvl - 1) + stats.conMod * barbarianLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
        Object[] sheet = {"Level " + App.level + "   Race: " + races.userRace + "   Speed: " + races.speed + "ft.", "Str: "+ stats.str + " (" + stats.strMod + ")   AC: " + App.ac +  "   HP: " + hp + "   Hit die: " + App.level + "d12", "Dex: " + stats.dex + " (" + stats.dexMod + ")   Initiative: " + stats.dexMod + "   Proficiency: " + App.proficiency, "Con: " + stats.con + " (" + stats.conMod + ")   Damage resistance: " + races.resistance, "Int: " + stats.inte + " (" + stats.inteMod + ")", "Wis: " + stats.wis + " (" + stats.wisMod + ")", "Cha: " + stats.cha + " (" + stats.chaMod + ")"};
        JOptionPane.showMessageDialog(null, sheet, "Created character", JOptionPane.INFORMATION_MESSAGE);
    } 
}