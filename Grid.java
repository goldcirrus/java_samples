import java.util.*;

public class Grid {

    private char[][] grid = new char[10][5];
    
    /**counter to track each column stack numbers. there are 5 counters which are elements in this counter array for 5 columns */
    private int[] counter = {0,0,0,0,0};
    
    LetterBlock charGen = new LetterBlock();
    
    Player player1 = new Player();
    
    /**store the column number which the user pick up. */
    private int colPick;

    private int countRow;

    private int row;

    private int col;

    private final char DOT='.';

    
    
    Scanner scan = new Scanner(System.in);

    /**constructor to initialize a 10x5 grid plane with '.' filled all over. */
    public Grid() {
        for(row=0; row<grid.length; row++)
        { 
            for(col=0; col<grid[row].length; col++) 
                grid[row][col]='.';
        }
        
        displayGrid();
    }
    
    public boolean goPlay()
    {
          LetterBlock letterCreator = new LetterBlock();
          char newLetter = letterCreator.getLetter();
          System.out.println(newLetter);    //generate random letter A-Z
          
          System.out.println("which column do you like to add this letter? Make a choice(0-4).");
          colPick = scan.nextInt();             //ask which column to add this letter
          
          addLetter(newLetter, colPick);
          
          displayGrid();
          
          return checkResult(newLetter, colPick);
    
    }
     
    /**method take parameter of the random letter and column number where it will be added to.
     * @param letterX is the random letter will be added on top of the column. 
     * @param colNum is the column number where the letter will be added on. */
    public void addLetter(char letterX, int colNum) {
        
        /**the row counter for this column controls which row where this letter will be added on.   */
        grid  [9-counter[colNum]]   [colNum] = letterX;
        
        /**increment the row counter by 1 for this column. so the next letter for this column will be added on this row above.   */
        counter[colNum] += 1;   
        
    }
    
    
    public boolean checkResult(char letterX, int colNum) {
        
        /**store the new letter row index. */
        int myRow = 10-counter[colNum];   
        
        /**store the new letter column index. */
        int myCol = colNum;
        
        /**if one column stack is full, game over. */
        if(counter[0]==10 || counter[1]==10 || counter[2]==10 || counter[3]==10 || counter[4]==10)
        {
             System.out.println("Game Over. One Column's stack is full.");
             return false;
        }
        
        
        /**if new letter is added on row 9 (counter==1), check left or right(same row 9) has the same letter, and upper left and upper right(row 8), but don't check one row below(there is no row 10 exception).*/
        else if( myRow == 9  && colNum>0 && colNum<4 )    //this column has counter==0 means no letter on row 9, when counter ==1, first letter is on row 9.
        {
            if(grid[9][colNum-1]==letterX || grid[9][colNum+1]==letterX|| grid[8][colNum-1]==letterX || grid[8][colNum+1]==letterX)
                 {      
                     System.out.println("Game Over.");
                     return false;
                 }
            else
                return true;
        }      
        
        /**if new letter is added between row 1 and row 8. Check the same row(left,right), one row up(left,right), one row down(left,below,right).   */
        else if(myRow>0 && myRow<9 && colNum>0 && colNum<4)
        {              //check one row down, column left,below, right equal letter
             if ( grid[myRow][colNum-1]==letterX || grid[myRow][colNum+1]== letterX 
               || grid[myRow+1][colNum-1]==letterX || grid[myRow+1][colNum]==letterX || grid[myRow+1][colNum+1]==letterX
               || grid[myRow-1][colNum-1]==letterX || grid[myRow-1][colNum+1]==letterX ) 
            {
                System.out.println("Game Over."+counter[colNum]);
                return false;
            }
            else
               return true;
        }
        
        else if(myRow==0 && colNum>0 && colNum<4)
        {           //**check one row down(left,below,right), same row (column left, right) equal letter  */
             if(grid[myRow][colNum-1]==letterX || grid[myRow][colNum+1]== letterX 
               || grid[myRow+1][colNum-1]==letterX || grid[myRow+1][colNum]==letterX || grid[myRow+1][colNum]==letterX) 
            {
                  System.out.println("Game Over.");
                  return false;
            }
             else
                 return true;
        }
        
        else
        return true;
    }

   
    public void displayGrid() {
        
        System.out.println("01234");
        
        for(row=0; row<grid.length; row++ )
        {
             for(col=0; col<grid[row].length; col++)
                 System.out.print(grid[row][col]);
             
             System.out.println();
        }
             
    }
}
