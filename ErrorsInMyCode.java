
import java.io.*;

/*
 * ErrorsInMyCode class contains the methods to be executed in the driver class
 */

/**
 *
 * @author jcuzzola
 */
public class ErrorsInMyCode {
    
    
    public void array_index_problem()    //contains a java.lang.ArrayIndexOutOfBoundsException
    {
        int[] a = new int[2];
        
        System.out.println(  a[2] );
        
        System.out.println("Here I am");
        
        System.out.println("All good here");
    }
    
     
     
    public Integer divide_by_zero()     //contains error: java.lang.ArithmeticException
    {
        int a = 7;
        
        int b = 0;
        
        return a/b;
    }
    
    
    public void wrong_cast()   //contains error: java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
    {
        Object o = new Object();
        
        String myString = (String) o;     //object can't be down casted, because it could be something other than String object
    }
    
    
    public void null_pointer()        //contains error: java.lang.NullPointerException: object doesn't exist
    {
        Object o = null;                        //Object o = new Object();   correct
        
        System.out.println( o.toString() );
    }
    
    
    
    
    /**********************************************************
     * STOP - don't go further until asked by the instructor  *
     **********************************************************/
    
    
    public void step1()
    {
        System.out.println("Im in step1");
        step2();                                    //step1() calls step2()
        System.out.println("leaving step1");
    }
    
    public void step2()
    {
        System.out.println("Im in step2");
        step3();                                     //step2() calls step3()
        System.out.println("leaving step2");
    }
    
    public void step3()
    {
        System.out.println("Im in step3");
        
        crash_me();                                  //step3() calls crash_me()
        
        System.out.println("leaving step 3");
    }
    
    public void crash_me() 
    {
        System.out.println("Im in crash me");
        try
        {
        Object o = null;                             //nullpointer error
        System.out.println( o.toString() );
        }
        catch(NullPointerException ex)
        {
            System.out.println("caught error NullPointerException in crash_me method, and leaving crash_me method.");
        }
    }
    
    
    
    
    public void two_problems()     //multiple exception errors
    {
        // ClassCastException: down cast error
        Object o = new Object();
        String myString = (String) o;     
    
        // NullPointerException error
        Object oo = null;
        System.out.println( oo.toString() );
    
    }
    
    public void two_problems_ex1()
    {
        /** 1st try-catch **/
        try {
                   // try catch: ClassCastException
            Object o = new Object();
            String myString = (String) o;
        } 
        catch(ClassCastException ex)
        {
            System.out.println("try each code block and caught 1st error in codes: ClassCastException");
        }
        
        /** 2nd try-catch **/
        try {
                           // try catch: NullPointerException
            Object oo = null;
            System.out.println( oo.toString() );
        } 
        catch(NullPointerException ex)
        {
            System.out.println("try each code block and caught 2nd error in codes:  NullPointerException");
        }   
        
    }
    
    
    public void two_problems_ex2()
    {
        /** try-catch-catch **/
        try {                                 // ClassCastException
            Object o = new Object();
            String myString = (String) o;
                                              // NullPointerException
            Object oo = null;
            System.out.println( oo.toString() );
        }
        catch(NullPointerException ex)
        {
            System.out.println("try all together and catch seperately:caught 2nd error in codes: NullPointerException");
        } 
        catch(ClassCastException ex)
        {
            System.out.println("try all together and catch seperately:caught 1st error in codes: ClassCaughtException");
        }
        
    }
    
    public void two_problems_ex3()
    {
        /** try-catch-OR **/
        try 
        {                                  // ClassCastException
                Object o = new Object();
                String myString = (String) o;
                                                        // NullPointerException
                Object oo = null;
                System.out.println( oo.toString() );
        } 
        catch(NullPointerException | ClassCastException ex)
        {
            System.out.println("try the whole codes and caught NullPointerException or ClassCastException in one catch");
        } 
    }
    
    public void two_problems_ex4()
    {
        /** try-catch-OR-instanceof **/
        try {                                    // ClassCastException
            Object o = new Object();
            String myString = (String) o;
                                                 // NullPointerException
            Object oo = null;
            System.out.println( oo.toString() );
        } 
        catch(NullPointerException | ClassCastException ex)
        {       //first error in above codes is the ClassCastException.After the 1st error is found, the following codes in try{} won't be executed, so the second error wont get a chance to be checked and thrown
            if ( ex instanceof NullPointerException ) System.out.println("caught NullPointerException");
            if ( ex instanceof ClassCastException ) System.out.println("caught ClassCastException");
        } 
    }
    
    
    /**
     * DON'T uncomment this section. There is an error (on purpose) in it that we will discuss in class.
    */
    
    
    
    public void call_file_problem()      //throws OException to its upper level (if don't do try catch), move error message to higher level 
    {   
        try                  //use try catch here, so no need to throws IOException after method name
        {
        file_problem();
        }
        catch (IOException | NullPointerException ex)
        {
            System.out.println("try call file_problem() and caught IO or NullPoint Exception error in file_problem() because file_proble() use throws IO, NullPoint ");
        }
    }
    
    
    public void file_problem() throws IOException, NullPointerException    //IOException is checked exception, Null is unchecked exception because io desn't exist. 
    {               //must use throws IOException because IOException is a checked exception error. 
        try{
        InputStream io = ErrorsInMyCode.class.getResourceAsStream("/path/to/file/filename.txt");
       
        io.read();     //checked exception here .read() may not have the path
        }
        catch(IOException | NullPointerException ex)
        {
            System.out.println("try file_problem(), caught IOException and NullPointerException error");
        }
    }
    
   
}
