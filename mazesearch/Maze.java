/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazesearch;


public class Maze {
    
    private final int TRIED=3;
    private final int PASS=8;
    
    private int[][] grid =              {  
        {1,1,1,0,1,1,0,0,0,1,1,1,1},        //each 2nd dimension array is seperated by ,
        {1,0,1,1,1,0,1,1,1,1,0,0,1},        //each 2nd dimension array is encluded by { }
        {0,0,0,0,1,0,1,0,1,0,1,0,0},
        {1,1,1,0,1,1,1,0,1,0,1,1,1},
        {1,0,1,0,0,0,0,1,1,1,0,0,1},
        {1,0,1,1,1,1,1,1,0,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0},
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
                                        };  //1st dimension array is finished by { };
    
    
    @Override
    public String toString()               //when a Maze object is print out as a String, the grid two dimension array is printed out
    {    
        String result="";                //make String result == grid's contents
        
        for (int i=0; i<grid.length; i++)
        { for (int j=0; j<grid[i].length; j++)
            result +=Integer.toString(grid[i][j])+"  ";
            result +="\n";
        }
        return result;
    }
    
                                       //determine whether a move is a valid pass(the array [rowX][ColY]== 1)
    private boolean valid(int rowX, int colY)       //it is a private local methed which is invocated by the same Class method traverse()
    {
           boolean result=false;         //initialization value of returned boolean vairable is set to false.
                                        //first check whether passed-in parameter is in array(grid)'s boundary check
           if (rowX<grid.length && rowX>=0 && colY<grid[1].length && colY>=0)
                 if (grid[rowX][colY]==1)                    //if the location of array(grid) == 1, then it is a valid pass.
                      result=true;
           
           return result;
    }
    
    
                                    //1 is pass, 0 is block, if tried 1,but fail to lead to a final solution,then mark that 1 as 3, if 1 leads to a final solution pass, then mark this 1 as 8
    public boolean traverse(int rowX, int colY)
    {
        boolean done=false;                 //if local variable done==true, final solution pass reached, if done==false, no final solution pass found
                                           
        if (valid(rowX,colY))               //if the value in location of grid[rowX][colY] equals to 1, condition valid() returns true
        {                                   
              grid[rowX][colY]=TRIED;           //then mark this location as TRIED(3) and try the next location
              
                                //(if part)== base case to stop the recurse, to tell when the final solution is reached
              if (rowX==grid.length-1 && colY==grid[1].length-1)     //if(parameter rowX,colY reach EXIT position), then base case is true, and stop the recursion, return the local variable done==true
                  done = true;                                     //local vairalb is given the returned value
              
              else              //recursion part: to try next step: down or 
              {                  
                  done = traverse(rowX+1, colY);        // local variable(done) assigned = returned value from traversemethod (with increment parameter)
                                 //down 1 step          //recursion is the parameter rowX increment1
                                 //如果 traverse(rowX+1,colY) is not a valid move，则什么都不做，直接return false 赋值给done
                                 //done is flase, 则执行下面的指令
                  if(!done)                         //if done is false,(!false) is a (true condition) to execute this if command,and do the following code 
                      done = traverse(rowX,colY+1);         //done is false means not reaching the final solution, keep trying right 1 step
                                      //right 1 step
                  if(!done)
                      done = traverse(rowX-1,colY);      //if done is false(not get a final solution, then try going down 1 step
                                      //down 1 step
                  if(!done)
                      done = traverse(rowX,colY-1);
               }                      //left 1 step
              
              if(done)
                  grid[rowX][colY]=PASS;
              
        }      //first traverse (x,y) if done is false, try (x +-1, y+-1) --->  until done is true
        
        return done;
        
    }
    
    
}
