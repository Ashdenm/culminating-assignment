import javax.swing.JOptionPane;


public class wizard {
    int wizardLvl;
    int hp;

    public void pc() {
        wizardLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((wizardLvl <= 1) && (wizardLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        if (wizardLvl == 1) {
            hp = 6 + stats.conMod;
        } else {
            hp = 6 + (4 * (wizardLvl - 1) + stats.conMod * wizardLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}