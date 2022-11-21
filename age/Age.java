
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age;
import java.util.Scanner;


/**
 *
 * @author Kevin
 */
public class Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int MINOR = 21;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your age on the next line:");
        int age = scan.nextInt();
        
        System.out.println("Your age is "+ age+".\n");
        
        if (age<MINOR) 
            System.out.println("You are too young, and not allowed to drink.\n");
        else  
            System.out.println("Ok, you are allowed to drink.\n");
        
        System.out.println("Common Command.\n");
        
        int num1 = 1234567890;
        float num2 = num1;
        System.out.println("num2 is: "+num2);
    }
    
   
    
}
