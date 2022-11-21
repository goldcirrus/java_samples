/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minofthree;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Kevin
 */
public class MinOfThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0, num2=589, num3=5, min=0;
        double num4 = 7.868956698;
        
      // change an integer to string and print it out.
        System.out.println(java.text.NumberFormat.getIntegerInstance().format(num4));
        System.out.println(java.text.NumberFormat.getInstance().format(num4));
        System.out.println(java.text.NumberFormat.getCurrencyInstance(Locale.GERMANY).format(num4));
        System.out.println(java.text.NumberFormat.getPercentInstance().format(num4));
        //equal to printf
        System.out.format("This is a string of %d.%n", num2);
        
        //if statements
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integers.");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        
        if (num1 < num2) 
            if (num1 < num3)  //taken by the first followed else
                min = num1;
            else    //this else belongs to its precede if
                min = num3;
        else   // this else belongs to its precede available if
            if (num2 < num3)
                min = num2;
            else
                min = num3;
        
        System.out.println(min);
        
        
        
        
        
    }
    
}
