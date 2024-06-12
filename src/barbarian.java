import javax.swing.JOptionPane;

public class barbarian {
    int barbarianLvl;
    int hp;

    public void pc() {
        barbarianLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20)"));
        while ((barbarianLvl <= 1) && (barbarianLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        if (barbarianLvl == 1) {
            hp = 12 + stats.conMod;
        } else {
            hp = 12 + (7 * (barbarianLvl - 1) + stats.conMod * barbarianLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 
}