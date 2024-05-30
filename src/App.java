import javax.swing.JOptionPane;

public class App {
    static Object[] classes = {"Artificer", "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};

    static String title = "Character Creator";
    static String message = "Choose a Class";

    public static void main(String[] args) throws Exception {
        String userClass = (String)JOptionPane.showInputDialog(null,
        message, title, JOptionPane.PLAIN_MESSAGE, null,  classes, "Artificer");

        if (userClass == "Artificer") {
            
        }

            
    }
}
