import javax.swing.JOptionPane;

public class stats {
    //variables to be called later
    static Object sa[] = {15, 14, 13, 12, 10, 8};
    public static int str;
    public static int dex;
    public static int con;
    public static int inte;
    public static int wis;
    public static int cha;
    public static int strMod;
    public static int dexMod;
    public static int conMod;
    public static int inteMod;
    public static int wisMod;
    public static int chaMod;

    public void standardArray() { //code for standard array stat generation (doesn't let the user pick the same stat number twice)
        str = (Integer)JOptionPane.showInputDialog(null, "Choose strength score", "Strength score", JOptionPane.PLAIN_MESSAGE, null,  sa, 15);

        dex = (Integer)JOptionPane.showInputDialog(null, "Choose dexterity score (no duplicate stats)", "Dexterity score", JOptionPane.PLAIN_MESSAGE, null,  sa, 14);

        while (dex == str) {
            dex = (Integer)JOptionPane.showInputDialog(null, "Choose dexterity score (no duplicate stats)", "error, try again", JOptionPane.ERROR_MESSAGE, null,  sa, 14);
        }
        con = (Integer)JOptionPane.showInputDialog(null, "Choose consitution score (no duplicate stats)", "Constitution score", JOptionPane.PLAIN_MESSAGE, null,  sa, 13);

        while (con == str || con == dex) {
            con = (Integer)JOptionPane.showInputDialog(null, "Choose constitution score (no duplicate stats)", "error, try again", JOptionPane.ERROR_MESSAGE, null,  sa, 13);
        }
        inte = (Integer)JOptionPane.showInputDialog(null, "Choose intelligence score (no duplicate stats)", "Intelligence score", JOptionPane.PLAIN_MESSAGE, null,  sa, 12);

        while (inte == str || inte == dex || inte == con) {
            inte = (Integer)JOptionPane.showInputDialog(null, "Choose intelligence score (no duplicate stats)", "error, try again", JOptionPane.ERROR_MESSAGE, null,  sa, 12);
        }
        wis = (Integer)JOptionPane.showInputDialog(null, "Choose wisdom score (no duplicate stats)", "Wisdom score", JOptionPane.PLAIN_MESSAGE, null,  sa, 10);

        while (wis == str || wis == dex || wis == con || wis == inte) {
            wis = (Integer)JOptionPane.showInputDialog(null, "Choose wisdom score (no duplicate stats)", "error, try again", JOptionPane.ERROR_MESSAGE, null,  sa, 10);
        }
        cha = (Integer)JOptionPane.showInputDialog(null, "Choose charisma score (no duplicate stats)", "Charisma score", JOptionPane.PLAIN_MESSAGE, null,  sa, 8);

        while (cha == str || cha == dex || cha == con || cha == inte || cha == wis) {
            cha = (Integer)JOptionPane.showInputDialog(null, "Choose charisma score (no duplicate stats)", "error, try again", JOptionPane.ERROR_MESSAGE, null,  sa, 8);
        }
    }

    public void randomStats() { //code for random stat generation
        int min = 8;
        int max = 18;
        str = (int)Math.floor(Math.random() * (max - min + 1) + min);
        dex = (int)Math.floor(Math.random() * (max - min + 1) + min);
        con  = (int)Math.floor(Math.random() * (max - min + 1) + min);
        inte = (int)Math.floor(Math.random() * (max - min + 1) + min);
        wis = (int)Math.floor(Math.random() * (max - min + 1) + min);
        cha = (int)Math.floor(Math.random() * (max - min + 1) + min);
    }

    public void inputStats() { //code for stat inputs
        str = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Strength score (3-18)", "Strength score", JOptionPane.PLAIN_MESSAGE));
        while (str < 3 || str > 18) {
            str = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Strength score (3-18)", "Strength score", JOptionPane.ERROR_MESSAGE));
        }
        dex = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Dexterity score (3-18)", "Dexterity score", JOptionPane.PLAIN_MESSAGE));
        while (dex < 3 || dex > 18) {
            dex = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Dexterity score (3-18)", "Dexterity score", JOptionPane.ERROR_MESSAGE));
        }
        con = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Constitution score (3-18)", "Constitution score", JOptionPane.PLAIN_MESSAGE));
        while (con < 3 || con > 18) {
            con = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Constitution score (3-18)", "Constitution score", JOptionPane.ERROR_MESSAGE));
        }
        inte = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Intelligence score (3-18)", "Intelligence score", JOptionPane.PLAIN_MESSAGE));
        while (inte < 3 || inte > 18) {
            inte = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Intelligence score (3-18)", "Intelligence score", JOptionPane.ERROR_MESSAGE));
        }
        wis = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Wisdom score (3-18)", "Wisdom score", JOptionPane.PLAIN_MESSAGE));
        while (wis < 3 || wis > 18) {
            wis = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Wisdom score (3-18)", "Wisdom score", JOptionPane.ERROR_MESSAGE));
        }
        cha = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Charisma score (3-18)", "Charisma score", JOptionPane.PLAIN_MESSAGE));
        while (cha < 3 || cha > 18) {
            cha = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Charisma score (3-18)", "Charisma score", JOptionPane.ERROR_MESSAGE));
        }
        
    }


