/*
 * Author: Liang Zhong (Kevin)  T00224182
 * Date: October 23, 2018
 */
package rockpaperscissors;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Kevin
 */
public class User {
    
    private String name,yourPlay;
    private int countHumWin,countHumLose,countHumTie;
    Scanner scan = new Scanner(System.in);
    
    //constructor to create an User Class object
    public User (String xName)                             //this constructor takes a actual parameter refering to this object's variable(name) containing user's name
    {
         this.name = xName;                                   
         System.out.println("Hi "+ name + ", it is very nice to meet you.");
         countHumWin = 0;
         countHumLose = 0;
         countHumTie = 0;
    }
    
    public String getUserName()
    {
         return name;                     // or return this.name   retrieve user's name.
    }
    
    // User method to input R,P,S or 0 
    public String play()
    {
        System.out.println("(R)ock, (P)aper, or (S)cissors? Enter 0 to end game:");  //ask to enter R,P,S or 0
        yourPlay = scan.next();                                 //take user's enter from keyboard, next token is assigned to yourPlay
        yourPlay = checkInput();                      //call in the same class checkInput() method to make sure: variable yourPlay contains a valid string which is: one of R,P,S or 0. If not, the checkInput() method will keep on asking user to enter a valid input, and assign the valid input to variabe yourPlay.
        yourPlay = yourPlay.toUpperCase();
                                                  //print out what the user just entered to play
        switch (yourPlay)                         //yourPlay is a string = one of R,P,S,0
        {  
            case "R": System.out.println(this.name + " played Rock.");
                      break;
            case "P": System.out.println(this.name + " Played Paper.");
                      break;
            case "S": System.out.println(this.name + " played Scissor.");
                      break;
                      
            case "0": break;
        }
        
        return yourPlay;
    }  
    //***************************** Input validity check
    // used by play() method to ensure input is valid one of P,S,R or 0
    public String checkInput()
        {                                                   //if yourPlay contains one of 0,R,S,P, then nothing happen(because while loop condition is false). If yourPlay doesn't mathch one of S,P,R,0, then this method will keep on asking user to enter a valid value for yourPlay variable,and assign the valid string from keyboard to yourPlay variable, then stop the while loop which keep on asking a valid input, then return this string.
            while ( ! (yourPlay.equals("0") || yourPlay.equalsIgnoreCase("R") || yourPlay.equalsIgnoreCase("P") || yourPlay.equalsIgnoreCase("S")) )
                {   System.out.println("You entered an invalid character. Please enter one of R,S,P to play, or enter 0 to quit.");
                   yourPlay = scan.next();
                 }
        
            return yourPlay;  
        }
    //************************************************************************
    
    public void humWin()
    {
           countHumWin++;
    }
    
    public void humLose()
    {
           countHumLose++;
    }
    
    public void humTie()
    {
           countHumTie++;
    }
    
    public int getHumWin()
    {
           return countHumWin;
    }
    
    public int getHumLose()
    {
           return countHumLose;
    }
    
    public int getHumTie()
    {
           return countHumTie;
    }
    
    public String humPercentWin()                  
    {
           double percent = (double)countHumWin/(countHumWin+countHumLose+countHumTie);      //must (cast) to (double), or it won't work. Because all counts are interger type!  all number <1, will show as 0.0 for int type. 1/3 === 0.0
           String percentStr = NumberFormat.getPercentInstance(Locale.CANADA).format(percent);      //convert double data type of percent to string % format and assign this string to percentStr string variable
           return percentStr;
    }
    
    
  }
    
    
    
    

