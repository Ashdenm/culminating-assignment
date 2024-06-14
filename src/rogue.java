import javax.swing.JOptionPane;


public class rogue {
    int rogueLvl = App.level;
    int hp;

    public void pc() {

        if (rogueLvl == 1) {
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (rogueLvl - 1) + stats.conMod * rogueLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}