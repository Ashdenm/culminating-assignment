import javax.swing.JOptionPane;

public class App {
    static Object[] classes = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};

    static String title = "Character Creator";
    static String message = "Choose a Class";
    public int level;
    static Object statsOptions[] = {"Standard array", "Random", "Input"};
    static stats gen = new stats();

    public static void main(String[] args) throws Exception {

        String statsMethod = (String)JOptionPane.showInputDialog(null, "Choose a stat generation method", "Stats generation", JOptionPane.PLAIN_MESSAGE, null,  statsOptions, "Standard array");
        if (statsMethod == "Standard array") {
            gen.standardArray();
            gen.abilityMods();
        } else if (statsMethod == "Random") {
            gen.randomStats();
        } else {
            gen.inputStats();
        }

        String userClass = (String)JOptionPane.showInputDialog(null, message, title, JOptionPane.PLAIN_MESSAGE, null,  classes, "Barbarian");

        if (userClass == "Barbarian") {
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
