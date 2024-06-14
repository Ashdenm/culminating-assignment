import javax.swing.JOptionPane;


public class monk {
    int monkLvl = App.level;
    int hp;

    public void pc() {

        if (monkLvl == 1) {
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (monkLvl - 1) + stats.conMod * monkLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}