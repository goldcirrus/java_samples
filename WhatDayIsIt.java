
import java.util.Scanner;



/**
 *
 * An example that demonstrates how to create and throw your own exceptions
 */
public class WhatDayIsIt {
    
    /** Asks the user what day of the week it is and prints out a message.
     * Throws a custom "I Don't Like Mondays" exception if Monday is given as
     * an answer.
     */
    public void ask() throws IDontLikeMondaysException
    {
        Scanner scan = new Scanner(System.in);
        
        /** Infinite loop. Only way to exit is to answer 'monday' and have the exception thrown */
        while(true)
        {
        
            /** prompt the user what day is it */
            System.out.println("What day of the week is it?");
            
            /** convert the user's answer to lowercase then check to see what day of the week was entered.
             * I decided to use a 'switch' statement but a bunch of IF-THEN-ELSE statements would work too.
             * If you're unfamiliar with using the switch keyword there are plenty of examples/explanations
             * on the Internet. https://www.baeldung.com/java-switch   
             */
            switch( scan.nextLine().toLowerCase() )        //Scanner object(scan) takes keyboard muffer memory stored data from user keyed in data
            {
                
            
            case "tuesday":
                System.out.println("Barely into the week");
                break;
                
            case "wednesday":
                System.out.println("Hump day! (middle of the week)");
                break;
                
            case "thursday":
                System.out.println("Almost the weekend");
                break;
                
            case "friday":
                System.out.println("TGIF");
                break;
                
            case "saturday":
            case "sunday":
                System.out.println("The weekend is here!");
                break;
                
            case "monday":       //only when user key in "monday", the switch option doesn't break, but to throw an Exception
                System.out.println("I HATE MONDAYS!");
                
                /** Exceptions ARE classes. So we need to create an instance of
                 * that class (object) before we can use it (i.e: we need to NEW like any other
                 * class we want to use and store it in a variable.
                 */
                IDontLikeMondaysException ex = new IDontLikeMondaysException();   //create your own Exception Class(IDontLikeMondayException) object:ex
                
                /** and here is how we use it. We use the keyword 'throw' that tells
                 * java to throw the Exception (instance variable ex in our case) up the
                 * call stack. If our exception is not caught before it reaches the Java
                 * runtime engine then this program will terminate and an error message
                 * will be displayed.
                 */
                throw ex;
                
                
            default:
                System.out.println("Wrong answer. What day of the week is that?");
            }
        }
    }
    
}
