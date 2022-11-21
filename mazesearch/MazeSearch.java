
package mazesearch;


public class MazeSearch {

    
    public static void main(String[] args) {
        
        Maze labyrinth = new Maze();       //there is no written constructor in Maze Class, so default construct is called here
        System.out.println(labyrinth);     //print original maze array list as a string, so labyrinth.toString is called automatically here
        
        labyrinth.traverse(0, 0);       //Start from grid[0][0]
       
        System.out.println(labyrinth);      //print solved maze array list as a string
        
    }
    
}
