
package lettercount;
import java.util.Scanner;

public class LetterCount {

    
    public static void main(String[] args) {
        
        final int NUM_AL = 26;
        Scanner scan = new Scanner(System.in);
        
        int[] upper = new int[NUM_AL];       //create an array named upper to hold size=NUM_AL=26 int type variables, index from 0 to 26-1=25, those int variables are counters for A,B,C,...,X,Y,Z
        int[] lower = new int[NUM_AL];       //those variables are counters for a,b,c,d,e,.....,x,y,z
        
        char currentChar;              //variable to store the current character in the sentence being processed
        int countOther = 0;           //count space or other non alphabetics characters
        
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        
                                      //count the number of each alphabetic character's occurance
        for (int charX=0; charX<sentence.length(); charX++)      // check each character in the sentence from index=0 to index=length-1, use < not <=, so don't use length-1
        {     
            currentChar = sentence.charAt(charX);            //currentChar hold the character at index=charX position in the sentence
                                                         //if currentChar read from sentence is upper case letter                                  
            if (currentChar>='A' && currentChar<='Z')         //if this character at charX(integer) position in the sentence is between 'A' and 'Z'means it is a upper case character
                                                             //each char has a numeric value according to Unicode order
                     upper[currentChar - 'A'] ++;                //currentChar-'A' = index of currentChar in upper[], so the integer varialbe on index postion of(currentChar-'A') increment 1
                                                         //take the numeric value of 'E' - the numeric value of 'A' = the index of the counter which represent 'E', so the counter for 'E' in the array +1
                                                         //    upper[A,B,C,D,E,F,....,Y,Z]     'E'=69, 'A'=65, 'E'-'A'=69-65=4, index 4 is for 'E'
                                                          //  index=[0,1,2,3,4,5,....,24,25]    A65,B66,C67,D68,E69,F67,.....
          
            else if (Character.isLowerCase(currentChar))      //to check if the 'currentChar' is a lower case character
                
                    lower[currentChar - 'a'] ++;
            
            else                              // if currentChar is neither upper case letter nor lower case letter, then countOther +1
                     countOther ++;      
          }
        
        System.out.println("You entered sentence as: " +sentence);
        
        for (int letter=0; letter<upper.length; letter++)     //either letter<upper.length or letter<=upper.length-1
        {
               System.out.print((char)( 'A'+ letter) + ":" + upper[letter] +"\t");   // (char) ('A'+letter) print out, char 0+'A'=0+65=65, (cast) to char is 'A', (cast)'1+A'='B', 2+'A'=2+65=67 (cast) 67 to char ='C',..,25+'A'= 90,cast 90 to char = 'Z'  do adding two integers which represent char's numeric values, then cast the sum of numeric value back to char
                                                                                       // upper[0] is counter for 'A', upper[1] is counter for 'B',...,upper[25] is counter for 'Z'
               System.out.print((char)('a'+letter) +" :" + lower[letter] +"\t");
               
               System.out.println();
           
        }
        
        System.out.print("Non-alphabetic letters:" + countOther +"\n");
     
    }
    
}