import javax.swing.JOptionPane;


public class cleric {
    int clericLvl = App.level;
    int hp;

    public void pc() {

        if (clericLvl == 1) {
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (7 * (clericLvl - 1) + stats.conMod * clericLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}
