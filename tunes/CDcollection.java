
package tunes;
import java.text.NumberFormat;
import java.util.Locale;

public class CDcollection {
    
    private CD[] collection;      //declare: this class has a object's variable which is an array called collection, which has CD type elements
    private double totalCost;
    private int countIndex;
    
    public CDcollection()     //constructor to create a CDcollection object to initialize the object's three variables
    {                      //this CDcollection object has three variables: an array to hold CD elements, a count to control array variable's index, another variable totalCost to control the sum of CD elements' variable
         this.collection = new CD[5];      //initialization: assign size(5) to this variable-(an array named collection)
         this.totalCost = 0.0;     //for array(collection)'s CD element's variable:cost
         this.countIndex = 0;             //to control array(collection)'s index
    }
    
    
         //a method to double variable collection's size, service method to serve another method within this class
    private void doubleArrayVariableSize() 
    {                     //this is the calling CDcollection object built by the above constructor. This has a variable called collection(an array)
         CD[] newCollection = new CD[this.collection.length*2];      //calling object is a CDcollection object which contains an array variable(collection), this method will double the size of this calling object's collection variable's size
         
         for (int i=0; i<this.collection.length; i++)
             newCollection[i] = this.collection[i];                        //temp's first half = this.collection's elements
         
         this.collection = newCollection;                            //renew/reset/change this.collection equal to temp
    }                                      //the collection's reference is reset to temp's reference, the old collection's reference is lost for garbage collection
    
    
         //a method to add a CD to the CDcollection object's array variable(collection), double this.collection array variable's size when necessary
    public void addCD(String titleX, String artistX, double costX, int trackX)    //add array's element CD     
    {
         if (this.countIndex==this.collection.length)            //use object's variable: count to control when to double variable's size to hold more CD elements and to control where to add a new CD object
             doubleArrayVariableSize();         //this is a private serve method within the Class
                                                                             //count use to position array's index where to add another new CD element
         this.collection[countIndex] = new CD(titleX,artistX,costX,trackX);        //addCD()'s parameters passed to new CD constructor to create a new CD object
         this.countIndex++;
         
         this.totalCost += costX;          //the sum of array(collection)'s each element CD's cost variable.
    }
    
//when an CDcollection object is called to be a String to print out a report or concatnate with another String 
    @Override
    public String toString()     //for a CDcollection object
    {      
         NumberFormat fmt= NumberFormat.getCurrencyInstance(Locale.CANADA);
         
         String str;
         str = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
         str += "My CD collection are as follows:  \n";
         str += "Number of CD: " + countIndex + "   Total Cost of CD: " + fmt.format(totalCost);
         str += "  Average of CD cost: "+ fmt.format(totalCost/countIndex);
         str += "\n CD List: \n";
         
         for (int i=0; i<this.countIndex; i++)
             str += this.collection[i].toString() + "\n";
         
         return str;
    
    }
    
    
}
