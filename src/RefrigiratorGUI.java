import javax.swing.*;

class RefrigiratorGUI extends Appliances {
    public void calculateFridgeUnits() {
        try{
            String[] options = {"Yes, Let's Go!", "Not Right Now"};
        
            int choice = JOptionPane.showOptionDialog(null,
                    "Are you ready to start the adventure?",
                    "Let's Do I!",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);
            
            if (choice == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null,
                        "Take your time! When you're ready, Just Click 'Yes, Let's Go!'",
                        "Ready When You Are",
                        JOptionPane.INFORMATION_MESSAGE);
            } else
             {
                JOptionPane.showMessageDialog(null,
                        "Great! Let's Start Then.",
                        "'Financial' Adventure Awaits!",
                        JOptionPane.INFORMATION_MESSAGE);
            
            String WattsInput = JOptionPane.showInputDialog("Enter Amount of Watts Your Refrigirator is: ");
            super.watts = Double.parseDouble(WattsInput);

            String HoursInput = JOptionPane.showInputDialog("How Many Hours a Day the Refrigirator is Used: ");
            super.hours = Integer.parseInt(HoursInput);

            if(hours>=1 && hours<=24)
            {
                super.kwh = ((super.watts * super.hours)*30)/1000;

                String message = "As per the usage of a " + super.watts + " Watts Refrigirator being used " + super.hours + " hours \nIt consumes " + super.kwh + " kwh units a month";

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

                super.bill = super.kwh * super.kwh;
                message += "\nAs per today's unit price Rs " + super.unitprice + " \nYour expected monthly bill will be: Rs " + super.bill;
                JOptionPane.showMessageDialog(null,message);
                JOptionPane.showMessageDialog(null, "Please Keep in Mind that this expected bill is before Taxes ", "Reminder", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please Enter Hours Between 1-24");
            }
        }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please enter valid numeric values for watts and hours");
        }
    }
}
