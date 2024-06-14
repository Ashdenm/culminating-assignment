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
    } 

}