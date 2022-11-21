import java.util.*;

public class LandMineDriver {

    

    public static void main(String[] args) {
        
        LandMineGrid grid = new LandMineGrid();
        
        /**while player has not meet a flag or mine, the renewPlayer() is ture, then keep doing moving. */
        while(grid.renewPlayer())
        {
               grid.go(); 
               System.out.println(grid.Distance());
        }
        
             
        
       
        
        
        
        
    }
    
    
    
    
}
