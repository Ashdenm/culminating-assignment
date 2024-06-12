import javax.swing.JOptionPane;


public class monk {
    int monkLvl;
    int hp;

    public void pc() {
        monkLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((monkLvl <= 1) && (monkLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        if (monkLvl == 1) {
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (monkLvl - 1) + stats.conMod * monkLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}