package countas;
import java.util.Scanner;


/**
 * 
 * @author Liang Zhong (Kevin) T00224182
 * This program prompts the user for a sentence. Then the program displays the position of where the lowercase letter 'a' appears everywhere in the sentence
*/
public class CountAs {
 /**
 * simple method
 * <br> 1.prompts to enter a sentence
 * <br> 2.check each character in the sentence by a for loop, if the character equals 'a', then print out its index plus 1
     * @param args
 */
    

    public static void main(String[] args) {
        /** String variable to hold the entered sentence*/
        String sentence;                                     
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a sentence: ");          /**prompt to enter a sentence */
        sentence= scan.nextLine();
        
        
        for(int i=0; i<sentence.length(); i++)               /**check each character in the sentence, if the character equals 'a', then print out its index plus 1 */
        {
             if(sentence.charAt(i)=='a')
                 System.out.println("The lowercase letter 'a' appears at character position "+(i+1));
        }
        
        
        switch ('7')
        {
            case 'a':
                System.out.println("go case a");
                System.out.println("go case a222");
                System.out.println("go case a333");
                
            case'b':
                System.out.println("go case b");
                break;
            case't':
                System.out.println("go case t");
                break;
            case's':
                System.out.println("go case s");
                break;
            default:
               System.out.println("do default");
        }
        
        System.out.println("next one");
        
            
        
    }
    
}
