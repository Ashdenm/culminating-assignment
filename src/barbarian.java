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
        Object[] sheet = {"Level " + App.level + "Race: " + races.userRace + "HP: " + hp + "Speed: " + races.speed + "ft.", "Str: "+ stats.str + " (" + stats.strMod + ")", "Dex: " + stats.dex + " (" + stats.dexMod + ")", "Con: " + stats.con + " (" + stats.conMod + ")", "Int: " + stats.inte + " (" + stats.inteMod + ")", "Wis: " + stats.wis + " (" + stats.wisMod + ")", "Cha: " + stats.cha + " (" + stats.chaMod + ")"};
        JOptionPane.showMessageDialog(null, sheet, "Created character", JOptionPane.INFORMATION_MESSAGE);
    } 
}