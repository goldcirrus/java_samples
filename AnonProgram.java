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
        Test t3 = new Test()
        {
          public void f()
          {
              System.out.println("This is f() in anonymous inner class");
              
          }
        };
        
        t3.f();
    }
    
}
