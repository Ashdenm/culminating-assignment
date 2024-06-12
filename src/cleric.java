import javax.swing.JOptionPane;


public class cleric {
    int clericLvl;

    public void pc() {
        clericLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((clericLvl <= 1) && (clericLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }
        
    } 

}
