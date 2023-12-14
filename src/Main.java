import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] options = {"Refrigerator", "Ceiling Fan"}; 
        int choice = JOptionPane.showOptionDialog(
                null,
                "Please choose the appliance you want to calculate the result for",
                "Appliance Choice",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        switch (choice) {
            case 0:
                calculateFridgeUnits();
                break;
            case 1:
                calculateFanUnits();
                break;
            default:
                JOptionPane.showMessageDialog(
                        null,
                        "No Appliance Selected",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
                break;
        }
    }

    private static void calculateFridgeUnits() {
        try {
            RefrigiratorGUI refrigeratorGUI = new RefrigiratorGUI();
            refrigeratorGUI.calculateFridgeUnits();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error calculating refrigerator units: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void calculateFanUnits() {
        try {
            FanGui ceilingFan = new FanGui();
            ceilingFan.calculateFanUnits();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error calculating ceiling fan units: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
