/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sentence, result, another;
        
        do 
        {
              System.out.println("Enter a sentence: ");
              Scanner scan = new Scanner(System.in);
              sentence = scan.nextLine();
              
              result = PigLatinTranslator.translate(sentence);
              System.out.println("The translation in PigLatin is: \n" +result);
              
              System.out.println("If you like to try another sentence, please enter y, quit by Enter no");
              another = scan.next();
        }
        while ( another.equalsIgnoreCase("y"));
                
    }
    
}
