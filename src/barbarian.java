import javax.swing.JOptionPane;

public class barbarian {
int barbLvl;
int hp;


    public void pc() {
        barbLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((barbLvl <= 1) && (barbLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }

        /*if (barbLvl == 1) {
            
        } */
    } 

}