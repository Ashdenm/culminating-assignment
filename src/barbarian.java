import javax.swing.JOptionPane;

public class barbarian {
int BarbLvl;

    public void pc() {
        BarbLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((BarbLvl <= 1) && (BarbLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }
        
        //if (BarbLvl)
    } 

}