/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Searching {
    
    //-----------------------------------------------------------------
// Searches the specified array of objects using a linear search
// algorithm. Returns null if the target is not found.
// return the Comparable object result: null if not find the target object, or target object if found
//Comparable[] contain Comparable type object to be comparedTo()
//-----------------------------------------------------------------
public static Comparable linearSearch (Comparable[] data, Comparable target)
{
Comparable result = null;      //initial Comparable object(result):"whatever object is compared to each other" is null
int index = 0;
while (result == null && index < data.length)
{               //compareTo() is defined in Contact class to compare first and last name only. 
  if (data[index].compareTo(target) == 0)    //if find the target object
      result = data[index];                  //Comparable object(result) is assigned by the found target object, result is not null and get out of the while loop
  index++;         //if not find the target object, result won't change, still is null, but index increase, so get out of while loop when go to the array end
}
return result;          //when while loop finish, return the Comparable object result(null if not find the target object, or target object if found
}
//-----------------------------------------------------------------
// Searches the specified array of objects using a binary search
// algorithm. Returns null if the target is not found.
//-----------------------------------------------------------------
public static Comparable binarySearch (Comparable[] data, Comparable target)
{
Comparable result = null;
int first = 0, last = data.length-1, mid;
while (result == null && first <= last)
{
mid = (first + last) / 2; // determine midpoint
if (data[mid].compareTo(target) == 0)
    result = data[mid];
else
if (data[mid].compareTo(target) > 0)
last = mid - 1;
else
first = mid + 1;
}
return result;
} 
}


/**Note that the parameters and return type of linearSearch refer to
Comparable objects, not Contact objects. That is, the linearSearch method
is implemented in terms of Comparable objects, not in terms of any particular
class. Recall from Chapter 9 that this situation is an example of polymorphism.
* The references to objects can take on any class of any Comparable 
* object that implements the interfaceComparable 
* Thus, the linearSearch method can be used to search any array of Comparable objects**/