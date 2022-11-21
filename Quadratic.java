/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Quadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // aX^2 + bX + c = 0 solve X = -b +/_ Sqrt:(b^2 -4ac) / 2a
        int a,b,c;
        double agent,root1,root2;
        
        //assign value to a,b,c
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a:  ");
        a = scan.nextInt();
        System.out.println("a is: "+a);
        System.out.println("Enter the value of b:");
        b = scan.nextInt();
        System.out.println("Enter the value of c: ");
        c = scan.nextInt();
        
        //solve for agent = b^2 -4ac
        agent = Math.pow(b, 2)-(4*a*c);
        if (agent >=0){
               System.out.println("agent is: "+agent);
        //solve for roots
       
               root1 = (-b + Math.sqrt(agent))/(2*a);
               root2 = (-b - Math.sqrt(agent))/(2*a);
        
               System.out.println("the root1 is: "+root1);
               System.out.println("the root2 is: "+root2);           
        }
        else{
            System.out.println("no solution");
        }
        
        
    }
    
}
