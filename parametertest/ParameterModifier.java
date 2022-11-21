/*
 * If we don’t provide a constructor for a class, a default constructor that takes
no parameters is automatically created and used. The default constructor generally
has no effect on the newly created object. If the programmer provides a constructor,
with or without parameters, the default constructor is not defined.
 */
package parametertest;

/**
 *Modifies the parameters, printing their values before and
  after making the changes.
 */
public class ParameterModifier {
    
    public void changeValue (int primitive1, Num p2, Num p3)   //this method is not a static meathod, so it need an ParameterModifier object to invoke this method. 
    {
          System.out.println("*********inside changeValue method*********");
          System.out.println("actual parameters(a,b,c) are passed into pmObj.changeValue(primitive1,p2,p3) method for formal parameter p1,p2,p3, Before we chang p1,p2,p3 value, we print out p1,p2,p3 values,and they should equal a,b,c:");
          System.out.println("original value of formal parameter primitive1 as passed in from primitive data integer a: "+ primitive1);     //the current value of the actual parameter (a in the invocation) is copied into the formal parameter (p1) in the method header
          System.out.println("original value of formal parameter p2 as passed in from Num object b's private variable(value==20): "+ p2);     //b is an object, so when we pass an object(b) to a formal parameter(p2), we actually passing a reference to object(b) to a formal parameter(p2). The value that get copied is the address of object b. Now, formal parameter(p2) points to the same object as actual parameter(b) points to.
                                                                                     //therefore the formal paramete(p2) and the actual parameter(b) become aliases of each other. They refer to the same object.
          System.out.println("original value of formal parameter p3 as passed in from Num object c's private variable(value==30): "+ p3);     //c is an object, so it is the same as b, passed its referenct to p3. the formal parameter(p3) and actual parameter(c) are aliases, and they point to the same object.
          
          //making change to a formal parameter inside a method
          primitive1 = 999;               //the formal parameter(primitive11) is a seperate copy of the value that is passed in by actual [primitive data type int] parameter(a), so any change made to the formal parameter(p1) has no effect on the actual parameter(a). 
                                  //After control returns to the calling method, the actual parameter(a) will have the same value as it did before the method changValue() is called.
          
          p2.setValue(888);       //formal parameter(p2) and actual parameter(object b) are aliases.If we change the state of this object through the formal parameter(p2) reference inside the changeValue() method, we change the exact same object referenced by the actual parameter(b), because p2 and b point to/refer to the same object.
                                  //this setValue() operation changes this object(p2==b)'s private variable(value), therefore, this SetValue() has effects on both (p2) and (b)
          
          p3 = new Num(777);      //on the other hand, actual parameter(p3) now points/refers to an new Num class object <new Num(777)>. Now the actual parameter(p3) doesn't points/refers to the old object(c) which is refered by the actual parameter(c) anymore. The old aliases between (p3) and (c) is broken. therefore, the change to (p3)'s new object has no effect on (c)'s private variable(value).
                                  // we change formal parameter(p3)'s reference itself. To make it point to a new object.We have not changed the fact that the actual parameter(c) still refers to the original object(c).
          System.out.println("*********************");
          System.out.println("After change the formal parameter values(primitive1,p2,p3) in different ways in the changeValue() method: ");
          System.out.println("new value of formal parameter primitive1: "+primitive1);
          System.out.println("new value of formal object parameter p2: "+p2);
          System.out.println("new value of formal object parameter p3: "+p3);
          System.out.println("***********over inside changeValue method************");
    }
    
}
