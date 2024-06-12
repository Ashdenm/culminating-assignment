import javax.swing.JOptionPane;


public class rogue {
    int rogueLvl;
    int hp;

    public void pc() {
        rogueLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((rogueLvl <= 1) && (rogueLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        if (rogueLvl == 1) {
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (rogueLvl - 1) + stats.conMod * rogueLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}