public class Executive extends Employee {

    private double bonus;

    //constructor to set up Executive basis information
    
    public Executive (String eName, String eAddress, String ePhone,String socSecNumber, double rate)
    {
          super (eName, eAddress, ePhone, socSecNumber, rate);       //use super to use Employee Class constructor to pass in info
          bonus = 0;       // bonus has (noy) yet to be awarded when the object is initialized by a constructor, use method: awardBonus() to set the bonus       
    }
    
    public void awardBonus(double exeBonus) {
        bonus = exeBonus;
    }
    
    
    /*The pay method of the Employee class is invoked using super to obtain the normal payment amount
      This technique is better than using just the payRate variable because if we choose to change how Employee objects get paid, the change
      will automatically be reflected in Executive      */
    @Override
    public double pay() {
        double payment = super.pay() + bonus;      //super to retrieve the monthly rate(Employee Class pay()), then plus it with bonus
        
        bonus = 0;                        //reset bonus to 0 after to add the bonus to the monthly rate payment
        
        return payment;
    }

    /*array staffList[0] is initialized as Executive object by =new Executive(), 
    so this element(executive object) will use the pay() method version in Executive Class,
    eventhough it is declared as StaffMember Type, which means this array element (has visibility) can call pay() method existing in StaffMember Class,
    which is a abstract method.
    declared Type decides which method(by name) the object can use/see. Object initialized by new keyword decides which version of this method is used.*/
}
