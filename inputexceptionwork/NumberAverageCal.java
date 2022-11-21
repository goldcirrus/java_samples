/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputexceptionwork;
import java.util.*;


/**
 *
 * @author Kevin
 */
public class NumberAverageCal {
    
    /**the variable to store input double number value.*/
    private double input;
    
    /**the variable to store the total value of input numbers. */
    private double total;
    
    /**the variable to store the final average value of input numbers. */
    private double average;
   
    
    /**the method to ask input numbers and calculate their average value. A exception try-catch is used to catch any wrong type 
     * of input value.
     */
    public void average()
    {    
         total = 0.00;       //initial value of total is 0.00
         Scanner scan = new Scanner(System.in);
         int counter=0;
         
         while(counter<10)
         {
             System.out.println("Please enter a number");
             try{                                               //try block: normal codes in test
                input = scan.nextDouble();                      //when user type non double type data in keyboard, the scanner object can not take a wrong type data from keyboard muffer memory - mistake happens. so input variable is not assigned to a new value from keyboard in this round, it stays with the value from last round. 
                counter++;                                       //when user type non double type data in keyboard, input has value from last round, and counter is not incremented
             }
             catch(InputMismatchException ex)
             {                                               //catch block: the codes will be executed when the tested codes in try block has mistakes
                 System.out.println("Please enter a number only, thanks.");
                 scan.nextLine();                       //scan.nextLine() will take and clear the keyboard muffer memory stored non-double type data,therefore keyboard is cleared to take new keyed in value for the next round.
                 
                 System.out.println(input+" is the input value when non doulble type number is keyed in keyboard and not cleared to 0.");  //if not clear input variable to 0, input is the value from last round.
                 input=0;      //input for this round must be cleared to 0. 
                 
             }                                          
             
             total += input;            
            
         }
     
         average = total/10;
         System.out.println("The average of input numbers is "+average);
    }
    
}
