public class Volunteer extends StaffMember {
    
    //constructor
    public Volunteer (String eName, String eAddress, String ePhone)
{
        super (eName, eAddress, ePhone);
}
    
    @Override     //every child class must override the abstract method pay() eventhough this child class does not need it. 
    public double pay() {
        return 0.00;
    }
    
    /*If pay() had not been overridden in Volunteer Class,the Volunteer class would have been considered abstract and could not
      have been instantiated.   */
}
