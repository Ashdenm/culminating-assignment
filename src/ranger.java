import javax.swing.JOptionPane;


public class ranger {
    int rangerLvl;
    int hp;

    public void pc() {
        rangerLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((rangerLvl <= 1) && (rangerLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        if (rangerLvl == 1) {
            hp = 10 + stats.conMod;
        } else {
            hp = 10 + (6 * (rangerLvl - 1) + stats.conMod * rangerLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}