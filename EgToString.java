
package egtostring;


public class EgToString {
    
    private int day;
    private int month;
    private int year;
    
    //constructor of EgToString
    public EgToString (int d,int m,int y)
    {
         day = d;
         month = m;
         year = y;
         
         System.out.printf("constructor of a object with auto override: %s.%n", this); //toString automaticlly override
         System.out.printf("This is the constructor of a object with: %s.%n", this.toString()); //this.toString() better to read
         System.out.println(this);
         System.out.println(this.toString());
         System.out.format("print out string of this toString called: %s%n", this);
         System.out.format("construct example: %s.%n", this.toString());
         
         
         System.out.printf("test two with %s.\n", String.format("second object variable format %d:%d:%d", day,month,year));
         
         System.out.printf("another object variable format of time %d-%d-%d.\n", day,month,year);
         
         System.out.format("easiest object format %s-/%s-%s.\n", day,month,year);  //convert integer to string directlly
         
         
    }
    //this means the object created.  "this" is a reference to an object when everytime to call a constructor
    //the object stores three integer variables: day,month,year, so "this" represents the value of the three variables of the object as day,month,year. 
    //printf looks for string format of 'this-object' ---> toString method convert integer variables:day,month,year to String. Done
    
    @Override  //override this object address: egtostring.EgToString@4aa298b7
    public String toString(){  
        return String.format("override object's format as: %d/%d/%d", day,month,year);
    
    } //if this method is delete, then first 3 print out is this's address
    
    public static void main(String[] args) {
        // create an object by calling the constructor,day=5,month=6,year=2018
        EgToString obj1 = new EgToString(5,6,2018);
    }
    
}
