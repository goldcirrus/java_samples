/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcuzzola
 */
public class AnonProgram {
    
    
    public void start()
    {
        /**
        Test t1 = new Test();
        t1.f();
        
        System.exit(0);
        
        Tester t2 = new Tester();
        t2.f();
        
        System.exit(0);
           */
        Test t3 = new Test()     //annotate an anonymous inner class for Test Class object t3
        {                       
          public void f()         //inside this anonymous inner class, write a different version of function f()
          {
              System.out.println("This is f() in anonymous inner class bulit when new object is created, which overrides other f() in other classes");
              
          }
        };
        
        t3.f();      //t3 call its own anonymous inner class version of method f()
    }
    
}
