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
        int min = 3;
        int max = 18;
        int str = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int dex = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int con  = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int inte = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int wis = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int cha = (int)Math.floor(Math.random() * (max - min + 1) + min);
        
        Object[] stats = {str, dex, con, inte, wis, cha};
        JOptionPane.showMessageDialog(null, stats, "Stats generated", JOptionPane.INFORMATION_MESSAGE);
    }
    public void inputStats() {
        int str = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Strength score (3-18)", "Strength score", JOptionPane.PLAIN_MESSAGE));
        while (str < 3 || str > 18) {
            str = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Strength score (3-18)", "Strength score", JOptionPane.ERROR_MESSAGE));
        }
        int dex = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Dexterity score (3-18)", "Dexterity score", JOptionPane.PLAIN_MESSAGE));
        while (dex < 3 || dex > 18) {
            dex = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Dexterity score (3-18)", "Dexterity score", JOptionPane.ERROR_MESSAGE));
        }
        int con = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Constitution score (3-18)", "Constitution score", JOptionPane.PLAIN_MESSAGE));
        while (con < 3 || con > 18) {
            con = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Constitution score (3-18)", "Constitution score", JOptionPane.ERROR_MESSAGE));
        }
        int inte = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Intelligence score (3-18)", "Intelligence score", JOptionPane.PLAIN_MESSAGE));
        while (inte < 3 || inte > 18) {
            inte = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Intelligence score (3-18)", "Intelligence score", JOptionPane.ERROR_MESSAGE));
        }
        int wis = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Wisdom score (3-18)", "Wisdom score", JOptionPane.PLAIN_MESSAGE));
        while (wis < 3 || wis > 18) {
            wis = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Wisdom score (3-18)", "Wisdom score", JOptionPane.ERROR_MESSAGE));
        }
        int cha = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Charisma score (3-18)", "Charisma score", JOptionPane.PLAIN_MESSAGE));
        while (cha < 3 || cha > 18) {
            cha = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Charisma score (3-18)", "Charisma score", JOptionPane.ERROR_MESSAGE));
        }
        Object[] stats = {str, dex, con, inte, wis, cha};
        JOptionPane.showMessageDialog(null, stats);
    }
}
