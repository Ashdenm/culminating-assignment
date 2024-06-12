import javax.swing.JOptionPane;


public class fighter {
    int fighterLvl;
    int hp;

    public void pc() {
        fighterLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((fighterLvl <= 1) && (fighterLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        if (fighterLvl == 1) {
            hp = 10 + stats.conMod;
        } else {
            hp = 10 + (6 * (fighterLvl - 1) + stats.conMod * fighterLvl);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}