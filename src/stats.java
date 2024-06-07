import javax.swing.JOptionPane;

public class stats {
    Object sa[] = {15, 14, 13, 12, 10, 8};

    public void standardArray() {
        int str = (Integer)JOptionPane.showInputDialog(null, "Choose strength score", "Strength score", JOptionPane.PLAIN_MESSAGE, null,  sa, 15);

        int dex = (Integer)JOptionPane.showInputDialog(null, "Choose dexterity score (no duplicate stats)", "Dexterity score", JOptionPane.PLAIN_MESSAGE, null,  sa, 14);

        while (dex == str) {
            dex = (Integer)JOptionPane.showInputDialog(null, "Choose dexterity score (no duplicate stats)", "error, try again", JOptionPane.ERROR_MESSAGE, null,  sa, 14);
        }
        int con = (Integer)JOptionPane.showInputDialog(null, "Choose consitution score (no duplicate stats)", "Constitution score", JOptionPane.PLAIN_MESSAGE, null,  sa, 13);

        while (con == str || con == dex) {
            con = (Integer)JOptionPane.showInputDialog(null, "Choose constitution score (no duplicate stats)", "error, try again", JOptionPane.ERROR_MESSAGE, null,  sa, 13);
        }
        int inte = (Integer)JOptionPane.showInputDialog(null, "Choose intelligence score (no duplicate stats)", "Intelligence score", JOptionPane.PLAIN_MESSAGE, null,  sa, 12);

        while (inte == str || inte == dex || inte == con) {
            inte = (Integer)JOptionPane.showInputDialog(null, "Choose intelligence score (no duplicate stats)", "error, try again", JOptionPane.ERROR_MESSAGE, null,  sa, 12);
        }
        int wis = (Integer)JOptionPane.showInputDialog(null, "Choose wisdom score (no duplicate stats)", "Wisdom score", JOptionPane.PLAIN_MESSAGE, null,  sa, 10);

        while (wis == str || wis == dex || wis == con || wis == inte) {
            wis = (Integer)JOptionPane.showInputDialog(null, "Choose wisdom score (no duplicate stats)", "error, try again", JOptionPane.ERROR_MESSAGE, null,  sa, 10);
        }
        int cha = (Integer)JOptionPane.showInputDialog(null, "Choose charisma score (no duplicate stats)", "Charisma score", JOptionPane.PLAIN_MESSAGE, null,  sa, 8);

        while (cha == str || cha == dex || cha == con || cha == inte || cha == wis) {
            cha = (Integer)JOptionPane.showInputDialog(null, "Choose charisma score (no duplicate stats)", "error, try again", JOptionPane.ERROR_MESSAGE, null,  sa, 8);
        }
        Object[] stats = {str, dex, con, inte, wis, cha};
    }
    public void randomStats() {
        
    }
    public void inputStats() {

    }
}