    public void abilityMods() { //calculates ability modifiers based off score from the generation above
        if (str == 3) {
            strMod = -4;
        } else if (str >= 4 && str <= 5) {
            strMod = -3;
        } else if (str >= 6 && str <= 7) {
            strMod = -2;
        } else if (str >= 8 && str <= 9) {
            strMod = -1;
        } else if (str >= 10 && str <= 11) {
            strMod = 0;
        } else if (str >= 12 && str <= 13) {
            strMod = 1;
        } else if (str >= 14 && str <= 15) {
            strMod = 2;
        } else if (str >= 16 && str <= 17) {
            strMod = 3;
        } else if (str >= 18 && str <= 19) {
            strMod = 4;
        } else {
            strMod = 5;
        }

        if (dex == 3) {
            dexMod = -4;
        } else if (dex >= 4 && dex <= 5) {
            dexMod = -3;
        } else if (dex >= 6 && dex <= 7) {
            dexMod = -2;
        } else if (dex >= 8 && dex <= 9) {
            dexMod = -1;
        } else if (dex >= 10 && dex <= 11) {
            dexMod = 0;
        } else if (dex >= 12 && dex <= 13) {
            dexMod = 1;
        } else if (dex >= 14 && dex <= 15) {
            dexMod = 2;
        } else if (dex >= 16 && dex <= 17) {
            dexMod = 3;
        } else if (dex >= 18 && dex <= 19) {
            dexMod = 4;
        } else {
            dexMod = 5;
        }

        if (con == 3) {
            conMod = -4;
        } else if (con >= 4 && con <= 5) {
            conMod = -3;
        } else if (con >= 6 && con <= 7) {
            conMod = -2;
        } else if (con >= 8 && con <= 9) {
            conMod = -1;
        } else if (con >= 10 && con <= 11) {
            conMod = 0;
        } else if (con >= 12 && con <= 13) {
            conMod = 1;
        } else if (con >= 14 && con <= 15) {
            conMod = 2;
        } else if (con >= 16 && con <= 17) {
            conMod = 3;
        } else if (con >= 18 && con <= 19) {
            conMod = 4;
        } else {
            conMod = 5;
        }

        if (inte == 3) {
            inteMod = -4;
        } else if (inte >= 4 && inte <= 5) {
            inteMod = -3;
        } else if (inte >= 6 && inte <= 7) {
            inteMod = -2;
        } else if (inte >= 8 && inte <= 9) {
            inteMod = -1;
        } else if (inte >= 10 && inte <= 11) {
            inteMod = 0;
        } else if (inte >= 12 && inte <= 13) {
            inteMod = 1;
        } else if (inte >= 14 && inte <= 15) {
            inteMod = 2;
        } else if (inte >= 16 && inte <= 17) {
            inteMod = 3;
        } else if (inte >= 18 && inte <= 19) {
            inteMod = 4;
        } else {
            inteMod = 5;
        }

        if (wis == 3) {
            wisMod = -4;
        } else if (wis >= 4 && wis <= 5) {
            wisMod = -3;
        } else if (wis >= 6 && wis <= 7) {
            wisMod = -2;
        } else if (wis >= 8 && wis <= 9) {
            wisMod = -1;
        } else if (wis >= 10 && wis <= 11) {
            wisMod = 0;
        } else if (wis >= 12 && wis <= 13) {
            wisMod = 1;
        } else if (wis >= 14 && wis <= 15) {
            wisMod = 2;
        } else if (wis >= 16 && wis <= 17) {
            wisMod = 3;
        } else if (wis >= 18 && wis <= 19) {
            wisMod = 4;
        } else {
            wisMod = 5;
        }

        if (cha == 3) {
            chaMod = -4;
        } else if (cha >= 4 && cha <= 5) {
            chaMod = -3;
        } else if (cha >= 6 && cha <= 7) {
            chaMod = -2;
        } else if (cha >= 8 && cha <= 9) {
            chaMod = -1;
        } else if (cha >= 10 && cha <= 11) {
            chaMod = 0;
        } else if (cha >= 12 && cha <= 13) {
            chaMod = 1;
        } else if (cha >= 14 && cha <= 15) {
            chaMod = 2;
        } else if (cha >= 16 && cha <= 17) {
            chaMod = 3;
        } else if (cha >= 18 && cha <= 19){
            chaMod = 4;
        } else {
            chaMod = 5;
        }
        Object[] abilityScore = {"Str: "+ stats.str + " (" + stats.strMod + ")", "Dex: " + stats.dex + " (" + stats.dexMod + ")", "Con: " + stats.con + " (" + stats.conMod + ")", "Int: " + stats.inte + " (" + stats.inteMod + ")", "Wis: " + stats.wis + " (" + stats.wisMod + ")", "Cha: " + stats.cha + " (" + stats.chaMod + ")"};
        JOptionPane.showMessageDialog(null, abilityScore, "Stats generated", JOptionPane.INFORMATION_MESSAGE);
    }
}
