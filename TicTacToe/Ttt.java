/*
 * To play Tic Tac Toe games between tow players
 * Author: Liang Zhong (Kevin)      TRU ID: T00224182
 * Date: November 29, 2018
 */
package ttt;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Ttt {
        
 
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        
        System.out.println("Welcome to the Tic Tac Toe Game!");
        
        User player1 = new User();                      //to create two User objects to play the game
        User player2 = new User();                      //as long as the user objects is created, the table is created as well
        
        System.out.println();
        char player1Char = player1.setChar();           //ask user to pick up the character they like to play on the table
        char player2Char = player2.setChar();           //User Class method: setChar() to let players input char on chess board
       
        while ( player1Char == player2Char)            //check that the two users don't use the same character to play
       {    
            System.out.println(player2 + " can't choose the same character as what "+player1+" choose");
            player2Char = player2.setChar();
       }
       
        
        
       
        char keep = 'y';               //the key word-'y'controls to keep playing the game, only continue the game if enter 'y'
        while(keep == 'y')
       {     
             player1.resetTable();          //reset table to empty table
             player1.resetStep();           //reset palyer1's step counter to 0
             player2.resetStep();           //reset player2's step counter to 0
             
             
             System.out.println("=============================");
             System.out.println(" Let's start the game now.");
             player1.printTable();     //print User Class static variable -the grid table                  //only User Class object can modify User Class static variable-the table(every user can modify table)
                                                            
                                        //decide who play the game first.
             System.out.println("Who play first? If "+player1+" play first, Enter 1. If not, enter any other key.");
             String firstGo = scan.next();
             char first = firstGo.charAt(0);
             
                       
             if(first=='1')      //if player1 first play.
             {      
                                  //keep playing, until total step is 9 or someone win(gameover method is true)
                 while ((player1.getSteps()+player2.getSteps())<=8 && (!player1.gameOver(player1Char)) && (!player2.gameOver(player2Char)))
                   {
                         playerMove(player1,player1Char);
                                                    //if  nobody win(gameover method is false) and total steps is less than 9, then the next player can still play
                         if(!player1.gameOver(player1Char) && (player1.getSteps()+player2.getSteps())<9)
                            playerMove(player2,player2Char);
                   }
                 
                  //decide who wins
                if(player1.getSteps()==5 && player2.getSteps()==4 && !(player1.gameOver(player1Char)))
                    System.out.println("It is a tie");
                else if(player1.getSteps()==player2.getSteps())
                    System.out.println(player2+ " wins.");
                else if(player1.getSteps()>player2.getSteps())
                    System.out.println(player1+ " wins.");
                 
             }
                
             else      //if player2 first play
             {          //keep playing, until total step is 9 or someone win(gameover method is true)
                 while ((player1.getSteps()+player2.getSteps())<=8 && (!player2.gameOver(player2Char)) && (!player1.gameOver(player1Char)))
                {
                         playerMove(player2,player2Char);
                                                               //if  nobody win(gameover method is false) and total steps is less than 9, then the next player can still play
                         if(!player2.gameOver(player2Char)&&(player1.getSteps()+player2.getSteps())<9)
                         playerMove(player1,player1Char);
                 }
                                 
                  //decide who wins
                if(player2.getSteps()==5 && player1.getSteps()==4 && !(player2.gameOver(player2Char)))
                    System.out.println("It is a tie");
                else if(player2.getSteps()==player1.getSteps())
                    System.out.println(player1+ " wins.");
                else if(player2.getSteps()>player1.getSteps())
                    System.out.println(player2+ " wins.");
                
             }
             
                                    //whethr want to play again?
             System.out.println("If you like to play again, please enter \"\'y\'es\", or any other key to quit.");
             String tempDo = scan.next();
             tempDo = tempDo.toLowerCase();
             keep = tempDo.charAt(0);
            
       }
        
    }
    
    
    
    public static void playerMove(User playerX, char playerChar)          //use parameter User class object to pass in players in main method when invoked in main methodx
    {                                                                   //must be static method, so it can be invoked in main method without a object
                  String step = playerX.go();                         //user method(go) to ask input location, and return grid index string(11-33)
                  int rowX = playerX.ConvertToRow(step);                 //convert string (11-33) to integer for row number
                  int columnY = playerX.ConvertToColumn(step);             //convert string (11-33) to integer for column number
                  
                  playerX.chessTable(rowX, columnY, playerChar);           //put chess char on the above input location on grid table
                 
                  playerX.printTable();
                  
    }
    
    
    
}
