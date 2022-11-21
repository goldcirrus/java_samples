
package fliprace;
import countflips.Coin;


public class FlipRace {


    public static void main(String[] args) {
        //flip two coins until one of them have heads three times in a roll.
       final int GOAL = 3;
       int count1 =0, count2 = 0;
       Coin coin1 = new Coin();
       Coin coin2 = new Coin();
       
       while (count1<GOAL && count2<GOAL)
       {
           coin1.flip();
           coin2.flip();
           System.out.println("count1 is "+coin1 + "\tcount2 is "+coin2);  //if there is no toString() method, the coin1 object's reference address will be printed out. 
           //coin1 has a face value from its constructor, automatically call toString() method to represent the face value as a string. object.toString() = coin1.toString() = coin1 when use print, or concatenate with another string.
           
           //increment count1 and count2
           count1 = (coin1.isHead()) ? count1+1 :0;
           count2 = (coin2.isHead()) ? count2+1 :0;
        }
       
       if (count1>count2)
       {
           System.out.println("coin1 wins.");
       }
       else {
           if (count1 == count2)
               System.out.println("it is a tie");
           else 
               System.out.println("coin2 wins.");
       }   
       
       
        
    }
    
}
