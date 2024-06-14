import javax.swing.JOptionPane;

public class bard {
    int bardLvl = App.level;
    int hp;

    public void pc() {

        if (bardLvl == 1) {
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (bardLvl - 1) + stats.conMod * bardLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}

