import javax.swing.JOptionPane;

public class App {
    static Object[] classes = {"Artificer", "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};

    static String title = "Character Creator";
    static String message = "Choose a Class";
    public int level;

    public static void main(String[] args) throws Exception {
        String userClass = (String)JOptionPane.showInputDialog(null, message, title, JOptionPane.PLAIN_MESSAGE, null,  classes, "Artificer");

        if (userClass == "Artificer") {
            artificer arti = new artificer();
            arti.pc();
        } else if (userClass == "Barbarian") {
            barbarian barb = new barbarian();
            barb.pc();
        } else if (userClass == "Bard") {

        } else if (userClass == "Cleric") {

        } else if (userClass == "Druid") {

        } else if (userClass == "Fighter") {
            
        } else if (userClass == "Monk") {

        } else if (userClass == "Paladin") {

        } else if (userClass == "Ranger") {

        } else if (userClass == "Rogue") {

        } else if (userClass == "Sorcerer") {

        } else if (userClass == "Warlock") {

        } else {

        }

        

            
    }
}
