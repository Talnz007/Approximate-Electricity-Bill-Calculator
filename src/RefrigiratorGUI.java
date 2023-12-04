import javax.swing.*;

public class RefrigiratorGUI extends Appliances {
    public void calculateFridgeUnits() {
        try {
            String wattsInput = JOptionPane.showInputDialog("Enter the watts of your Refrigerator: ");
            super.watts = Double.parseDouble(wattsInput);

            String hoursInput = JOptionPane.showInputDialog("How many hours is the fridge turned on: ");
            super.hours = Integer.parseInt(hoursInput);

            if (super.hours >= 1 && super.hours <= 24) {
                super.kwh = ((super.watts * super.hours) * 30) / 1000.0;

                String message = "As per the usage of " + super.watts + " watts Refrigerator being used " + super.hours + " hours consumes: " + super.kwh + " kwh a month\n";

                if(super.kwh>=1 && super.kwh<=50)
                {
                    super.unitprice = 4.81;
                }
                else if(super.kwh>50 && super.kwh<=100)
                {
                    super.unitprice = 7.87;
                }
                else if(super.kwh>100 && super.kwh<=200)
                {
                    super.unitprice = 10.54;
                }
                else if(super.kwh>200 && super.kwh<=300)
                {
                    super.unitprice = 12.89;
                }
                else if(super.kwh>300 && super.kwh<=700)
                {
                    super.unitprice = 21.88;
                }
                else if(super.kwh>700)
                {
                    super.unitprice = 24.93;
                }

                super.bill = super.kwh * super.unitprice;
                message += "As per today's unit price based on your units: " + super.kwh + " your bill will roughly be: Rs " + super.bill + "\n";
                message += "Keep in mind this Bill is Without Taxes and Other Charges";

                JOptionPane.showMessageDialog(null, message);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter hours between 1-24");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for watts and hours.");
        }
    }
}
