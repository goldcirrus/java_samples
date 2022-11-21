import java.util.*;

/**Class to create a flag object. */
public class Flag {
    /**Random object to create random integers to represent the flag's coordinates value. */
    private Random rand= new Random();
    
    /**Store the flag's x-coordinate value.   */
    private int flagX;
   
    /**Store the flag's y-coordinate value. */
    private int flagY;

    
    

    /**Constructor to create a flag object contains its x and y coordinate value on the grid. */
    public Flag() {
       /**an integer between 0 and 24 is randomly chosen by the computer for flag's X coordinate value. */
        flagX=rand.nextInt(25); 
        
        /**an integer between 0 and 49 is randomly chosen by the computer for flag's y coordinate value. */
        flagY=rand.nextInt(50);
        
    }
    
    /**method that set flag's x-coordinate value by a random integer chosen by the computer. */
    public int setFlagX() {
        /**an integer between 0 and 24 is randomly chosen by the computer for flag's X coordinate value. */
        return flagX=rand.nextInt(25); 
    }

    /**method that set flag's y-coordinate value by a random integer chosen by the computer. */
    public int setFlagY() {
        /**an integer between 0 and 49 is randomly chosen by the computer for flag's y coordinate value. */
        return flagY=rand.nextInt(50);
    }
 
    /**method that retrieves the flag's x-coordinate value. */
    public int getFlagX() {
        return flagX;
    }

    /**method that retrieves the flag's y-coordinate value. */
    public int getFlagY() {
        return flagY;
    }
}
