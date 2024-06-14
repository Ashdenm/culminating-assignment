import javax.swing.JOptionPane;


public class sorcerer {
    int sorcererLvl = App.level;
    int hp;

    public void pc() {

        if (sorcererLvl == 1) {
            hp = 6 + stats.conMod;
        } else {
            hp = 6 + (4 * (sorcererLvl - 1) + stats.conMod * sorcererLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}