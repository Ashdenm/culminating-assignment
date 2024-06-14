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
    } 
}