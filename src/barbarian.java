import javax.swing.JOptionPane;

public class barbarian {
int barbLvl;
int hp;
Object statsOptions[] = {"Standard array", "Random", "Input"};
Object standardArray[] = {8, 10, 12, 13, 14, 15};

    public void pc() {
        barbLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((barbLvl <= 1) && (barbLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }
        int statsMethod = JOptionPane.showOptionDialog(null, "Which stat generating method would you like to use?", "Stats generation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, statsOptions, statsOptions[0]);
        if (statsMethod == 0) {
            int str = (Integer)JOptionPane.showInputDialog(null, "Choose a Strength ability score", "Strength score", JOptionPane.PLAIN_MESSAGE, null, standardArray, standardArray[0]);
            Object standardArray[] = {}
            int 
        }

        /*if (barbLvl == 1) {
            
        } */
    } 

}