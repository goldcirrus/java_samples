public class Staff {

    private StaffMember[] staffList;      //staffList array elements are declared as StaffMember Type reference
    
    //constructor: to create an StaffMember Type reference array, and initialize each elements as different object level by new keyword
    public Staff()
    {
           staffList = new StaffMember[6];      /*the array elements are the same referece type and the objects refered by the array elements are in different level */
           
           //array element staffList[0] is StaffMember Type when the array is declared above, but object is initialized as Executive Object
           staffList[0] = new Executive ("Tony", "123 Main Line","555-0469", "123-45-6789", 2423.07); //this rate is monthly rate
           
           //array elements are declared as StaffMember Type, objects are Employee object level
           staffList[1] = new Employee ("Paulie", "456 Off Line","555-0101", "987-65-4321", 1246.15);  //these rates are monthly rate
           staffList[2] = new Employee ("Vito", "789 Off Rocker","555-0000", "010-20-3040", 1169.23);
           
           //staffList[3] element is declared as StaffMember Type when the array staffList is declared, but objects is initialized as Hourly object level
           staffList[3] = new Hourly ("Michael", "678 Fifth Ave.","555-0690", "958-47-3625", 10.55);  //10.55 is hourly rate
           
           //array elements are declared as StaffMember Type, but objects are Volunteer Objects level
           staffList[4] = new Volunteer ("Adrianna", "987 Babe Blvd.","555-8374");   //volunteers have no rate.
           staffList[5] = new Volunteer ("Benny", "321 Dud Lane","555-7282");
           
           
     //the stafflist[0] element is StaffMember Type when the array was declared, but now it is cast down to Executive Type, so the object(Exective level object when initialized by new) can have visibility to Executive Class method   
     //to retrieve awardBonus method in Executive Class to set bonus(Executive Class variable) amount==500
     /* the generic StaffMember reference must be cast into an Executive reference to invoke the awardBonus method (because it doesn’t exist for a StaffMember). 
        there is no abstract method .awardBonus() in StaffMember Class, therefore, The StaffMember reference must be cast into Executive Class reference to have visibility to use this method      */
     
           ((Executive)staffList[0]).awardBonus (500.00);        
            
           
           
     //The staffList[3] element is a StaffMember Type and is cast down to Hourly Type to use Hourly Class method: addHours()
           ((Hourly)staffList[3]).addHours (40);         //this hourly object now can add 40 hours to set hoursworked variable(in Hourly Class)==40
    }

    
    /*scan through employees to print their basic information first
    then invoke pay() method, which is polymorphic because each Class has its own version of pay() method*/
    public void payday() {
            
        double amount;
          
        for (int index=0; index < staffList.length; index++)    //print out each person's information
        {
              System.out.println (staffList[index]);          //print out each person's name, address, phone, social number, and hoursworked for Hourly person
                                                          //each array element is initilized as different level of objects by new keyword, so different toString() methods for different level of objects are called
          //calculate each person's pay amount
              amount = staffList[index].pay(); // polymorphic, no Type cast here, see the comments in the end of this page
                               //pay() method is defined as abstract method in StaffMember Class, so .pay() can be invoked here because array elements is declared as StaffMember Type
                                      //different version of pay() method is used based on the object initialized by new keyword: the object initialization by new decides the objects, and the version in objects initialization level is called
                                                  
                if (amount == 0.0)        //volunteers
                    System.out.println ("Thanks!");
                 else
                    System.out.println ("Paid: " + amount);   //non volunteer personel with an amount not 0.0                
              System.out.println ("-----------------------------------");
        }
        
    }
    
    
}

/* If the pay() method had not been established in StaffMember as an abstract method, the compiler would complain 
when pay() was invoked through an element of the staffList array which is declared as StaffMember Type. Then cast is required. 

The abstract method pay() in StaffMember Class guarantees the compiler that any object referenced(by declared Type as StaffMember Type) through the staffList array (elements) has a pay() method(in different Classes) defined for it.    */