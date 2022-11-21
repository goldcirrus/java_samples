import java.util.*;

public class LetterBlock {
    
    Random rand = new Random();
    
    /**class variable to store a letter. */
    private char letter;

    
    /**constructor to generate a LetterBlock object which set class variable letter equals a randomly generated letter between A and Z. */
    public LetterBlock() {
        
        /**randomly generate integers between 65 and 90 inclusively.*/
        int range = 65 + rand.nextInt(25);
        
        /**variable letter is casted integer range(65-90) inclusively to char characters(A-Z). */
        letter = (char)range; 
    }

    
    
    /**method to get the randomly generated letter between A and Z.
     * @return the random generated char character. */
    public char getLetter() {
        return letter;
    }
}
