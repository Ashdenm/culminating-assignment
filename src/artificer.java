import javax.swing.JOptionPane;

public class artificer {
int artiLvl;

    public void pc() {
        artiLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) a"));
        while ((artiLvl <= 1) && (artiLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }
        
        //if (ArtiLevel)
    } 

}
