import javax.swing.JOptionPane;


public class druid {
    int druidLvl;
    int hp;

    public void pc() {
        druidLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((druidLvl <= 1) && (druidLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        if (druidLvl == 1) {
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (druidLvl - 1) + stats.conMod * druidLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}