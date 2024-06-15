import javax.swing.JOptionPane;

public class App { 
    //creating variables to be called later
    static Object[] classes = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"}; 
    static String title = "Character Creator";
    static String message = "Choose a Class";
    static int level;
    static Object statsOptions[] = {"Standard array", "Random", "Input"};
    static int proficiency;
    static int ac;
    
    public static void main(String[] args) throws Exception {
        stats gen = new stats(); 
        String statsMethod = (String)JOptionPane.showInputDialog(null, "Choose a stat generation method", "Stats generation", JOptionPane.PLAIN_MESSAGE, null,  statsOptions, "Standard array"); //lets user choose stat generation method
        if (statsMethod == "Standard array") {
            gen.standardArray();
            gen.abilityMods();
        } else if (statsMethod == "Random") {
            gen.randomStats();
            gen.abilityMods();
        } else {
            gen.inputStats();
            gen.abilityMods();
        }
        ac = 10 + stats.dexMod;
        level = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20)")); //lets user choose starting level
        while ((level <= 1) && (level >= 20)) {
            JOptionPane.showMessageDialog(null, "Input wasn't a number between 1-20", null, JOptionPane.ERROR_MESSAGE);
            level = Integer.parseInt(JOptionPane.showInputDialog("What starting level? (1-20)"));
        }
        if (level >= 4){ //calculates proficiency bonus based off level
            proficiency = 2;
        } else if (level >= 5 && level < 9) {
            proficiency = 3;
        } else if (level >= 9 && level < 13) {
            proficiency = 4;
        } else if (level >= 13 && level < 17) {
            proficiency = 5;
        } else {
            proficiency = 6;
        }

        races racesObj = new races();
        racesObj.race(); //lets user choose race
        gen.abilityMods();
        

        String userClass = (String)JOptionPane.showInputDialog(null, message, title, JOptionPane.PLAIN_MESSAGE, null,  classes, "Barbarian"); //lets user choose class

        if (userClass == "Barbarian") {
            barbarian barbarian = new barbarian();
            barbarian.pc();
        } else if (userClass == "Bard") {
            bard bard = new bard();
            bard.pc();
        } else if (userClass == "Cleric") {
            cleric cleric = new cleric();
            cleric.pc();
        } else if (userClass == "Druid") {
            druid druid = new druid();
            druid.pc();
        } else if (userClass == "Fighter") {
            fighter fighter = new fighter();
            fighter.pc();
        } else if (userClass == "Monk") {
            monk monk = new monk();
            monk.pc();
        } else if (userClass == "Paladin") {
            paladin pally = new paladin();
            pally.pc();
        } else if (userClass == "Ranger") {
            ranger ranger = new ranger();
            ranger.pc();
        } else if (userClass == "Rogue") {
            rogue rogue = new rogue();
            rogue.pc();
        } else if (userClass == "Sorcerer") {
            sorcerer sorc = new sorcerer();
            sorc.pc();
        } else if (userClass == "Warlock") {
            warlock warlock = new warlock();
            warlock.pc();
        } else {
            wizard wiz = new wizard();
            wiz.pc();
        }
        
    }
}
