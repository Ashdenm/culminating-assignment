import javax.swing.JOptionPane;


public class paladin {
    int paladinLvl;
    int hp;

    public void pc() {
        paladinLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((paladinLvl <= 1) && (paladinLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        if (paladinLvl == 1) {
            hp = 10 + stats.conMod;
        } else {
            hp = 10 + (6 * (paladinLvl - 1) + stats.conMod * paladinLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}