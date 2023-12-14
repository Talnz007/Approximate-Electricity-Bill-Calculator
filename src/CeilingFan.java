import java.util.Scanner;

class CeilingFan extends Appliances {
    public void calculateFanUnits() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("How many Watts is your Ceiling Fan: ");
            super.watts = scan.nextDouble();

            System.out.println("How many hours is the Fan on: ");
            super.hours = scan.nextInt();

            if (super.hours >= 1 && super.hours <= 24) {
                super.kwh = ((super.watts * super.hours) * 30) / 1000.0;
                System.out.println("As per the usage of " + super.watts + " watts ceiling fan being used " + super.hours + " hours consumes: " + super.kwh + " kwh a month");

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
                System.out.println("As per today's unit price based on your units: " + super.kwh + " your bill will roughly be: Rs " + super.bill);
                System.out.println("Keep in mind this Bill is Without Taxes and Other Charges");
            }
            else
            {
                System.out.println("Please enter hours between 1-24");
            }

        }
        catch (Exception e)
        {
            System.out.println("Please enter valid numeric values for watts and hours.");
        }
        finally
        {
            scan.close();
        }
    }
}

