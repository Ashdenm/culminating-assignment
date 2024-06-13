import javax.swing.JOptionPane;


public class ranger {
    int rangerLvl = App.level;
    int hp;

    public void pc() {

        if (rangerLvl == 1) {
            hp = 10 + stats.conMod;
        } else {
            hp = 10 + (6 * (rangerLvl - 1) + stats.conMod * rangerLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}