import java.util.*;

/**class to create a player1 object. */
public final class Player1 {
    /**Random object to create random coordinate values for player's initial position on the grid. */
     Random rand = new Random();
     
    /**Store player x-coordinate value. */
    private int playerX;

    /**Store player y-coordinate value. */
    private int playerY;

    /**Store player character symbol on the grid plane. */
    private final String playerChar;
    
    

    /**Constructor to create a player object on the grid plane with its coordinate values randomly chosen by the computer. */ 
    public Player1() {
        
        /**an integer between 0 and 24 is randomly chosen by the computer for player's x coordinate value. */
        playerX = rand.nextInt(25);
        
        /**an integer between 0 and 49 is randomly chosen by the computer for player's y coordinate value. */
        playerY= rand.nextInt(50);
        
        /**character P represents player symbol on the grid plane. */
        playerChar="P";
        
    }
    
    /**method decrease player's column number by 1 if the player's initial column value is greater than 1. */
    public int left() {
        if (playerY>0)
               playerY --; 
        
        return playerY;
    }

    /**method increase player's column by 1 if the player's column number is less than 25. */
    public int right() {
        if(playerY<49)
              playerY ++ ; 
        
        return playerY;
    }

    /**method decrease player's row(x) number by 1 if the player's initial row value is greater than 1. */
    public int up() {
        if(playerX>0)
              playerX --;
        
        return playerX; 
    }

    /**method increase player's row(x) number by 1 if the player's initial row value is less than 25. */
    public int down() {
        if(playerX<24)
               playerX ++ ; 
        
        return playerX;
    }

    
    /**method to generate an integer between 0 and 24 is randomly chosen by the computer for player's row value. */
    public int resetPlayerX() {
        /**an integer between 0 and 24 is randomly chosen by the computer for player's x coordinate value. */
        playerX = rand.nextInt(25);
        
        return playerX;
    }

    /**method to generate an integer between 0 and 24 randomly chosen by the computer for player's column coordinate value. */
    public int resetPlayerY() {
        /**an integer between 0 and 49 is randomly chosen by the computer for player's y coordinate value. */
        playerY= rand.nextInt(50);
        
        return playerY;
    }

    /**method to retrieve retrieve player's x-coordinate value.
     @return player's x-coordinate.*/
    public int getPlayerX() {
        return playerX;
    }

    /**method to @return player's y-coordinate value.
     * @return  */
    public int getPlayerY() {
        return playerY;
    }
    
    /**method to retrieve player characteristic. */
    public String getPlayerChar()
    {
        return playerChar; 
    }
    
    
    
}
