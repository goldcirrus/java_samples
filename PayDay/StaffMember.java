
abstract public class StaffMember {         //StaffMember is abstract Class

    protected String name;

    protected String address;

    protected String phone;
   
    //constructor: highest level person
    public StaffMember (String eName, String eAddress, String ePhone)
{
        name = eName;
        address = eAddress;
        phone = ePhone;
}
    
/* If the pay() method had not been established in StaffMember as an abstract method, the compiler would complain 
when pay() was invoked by payday() in Staff Class through an element of the staffList array which is declared as StaffMember Type. Then cast is required. 
The abstract method pay() in StaffMember Class guarantees the compiler that any object referenced(by declared Type as StaffMember Type)
through the staffList array (elements) has a pay() method(in different Classes) defined for it.    */
//abstract method can't have body
    public abstract double pay();
    

    
    @Override        //return a string contains basic employer information of name,address,phone
    public String toString()
{
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;
}


}
