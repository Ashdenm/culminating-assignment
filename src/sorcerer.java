import javax.swing.JOptionPane;


public class sorcerer {
    int sorcererLvl;
    int hp;

    public void pc() {
        sorcererLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((sorcererLvl <= 1) && (sorcererLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        if (sorcererLvl == 1) {
            hp = 6 + stats.conMod;
        } else {
            hp = 6 + (4 * (sorcererLvl - 1) + stats.conMod * sorcererLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}