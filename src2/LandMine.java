import java.util.*;


/**class to create mine objects. */
public class LandMine {
    
    /**Random object to create random coordinate values for LandMine objects. */
    private Random rand= new Random();

    /**Stores LandMine's x-coordinate value chosen randomly by the computer. */
    private int mineX;

    /**Stores LandMine's y-coordinate value chosen randomly by the computer. */
    private int mineY;
 
    /**Store the character symbol to represent mines on the grid. */
    private final String mineChar;
    
    
    

    /**Constructor to create a LandMine object with two random x and y coordinates values chosen by the computer. */ 
    public LandMine() {
        
       /**an integer between 0 and 24 is randomly chosen by the computer for LandMine's x coordinate value. */
       mineX= rand.nextInt(25);
       
       /**an integer between 0 and 49 is randomly chosen by the computer for LandMine's y coordinate value. */
       mineY= rand.nextInt(50);
       
       mineChar="*";
    }
    
    
    /**method to retrieve the mine character. */
    public String getMineChar()
    {
        return mineChar;
    }
    
    
    /**method to set mine row number with a random integer.  */
    public int setMineX()
    {
        /**an integer between 0 and 24 is randomly chosen by the computer for LandMine's x coordinate value. */
       return mineX= rand.nextInt(25);
    }
    
    /**method to set mine column number with a random integer. */
    public int setMineY()
    {
        /**an integer between 0 and 49 is randomly chosen by the computer for LandMine's y coordinate value. */
       return mineY= rand.nextInt(50);
    }
    
    
    /**method to retrieve the row number of a mine. */
    public int getMineX()
    {
       return mineX;
    }
    
    
    /**method to retrieve the column number of a mine. */
    public int getMineY()
    {
       return mineY;
    }
    
    
    
    
}
