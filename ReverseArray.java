
package reversearray;
import java.util.Scanner;


public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        //left side: declare an array contains double type of elements, array's name is numbers  // right side: instantiate array object(numbers) with size = 10 elements
        double[] numbers = new double[5];
        
        System.out.println("This array size is "+ numbers.length);
                                                              //use arrayname.length to retrieve the size of array is the best way to avoid arrayindexoutofboundexception
        for(int index=0; index<numbers.length; index++)       //use for loop (0-arrayname.length) 为array elements 赋值, < not =, so loop is from 0 to array.length-1
        {
               System.out.println("Enter number "+ (index+1) +" from the keyboard:");    //提示输入
               numbers[index] = scan.nextDouble();               //将键盘输入的double type data 赋值给 array element
        }
        
        System.out.println("The array elements in reversed order are");
        
                //maximum index of array is (numbers.length-1) -- down to 0, index start from 9 goes down to 0, so index>=0 as loop condition
        for(int index=numbers.length-1; index>=0;index--)
        {
                System.out.print(numbers[index]+"\t");
        }
    }
    
}
