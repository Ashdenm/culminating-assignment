import javax.swing.JOptionPane;


public class bard {
    int bardLvl;

    public void pc() {
        bardLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) b"));
        while ((bardLvl <= 1) && (bardLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }
        
        //if (BardLvl)
    } 

}

