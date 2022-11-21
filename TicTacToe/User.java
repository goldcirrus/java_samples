/*
 * Users who play Tic Tac Toe
 * Author: Liang Zhong (Kevin)   TRU ID: T00224182
 * Date: November 29, 2018
 */
package ttt;
import java.util.Scanner;


public class User {
    
    private String name;
    private int countStep;                             //every individual player has this counter to count how many steps have gone
    private static int countPlayer=0;                 //it's a static variable to trace how many User objects(players) have been created. 
                                           //********************************************************
    private static Grid table = new Grid();         //***declare a Grid object is the table where to play TTT. if without (=new Grid())initialization,then it is null.
          //an empty table is created               //**table is a static variable, so every User Class object can change its valut(set 'X'and'@'as Grid object's new element value)
                                                    //* User Class has a Grid object(table) as its own/local attribute, so the main class(TTT) can use a User object to modify its-(User Class attribute/variable)-the Grid object's internal variable(its own element's) value
    
    Scanner scan = new Scanner(System.in);
    
    
    //constructor to create User Class objects
    public User()
    {
          countPlayer++;
          System.out.println("What is the player "+ countPlayer + "'s name?");
          String inputName = scan.nextLine();
          name = inputName;
          countStep=0;
    }
    
    public void printTable()           //initial table's value is defined in Grid Class constructor
    {
          System.out.print(table);       //print out the empty ttt table with labels
          
    }
    
     public void chessTable(int row,int column, char playerChar)       //any User object can modify their static variable-table(a Grid type object) via a Grid Class method(markP1)
    {
        table.mark(row, column, playerChar);             //table's [row][column]-value set to player1's chosen character(x)
        
    }
    
     public char setChar()                      //ask user to choose the character on board as chess
    {     
          String temp="";
          char charTemp;
          System.out.println(this.name+ ", please choose the character you like to use:");
          temp=scan.next();
          charTemp=temp.charAt(0);
        
          System.out.println(this + " choose the character " +charTemp);
          return charTemp;
    }
     
     
     
     public boolean gameOver(char playerChar)    //parameter char type can import main class player's Character into User class method
     {     
           boolean win=false;
            
           if ( table.getValue(1,1).equalsIgnoreCase(" "+playerChar+" |") && table.getValue(1,2).equalsIgnoreCase(" "+playerChar+" |") && table.getValue(1,3).equalsIgnoreCase(" "+playerChar+" |"))
              win= true;
           else if(table.getValue(2,1).equals(" "+playerChar+" |") && table.getValue(2,2).equals(" "+playerChar+" |")&& table.getValue(2,3).equals(" "+playerChar+" |"))
               win= true;
           else if(table.getValue(3,1).equals(" "+playerChar+" |")&& table.getValue(3,2).equals(" "+playerChar+" |") && table.getValue(3,3).equals(" "+playerChar+" |"))
               win= true;
           else if(table.getValue(1,1).equals(" "+playerChar+" |") && table.getValue(2,1).equals(" "+playerChar+" |") && table.getValue(3,1).equals(" "+playerChar+" |"))
               win= true;
           else if(table.getValue(1,2).equals(" "+playerChar+" |") && table.getValue(2,2).equals(" "+playerChar+" |") && table.getValue(3,2).equals(" "+playerChar+" |"))
               win= true;
           else if(table.getValue(1,3).equals(" "+playerChar+" |") && table.getValue(2,3).equals(" "+playerChar+" |") && table.getValue(3,3).equals(" "+playerChar+" |"))
               win= true;
           else if(table.getValue(3,1).equals(" "+playerChar+" |") && table.getValue(2,2).equals(" "+playerChar+" |") && table.getValue(1,3).equals(" "+playerChar+" |"))
               win= true;
           else if(table.getValue(1,1).equals(" "+playerChar+" |") && table.getValue(2,2).equals(" "+playerChar+" |") && table.getValue(3,3).equals(" "+playerChar+" |"))
               win= true;
           
          return win;
       
           
     }
     
     
     
     public int getSteps()
     {
         return this.countStep;
     }
     
    
    
    
    public Grid resetTable()             //reset table to initialization status= empty table
    {
          Grid temp = new Grid();       // create a new empty table named temp, then assign temp to table(variable)
          table =temp;
          
          return table;
    }
    
    public int resetStep()                     //reset step for each player before start a new game
    {
         this.countStep=0;
         return countStep;
    }
    
    
    public String go()           //user use this method to modify the User Class static variable-table, to set 'X' and '@' as its new value to replace " |" in the table grid
    {     
          this.countStep++;    //count how many steps the player goes
          int row=1;                //if an out of range input is entered for location, the row is 1
          int column=1;               ////if an out of range input is entered for location, the column is 1
                          //above are the default value for row,column, in case if the user enter an out of range location combination 
          
          System.out.println("Where doess "+ this.name +" go:");   //ask user to input grid location
          String input = scan.next();                  //read input as a string
          input = input.toLowerCase();  
          
         
          /* ********************* Input Range Validity Check, too much options so I don't use the range check codes   ***********************8
          while(!input.equals("1a") || !input.equals("2a")|| !input.equals("3a")
              ||!input.equals("a1")|| !input.equals("a2")|| !input.equals("a3")
              || !input.equals("2a")|| !input.equals("2a")|| !input.equals("2a")
              || !input.equals("2a")|| !input.equals("2a")|| !input.equals("2a"))
              ||........
          
          {
               System.out.println("The location is not valid, please type again.");
               input = scan.next();
          }
          */
               
                                      // look at first char of input string to decide row number
          switch(input.charAt(0))     //set row number: (1-2) from input(1-2), if 'a,b,c' is the first letter of input
          {
              case '1': row=1; 
                        break;
              case '2': row=2; 
                        break;
              case '3': row=3; 
                        break;
              
          }
                                     //look at second char of input string to decide column number
          switch(input.charAt(1))     //set row number, if '1,2,3' is the second letter of input
          {
              case'1': row=1; 
                       break;
              case'2': row=2; 
                       break;
              case'3': row=3;
                       break;
             
          }
          
          switch(input.charAt(0))     //set column number, no matter where is 'A,B,C' in input.
          {
              case'a': column=1; 
                       break;
              case'b': column=2; 
                       break;
              case'c': column=3; 
                       break;
              
          }
          
          switch(input.charAt(1))
          {
              case'a': column=1; 
                       break;
              case'b': column=2; 
                       break;
              case'c': column=3; 
                       break;
              
          }
                 //swith can only take 1,2,3,a,b,c. if user enter an string location other than them, the swith will ignore the input, so the default value row==1, and column==1 will be used
          
          String temp = Integer.toString(row)+Integer.toString(column);   //return entered label combination as grid location as String such as 11,21, 33, etc
          //System.out.println(this.name + " goes to " + temp);
          return temp;        //return location combination as a string
    }
    
    public int ConvertToRow(String x)            //take output from method go==(11,12,13,..,33)String, convert the 1st string to integer as row number
    {
          int row = Integer.parseInt(x.substring(0, 1));
          return row;
    }
    
    public int ConvertToColumn(String x)            //take output from method go==(11,12,13,..,33)String, convert the 2nd string to integer as column number
    {
          int column = Integer.parseInt(x.substring(1, 2));
          return column;
    }
    
    
    public String getTableValue(int row, int column)
    {
        String temp = table.getValue(row,column);
        return temp;
    }
    
    
   
    @Override
    public String toString()
    {
         String temp="";
         temp=this.name;
         return temp;
    }
    
}
