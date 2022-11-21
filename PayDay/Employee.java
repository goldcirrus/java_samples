public class Employee extends StaffMember {

    protected String socialSecurityNumber;

    protected double payRate;

    
    //constructor to set up Employee information name,address,phone,socialnumber, pay rate
    public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
{
         super (eName, eAddress, ePhone);      //super StaffMember constructor to set up name,address, phone variables in upper level StaffMember Class
      
         socialSecurityNumber = socSecNumber;     //set up the rest variables in its own class
         payRate = rate;
}
    
    
    @Override
    public double pay() {              //override StaffMember's abstract method pay()
        return payRate;                //emplyee object only get monthly rate amount (no bonus added)
    }

    
   
    @Override                        //return Employee's basic information to add the variable in its own Class
    public String toString() {
        String result = super.toString();        //use its parent class toString to get variables in upper level
        result += "\nSocial Security Number: " + socialSecurityNumber;   //add the variables in its own class
        return result;
    }
   
    
}
