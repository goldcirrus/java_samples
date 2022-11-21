/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * This is an example to demonstrate how the "this" keyword always references
 * the current object. Notice how the doggie variable points to the same memory
 * object as the "this" keyword no matter from within which superclass of Dog.
 */
public class ExampleDriver {
   public static void main(String[] args)
   {
       Dog doggie = new Dog();       //create one Dog type object
       
       System.out.println( doggie );   //all points to the same 'this' object(Dog Object)
       doggie.what_is_this_Dog();        //Dog object uses Dog Class method
       doggie.who_is_this_Animal();       //Dog object uses Animal Class method
   }

}
