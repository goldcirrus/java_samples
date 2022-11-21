/*
 *program that reads a series of 10 double values from the user and prints out their average.
* If the input of any of the values throws an exception (i.e try entering letters instead of a number when prompted) 
* then catch the exception and inform the user of the mistake. Have the user re-enter the number. 
* After 10 valid double values are received, print out the average.
 */

package inputexceptionwork;

/**
 *
 * @author Kevin Zhong
 */

/**main driver method to start the program. */
public class InputExceptionWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        NumberAverageCal n1 = new NumberAverageCal();
        
        n1.average();
        
        
        
        
    }
    
}
