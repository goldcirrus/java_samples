/**
 * 
 * 
 * @author Kevin
 *
 **/

/**create a 10x10 grid contains 8 types of chocolates. */
public class BoxOfChocolatesDriver {

    public static void main(String[] args) {
        
        /**create a box contains 8 different chocolates objects, they are all declared as OurTreats Type. */
        BoxOfChocolatesSimulation box = new BoxOfChocolatesSimulation();
        box.start();
        
        /**demonstrate they can be examined by "instance-of" command. */
        System.out.println("\nDemonstrate the contents can be examed by the instanceof command.");
        boolean result= box.getChocoBox(0, 0) instanceof PlainCandyApple;
        System.out.println("position(A,A) is a instance of PlainCandyApple: "+ result);
        
        
        
        
        
    }
}
