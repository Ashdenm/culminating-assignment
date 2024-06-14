import javax.swing.JOptionPane;


public class paladin {
    int paladinLvl =  App.level;
    int hp;

    public void pc() {

        if (paladinLvl == 1) {
            hp = 10 + stats.conMod;
        } else {
            hp = 10 + (6 * (paladinLvl - 1) + stats.conMod * paladinLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}