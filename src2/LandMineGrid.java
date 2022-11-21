import java.util.*;

 /**Class contains a grid plane where plays the game.   */
public class LandMineGrid {

    /**the two dimensional char type array represents a grid plane to place the flag,player and mines.   */
    private String[][] grid;
    /**stores the character of the normal path symbol. */
    private String pathChar=".";
    
    private Flag flagA = new Flag();
    
    private Player1 playerA = new Player1();
    
    /**create a LandMine object with random x-coordinate(1-25) and y-coordinate(1-50), and a mine char symbol. */
    private LandMine mine= new LandMine();

    /**Store the coordinate of grid's row number. */
    private int row;
    /**Store the coordinate of grid's column number. */
    private int col;
    
    
    
    /**Random number generator to create location coordinates. */
    private Random rand= new Random();
    
    /**Scanner object to take input from the user's key in on the keyboard. */
    private Scanner scan= new Scanner(System.in);
    
    
    
/**Constructor to create a LandMineGrid object which initializes a two dimensional char type grid to represent a grid plane to add the path,player and mines symbol.  */
    public LandMineGrid() {
        /**Create a LandMineGrid object with a two dimension char type grid. The grid size is 20x50. */
        grid= new String[25][50];
        
        /**add normal dot(.) on all grid plane locations. */
        addPath();
        
        /**add some (75) mines on the grid. */
        addMine();
        
        addFlag();
        
        /**add one Player1 object on the grid. Pass in flag x,y coordinates to check whether to add the player on top of a flag. */
        addPlayer();
        
        /**print out the grid plane. */
        displayGrid();
        
    }

    
    /**method to create one player object and put it on the grid plane. */
    private void addPlayer() {
        int fX= flagA.getFlagX();
        int fY= flagA.getFlagY();
        
        int pX= playerA.getPlayerX();
        int pY= playerA.getPlayerY();
        
        /** check whether on this player x,y location, there is a flag, if there is a flag here, we reset player new x,y coordinate values.  */
        while( pX==fX  && pY==fY )
        {
            pX= playerA.resetPlayerX();   //player object generate another x-value, assign to pX and check again
            pY= playerA.resetPlayerY();   //player object generate another y-value, assign to pY and check again
        }
        
        /** pass the checking, then these are the final player x,y coordinates value can be used. */
        pX =  playerA.getPlayerX();
        pY= playerA.getPlayerY();
        
        /** on this location to add player symbol on the grid. */
        grid[pX][pY] = playerA.getPlayerChar();
    }
    
    /*After move the player, check whether it meet the flag or killed by a mine. 
      if the player(new x,y coordinates) meet a flag or mine then return flase, else then add player symbol on its new position and return true.  */
    public boolean renewPlayer()
    {   
        /**Store player new row and column number. */
        int px=playerA.getPlayerX();
        int py=playerA.getPlayerY();
        
        int fx=flagA.getFlagX();
        int fy=flagA.getFlagY();
        
        String mChar = mine.getMineChar();
        
        if(checkFlag())                           //checkFlag():if player new positon == flag position, retrun true, if not, false
        {     System.out.println("You Win.");
              return false;
        }
        if(grid[px][py].equals(mine.getMineChar()))   //if player new position has a mine symbol, then You are killed, and return false for the method.
        {     System.out.println("You are killed.");
              return false;
        }
        else                                            //else: add player symbol on its new position (renew player position)
        {                                               
              grid[px][py] = playerA.getPlayerChar();
        }
                          // return true for this method when player new position has no flag or mine, renew player position and return true for this method. 
        return true;
    }
    
    /** method to retrieve flag object's x,y value and locate them on the grid with a normal path symbol dot. */
    private void addFlag ()
    {
        int flatX = flagA.getFlagX();
        int flatY = flagA.getFlagY();
        grid[flatX][flatY] = pathChar;   //flag is invisible, so on its position, there is a normal path character
    }

    /**method to initiate the grid plane with normal path dots all over. */
    private void addPath() {
        /** fill path symbol '.' on the gird all over. */
        for(int row=0; row<grid.length; row++) 
        {
              for(int col=0; col<grid[row].length; col++)
                  grid[row][col]=pathChar;
        }
    }

   

    /**method to create LandMine object 75 times and assign them as grid elements in random locations in the grid array. */
    private void addMine() {
        for(int i=1; i<80; i++)
        {    
             /**grid row index =mine object x-coordinate, grid column index = mine object y-coordinate, assign mine character symbol as the grid elements. */
             int rowNum=mine.setMineX();    //getMineX is 0-24
             int colNum=mine.setMineY();   //getMineY is 0-49
             
             grid[rowNum][colNum]= mine.getMineChar();
        }
    }

    
    /**method to ask enter the move instruction from keyboard, and display the renewed grid plane after the player moves.  */
    public void go()
    {     /** store old player position before move it. */
          int pXold = playerA.getPlayerX();
          int pYold = playerA.getPlayerY();
        
          System.out.println("Please move your player: 8(up), 2(down), 4(left), 6(right): ");
          int input = scan.nextInt();
          
          switch (input)
          {
              case 8:
                  playerA.up();   //playerA row number(x) minus 1
                  break;
              case 2:
                  playerA.down();   //playerA row number(y) plus 1
                  break;
              case 4:
                  playerA.left();   //playerA x-coordinate minus 1
                  break;
              case 6: 
                  playerA.right();   //playerA x-coordinate plus 1
                  break;
              default:
                  System.out.println("Wrong input. Please enter: 8(up), 2(down), 4(left), 6(right): " );
                 
          }
          
          //refill old player location with normal path symbol
         removePlayer(pXold, pYold);
         
          //add player to the grid plane with its new location
         renewPlayer();
         
         displayGrid();
         //cheating
         //System.out.println("This is cheating for testing: flag positon is row "+flagA.getFlagX()+" column  "+flagA.getFlagY());
         //System.out.println("This is cheating for testing: player positon is row "+playerA.getPlayerX()+" column  "+playerA.getPlayerY());
    }
    
    
    /**method pass in player old position to place a normal path dot in this old player location after it is moved. */
    private void removePlayer(int coorX, int coorY) {
        grid[coorX][coorY] = pathChar;
        
    }

    /**method to calculate the distance between the flag and the player. 
     * 
     * @param flagX is flag x-coordinate. 
     * @param flagY
     * @param pX
     * @param pY
     * @return 
     */
    public double Distance() {
        int fx = flagA.getFlagX();
        int fy = flagA.getFlagY();
        
        int px = playerA.getPlayerX();
        int py = playerA.getPlayerY();
        
        /**local variable to store the 2 to the power of distance. */
        double interDis= (double)(fx-px)*(fx-px)+Math.pow((double)(fy-py), 2);
        
        /**local variable to store the distance between the flag and the player. */
        double distance = Math.sqrt(interDis);
        
        return distance;
    }


    
    /**method return true if the player reaches flag position,or return false when not meet. */
    private boolean checkFlag() {
        
        int fx = flagA.getFlagX();
        int fy = flagA.getFlagY();
        
        int px = playerA.getPlayerX();
        int py = playerA.getPlayerY();
        
        return px==fx && py==fy;
    }
    
    
    /**method to display the grid plane.   */
   private void displayGrid() {
       
       for(row=0; row<grid.length; row++)
       {  
            for(col=0; col<grid[row].length; col++)
            {
                 System.out.print(grid[row][col]);
            }
            System.out.println();
       }
        
    }
    
    
    
}


