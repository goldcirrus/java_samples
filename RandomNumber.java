package randomnumber;
import java.util.Random;
/**
 *
 * @author Kevin
 */
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
    Random genum = new Random();// create a new randow object named as genum
    int num1;
    float num2;
    
    num1 = genum.nextInt();
    System.out.println("a random full range integer number is created as: "+num1);
    
    num1 = genum.nextInt(10);
    System.out.println("a random integer number between 0 to 9 is created: "+num1);
    
    num2 = genum.nextFloat();
    System.out.println("a random float 0-1: " + num2);
    
    num2 = genum.nextFloat()*10;
    System.out.println("Scaled random float number between 0.0 to 9.9999: "+num2);
    num1 = (int)num2+1; //casting num2 from float to int, increment 1
    System.out.println("new value for num1 converted from num2 range from 1-10: " + num1);
        
    }
    
}
