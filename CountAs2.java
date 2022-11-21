package countas2;
import java.util.Scanner;

/**
 * @author Liang Zhong  T00224182 
 * <br>
 * This program prompts the user for a sentence. 
 * Then program displays the position of where the lowercase letter 'a' appears everywhere in the sentence
 */
public class CountAs2 {

 /** Simple Class to execute the program
 * <br> 1.prompts to enter a sentence
 * <br> 2.store the input sentence in a local String variable
 * <br> 3.change the string to a character array.<br> 4.check each array element, if the char element equals 'a', then print out its index plus 1
 
 * @param args
 */
    public static void main(String[] args) {
        
        String sentence;   /** variable to hold the input sentence */
        
        Scanner scan= new Scanner(System.in);          /** create a Scanner class object to take input sentence from keyboard */
        System.out.println("Enter a sentence: ");
        sentence= scan.nextLine();                         /**store the input string in sentence variable */
        
       char [] sentenceArray= sentence.toCharArray();     //* change the input string to a character array */
       
       for(int i=0; i<sentenceArray.length; i++)           //* check each array element, if this element equal to 'a' char, then printout its index plus 1 */
       {
             if(sentenceArray[i]=='a')                      
                 System.out.println("The lowercase letter 'a' appears at character position "+ (i+1));
       }
        
        
    }
    
}
