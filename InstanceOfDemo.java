/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceofdemo;

/**
 *
 * @author Kevin
 */

public class InstanceOfDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parent obj1 = new Parent();          //  obj1: declared as Parent Type, also ini as Parent object
        Parent obj2 = new Child();          //   obj2: declared as Parent Type, but ini as Child object
        
        System.out.println("obj1 instanceof Parent: "
            + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
            + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
            + (obj1 instanceof MyInterface));
        System.out.println("obj1="+obj1);
        System.out.println("--------------------");
        
        System.out.println("obj2 instanceof Parent: "
            + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
            + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
            + (obj2 instanceof MyInterface));
        System.out.println("obj2="+obj2);
        
    }
    
}

class Parent{ }
class Child extends Parent implements MyInterface { }
interface MyInterface { }
