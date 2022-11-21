public class Hourly extends Employee {

    private int hoursWorked;

    //constructor to set up basis information for a hourly object
    public Hourly (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
{
          super (eName, eAddress, ePhone, socSecNumber, rate);     //use super parent constructor to set up basis variables
          hoursWorked = 0;                           //initial hoursWorked as 0
}
    
    
public void addHours(int TimeHr) {           //the method to add the hoursworked for this Hourly object
        hoursWorked += TimeHr;
    }    


    @Override
    public double pay() {
        double payment = payRate * hoursWorked;      //payRate is hourly rate passed in by the Hourly object constructor
        
        hoursWorked = 0;      //reset hoursWorks to 0 after the hoursWorked is used to calculate the payment anount
        
        return payment;        //payment for a Hourly object
    }

    

    @Override
    public String toString() {
        String result = super.toString();               //super--Employee Class toString() print out: name,address, phone, social number
        result += "\nCurrent hours: " + hoursWorked;     //print out: hoursWorked
       
        return result;
    }
    
   
    
    
}
