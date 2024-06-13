import javax.swing.JOptionPane;


public class fighter {
    int fighterLvl = App.level;
    int hp;

    public void pc() {

        if (fighterLvl == 1) {
            hp = 10 + stats.conMod;
        } else {
            hp = 10 + (6 * (fighterLvl - 1) + stats.conMod * fighterLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}