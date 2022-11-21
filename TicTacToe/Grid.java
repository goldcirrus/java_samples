/*
Tic Tac Toe Game
Author: Liang Zhong   T00224182
Date: November 29, 2018
 */
package ttt;


public class Grid {
    
                                //local variable declared for each object of Grid Class
    private String[][] grid;    //local Grid Class variable is a 2-dimension String array
    private int row;
    private int column;
    
    
    
                                //constructor to create an initial empty 3x3 grid table with row label:0,1,2 and column label:A,B,C
    public Grid()
    {
        this.grid = new String[4][4];                     //create an 2-dimension 4x4 String array, 
                                                          //then assign "  |" as the value of its each element.
        for(int row=0; row<this.grid.length; row++)
        {          
                for(int column=0; column<this.grid[row].length; column++)
                {
                      grid[row][column] = "   |";
                }
        }
                                       //assign row label:0,1,2 and column label:A,B,C
        grid[0][0]="  ";
        grid[0][1]="  A ";
        grid[0][2]="  B ";
        grid[0][3]="  C ";
        
        grid[1][0]="1 |";
        grid[2][0]="2 |";
        grid[3][0]="3 |";
    }
    
    public String getValue(int row, int column)
    {
          String temp = grid[row][column];
          return temp;
    }
    
    
    
    @Override
    public String toString()      //when an Grid Class object is print/called as a string output
    {
           String report="";            //report is the returned string with a shape of a 3x3 table of this grid's elements
           
           for(int row=0; row<this.grid.length;row++)
           {      
                  
                  for(int column=0; column<this.grid[row].length; column++)
                  {
                     
                      report += this.grid[row][column];
                  }
                  
                  report += "\n"+ "  -------------" + "\n";
           }
           
           return report;
    }
    
    
    
    public void mark(int row, int column, char playerChar)        //mark table elements with location[parameter row][parameter column] and value(parameter x)
    {
        this.grid[row][column]= " "+playerChar+" |";      
    }
    
    
    
}
