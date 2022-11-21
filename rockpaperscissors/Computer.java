/*
 * Author: Liang Zhong (Kevin)  T00224182
 * Date: October 23, 2018
 */
package rockpaperscissors;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 *
 * @author Kevin
 */
public class Computer {
    
    final private String COMNAME;
    private String comPick;
    private int countComWin=0, countComLose=0,countComTie=0;
    
    //constructor to create a Computer Class object, which can use its class methods, and print out the computer's name. 
    public Computer()
    { 
        this.COMNAME = "MamaMiYa";
          System.out.println("My name is "+ this.COMNAME + ", your computer opponent created for your game.");
    }
    
    public String getComName()
    {
        return COMNAME;
    }
    
    public String play()
    {     
         int randInt = (int) (Math.random()*3);                //generate random integer: 0,1,2
         
         switch (randInt)
         {
             case 0: comPick = "R";
                     System.out.println(this.COMNAME + " played Rock.");
                     break;
             case 1: comPick = "P";
                     System.out.println(this.COMNAME + " played Paper.");
                     break;
             case 2: comPick = "S";
                     System.out.println(this.COMNAME + " played Scissors.");
                     break;
         }
         
         return comPick;
    }
    
    public void comWin()
    {
          countComWin++;
    }
    
    public void comLoss()
    {
          countComLose++;
    }
    
    public void comTie()
    {
          countComTie++;
    }
    
    public int getComWin()
    { 
          return countComWin;
    }
    
    public int getComLose()
    {
          return countComLose;
    }
    
    public int getComTie()
    {
          return countComTie;
    }
    
    public String comPercentWin()
    {
          double percent = (double)countComWin/(countComWin+countComLose+countComTie);
          
          DecimalFormat fmt = new DecimalFormat("0.##%");        //convert percent from double to 0.##% format as a string.
          String percentStr = fmt.format(percent);
          
          return percentStr;
    }
    
}
