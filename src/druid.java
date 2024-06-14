import javax.swing.JOptionPane;


public class druid {
    int druidLvl = App.level;
    int hp;

    public void pc() {

        if (druidLvl == 1) {
            hp = 8 + stats.conMod;
        } else {
            hp = 8 + (5 * (druidLvl - 1) + stats.conMod * druidLvl + races.bonusHP);
        }
        JOptionPane.showMessageDialog(null, "HP: " + hp);
    } 

}