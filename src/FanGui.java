import javax.swing.*;

public class FanGui extends Appliances{
    public void calculateFanUnits()
    {
        try{
            String WattsInput = JOptionPane.showInputDialog("Enter Amount of Watts Your Fan is: ");
            super.watts = Double.parseDouble(WattsInput);

            String HoursInput = JOptionPane.showInputDialog("How Many Hours a Day the Fan is Used: ");
            super.hours = Integer.parseInt(HoursInput);

            if(hours>=1 && hours<=24)
            {
                super.kwh = ((super.watts * super.hours)*30)/1000;

                String message = "As per the usage of a " + super.watts + " Watts Fan being used " + super.hours + " hours it consumes " + super.kwh + " kwh units a month";

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
                message += "\nAs per today's unit price Rs " + super.unitprice + " your expected monthly bill will be: Rs " + super.bill;
                message += "\nPlease Keep in Mind that this expected bill is before Taxes ";

                JOptionPane.showMessageDialog(null,message);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please Enter Hours Between 1-24");
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please enter valid numeric values for watts and hours");
        }
    }
}
