
package variableparameters;


public class Family {
    
       private String[]  members;       //each Family object has an array variable(members)
       
       public Family(String... args)    //constructor: set up this Family object by pass in variable numbers of parameter to assign to this object's array variable(members)
       {
            this.members = args;           //assign value to this object's array variable(members) by vary length parameters passed into this object's array variable
       }
    
       @Override
       public String toString()
       {
            String str="";
            
           for (String memberX : this.members) {
               str += memberX + "   ";
           }
            
            return str;
       }
}
