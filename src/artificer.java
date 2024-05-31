import javax.swing.JOptionPane;

public class artificer {
int ArtiLvl;

    public void pc() {
        ArtiLvl = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20) a"));
        while ((ArtiLvl <= 1) && (ArtiLvl >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
        }
        
        //if (ArtiLevel)
    } 

}
