import javax.swing.JOptionPane;


public class warlock {
    int warlockLvl;
    int hp;

    public void pc() {
        warlockLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((warlockLvl <= 1) && (warlockLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        if (warlockLvl == 1) {
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (warlockLvl - 1) + stats.conMod * warlockLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}