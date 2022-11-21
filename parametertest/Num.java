/*
represent an integer as a object
 */
package parametertest;


public class Num {
    
    private int value=0;     //this is the local(private) variable every Num Class object has, its unique value for each Num Class object is set in a new object's Constructor
    
         //Num class object constructor, to pass in initial value to create a new object's variable value
    public Num (int iniValue)     
    {
         value = iniValue;         //this Num class object store an initial value passed by its constructor parameter
    }
    
    public void setValue (int update)    // change the original constructor's variable's value to a new value
    {
         value = update;
    } 
    
    @Override
    public String toString()     //return the stored integer variable value by a Num Class object as a string, so the value contained by a Num Class object can be print out, or concatnated with another string
    {
         return Integer.toString(value);     //value is an integer type primitive data, so use Integer.toString() to retrun a string of value
         // or use:     return value+"";     value is an integer, but concatnate with a string "", so total is a string 
    }
    
}
