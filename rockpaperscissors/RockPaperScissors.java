/*
 * Author: Liang Zhong  T00224182
 * Date: October 23, 2018
 */
package rockpaperscissors;
import java.util.Scanner;


public class RockPaperScissors {

    
    public static void main(String[] args) {
        
        String yourBit, yourName, comBit;
        Scanner scan = new Scanner(System.in);
        
        Computer robot = new Computer();       //create a Computer Class object
        
        //ask user name input and import it into user constructor
        System.out.println("Welcome to Game World! What is your name?");
        yourName = scan.next();     
        User human = new User(yourName);                   //to create a User Class object with input as its name
        //create an User Class object which take a actual parameter(yourName) refering to the user's name. ..yourName passed into new User Class object constructor as an actual parameter,  and assign its contained value to this object's variable "name" 
             
                         
                 //start the game
        System.out.println("Let's play Rock, Paper, Scissors!");
          
        yourBit = human.play();                                //user enter his play choice, and assign it to variable yourBit, if input R,S,P, then print out it. if 0, no action =  end of game
       
        while (!yourBit.equalsIgnoreCase("0"))                 // if user entered 0, then NO action for while loop. if user entered R,S,P, then Computer will play.
        {                                              //yourBit contains a returned String from human.play(), it can only be R,S,P or 0 which is guaranteed by play() method
           comBit = robot.play();                   //computer play its pick, and assign it to variable comBit
           
           if (yourBit.equalsIgnoreCase("R") && comBit.equalsIgnoreCase("S"))             //compare human's choice which is contained by string variable yourBit to computer's pick which is contained by String variable comBit
           {     human.humWin();                                                       //human win, so increment human win counter
                 robot.comLoss();                                                      //robot lose, so increment robot lose counter
                 System.out.println(human.getUserName()+" wins.");
           }
           else if (yourBit.equalsIgnoreCase("R") && comBit.equalsIgnoreCase("P"))
           {     human.humLose();
                 robot.comWin();
                 System.out.println(robot.getComName()+" wins.");
           }
           
           else if (yourBit.equalsIgnoreCase("R")&&comBit.equalsIgnoreCase("R"))
           {     human.humTie();
                 robot.comTie();
                 System.out.println("This is a tie.");
           }
           
           else if (yourBit.equalsIgnoreCase("S")&&comBit.equalsIgnoreCase("S"))
           {     human.humTie();
                 robot.comTie();
                 System.out.println("This is a tie");
           }
           
           else if (yourBit.equalsIgnoreCase("S") && comBit.equalsIgnoreCase("P"))
           {     human.humWin();
                 robot.comLoss();
                 System.out.println(human.getUserName()+" wins.");
           }
           
           else if(yourBit.equalsIgnoreCase("S") && comBit.equalsIgnoreCase("R"))
           {     human.humLose();
                 robot.comWin();
                 System.out.println(robot.getComName()+" wins.");
           }
           
           else if(yourBit.equalsIgnoreCase("P") && comBit.equalsIgnoreCase("S"))
           {     human.humLose();
                 robot.comWin();
                 System.out.println(robot.getComName()+" wins.");
           }
           
           else if(yourBit.equalsIgnoreCase("P") && comBit.equalsIgnoreCase("P"))
           {     human.humTie();
                 robot.comTie();
                 System.out.println("This is a tie.");
           }
           
           else if(yourBit.equalsIgnoreCase("P") && comBit.equalsIgnoreCase("R"))
           {     human.humWin();
                 robot.comLoss();
                 System.out.println(human.getUserName()+" wins.");
           }                                                 //end of first round of compare
                 
           System.out.println(" ");
           yourBit = human.play();                 //ask another round of play? reset yourBit=human.plan() new entered value:R,P,S, by human enter new bit R,P,S,to do another round and make while loop condition to be true to play again. if user enter 0(yourBit== "0"), quit. 
       }                                           //yourBit take returned human.play() value and back to while loop condition check.
       
       System.out.println("\n======================");
       
       System.out.println(human.getUserName()+" wins "+ human.getHumWin()+" times.");       //both human.getUserName() and variable yourName contains user's name. first yourName get input from keyboard by scanner object(scan), then assign it to Name in human constructor. 
       System.out.println(yourName + "'s percent of winning is "+ human.humPercentWin());
       System.out.println(robot.getComName()+" wins "+ robot.getComWin() + " times." );
       System.out.println(robot.getComName()+ "'s percent of winning is "+robot.comPercentWin());
       System.out.println("The number of ties are "+human.getHumTie()+"\n");
       
     whoWins(human,robot);          //this method is static method, so no need to be object.whoWins(human,robot)
                                    // use two parameters to pass User Class object human and Computer Class object robot into it
      
    }
    
    public static void whoWins(User humObj, Computer comObj)        //static method, the main program can use it without use a main program class object to invocate it
    {                                                            //use parameters to pass in User Class object and Compter Class object
            if (humObj.getHumWin() > comObj.getComWin())
                  System.out.println(humObj.getUserName()+ " wins the Game!");
            
            else if (humObj.getHumWin() < comObj.getComWin())
                  System.out.println(comObj.getComName()+ " wins the Game!");
            
            else 
                  System.out.println("This game is a Tie!");
    
    }

    
}
