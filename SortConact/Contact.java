/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 * Contact Class implements Comparable interface so it defines what the compareTo() method do
 * The Comparable interface contains only one method, compareTo(Object x), which takes an object
 * as a parameter and returns an integer.
 */
public class Contact implements Comparable {
    
    private String firstName, lastName, phone;
//-----------------------------------------------------------------
// Contact constructor: Sets up this contact with the specified information.
//-----------------------------------------------------------------
public Contact (String first, String last, String telephone)
{
firstName = first;
lastName = last;
phone = telephone;
}
//-----------------------------------------------------------------
// Returns a string representation of this contact objcet.
//-----------------------------------------------------------------
    @Override
public String toString ()
{
return lastName + ", " + firstName + ": " + phone;
}
//-----------------------------------------------------------------
// Uses both last and first names to determine lexical ordering.
// when a contact object call compareTo() method, pass in a Object type object, 
// so must cast Object type object to Contact type object
//-----------------------------------------------------------------
    //Contact Class implements Comparable interface so it defines what the compareTo() method do
/**The Comparable interface contains only one method, compareTo, which takes an object
   as a parameter and returns an integer.
**/
    @Override      
public int compareTo (Object other)
{
int result;
                              //other is a Object object, so cast other to Contact type
if (lastName.equals(((Contact)other).lastName))    //same .equals returns true, not same returns false
    result = firstName.compareTo(((Contact)other).firstName);  //如果last name 同，比较first name, 
else            //here it is String.compareTo(String) use compareTo() defined by String class
    result = lastName.compareTo(((Contact)other).lastName);    //else: 比较last name

return result;
}
    
}
