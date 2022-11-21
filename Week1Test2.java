/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1test2;
import java.util.Scanner;


/**
 *
 * @author Kevin
 */
public class Week1Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // mile per gallon practice
        int miles;
        double gallons, mpg;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of miles:  ");
        miles = scan.nextInt();
        System.out.println("Enter the number of gallons of gas used: ");
        gallons = scan.nextDouble();
      
        mpg = miles/gallons;
        System.out.println("The mpg is "+mpg+".");
        
        // String assignment practice
        String x1 = "abcde";
        System.out.println("this is x1: "+x1);
        String x2 = "1234";
        System.out.println("this is x2: " + x2);
        x1 = "8910";
        System.out.println("this is new x1: "+x1);
        System.out.println("this is new x2: " + x2);
        
        // string mutation practice
        String phase = "Chang is inevitable."; //phase is instentiated as a string object
        System.out.println("original string phase is: " + "\""+phase+"\"");
        int phaselength = phase.length();
        System.out.println("phase length is: " + phaselength);
        
        String m1 = phase.concat("But,we can live with it."); //m1 is instentiated as a new string object
        String m2 = m1.toUpperCase(); //m2 is created as a new string object
        String m3 = m2.replace('E', '5');  //m3 is created as a new string object
        String m4 = m2.substring(5, 8);
                 
        int m4length = m4.length();
        
        System.out.println("m1 is: "+m1);
        System.out.println("m2 is: "+m2);
        System.out.println("m3 is: "+m3);
        System.out.println("m4 is: "+m4);      
        System.out.println("m4's length is: "+m4length);
                                        
    }
    
}
