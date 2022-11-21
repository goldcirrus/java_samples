
package sneakeyes;


public class SneakEyes {

  
    public static void main(String[] args) {
       final int ROLL = 500;
       int num1, num2, count=0;
       
       Die die1 = new Die();    //to create a die1 object with its faceValue==1
       Die die2 = new Die();    
       
       for (int roll=1; roll<=ROLL; roll++)
       {   
            num1 = die1.roll();     //set a random integer between 1-6 for die1's faceValue
            num2 = die2.roll();     //roll() has return int value
            
            if (num1==1 && num2==1)
            {  
                count ++;
            }
       }
       
       System.out.println("the number of rolls are "+ROLL);
       System.out.println("the number of sneakeyes are "+count);
       
       
    }
    
}
