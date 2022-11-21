/**The game randomly picks a letter from A to Z. Then asks you to select a column (0-4).
The game "drops" the randomly chosen "letter blocks" into that column. Letters that are already in that column are "stacked" on top of each other. (try game demo).
The game continues with selecting a random letter and asking you which column to drop the letter in and stacking these letters on top of each other.   */

/**main class to start the game with creating a Grid object.*/
public class GameDriver {

    public static void main(String[] args) {
        /**create a Grid object.*/
        Grid plane = new Grid();
        
        /**control the loop to keep the game going. make its initial ture to start the loop. Each game run will reset its boolean value. */
        boolean goControl=true;
        
        /**It is also the main game body. */
        while(goControl)
        {
            goControl = plane.goPlay();
        }
        
        
    }
}
