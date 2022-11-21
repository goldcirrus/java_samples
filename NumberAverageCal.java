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
         
         for(int i=0; i<10; i++)
         {
             System.out.println("Please enter a number");
            
             try{
                Scanner scan = new Scanner(System.in);
                input = scan.nextDouble();
             }
             catch(InputMismatchException ex)
             {   
                 Scanner scan = new Scanner(System.in);
                 System.out.println("Please enter a number only, thanks.");
                 input = scan.nextDouble();
             }
             
             total += input;
         }
     
         average = total/10;
         System.out.println("The average of input numbers is "+average);
    }
    
}
