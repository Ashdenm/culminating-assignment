import javax.swing.JOptionPane;


public class warlock {
    int warlockLvl = App.level;
    int hp;

    public void pc() {

        if (warlockLvl == 1) {
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (warlockLvl - 1) + stats.conMod * warlockLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}