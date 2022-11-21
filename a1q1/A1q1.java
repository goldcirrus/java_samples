/*
 * L Zhong 
 * T00224182
 */
package a1q1;
import java.util.Random;
/**
 *
 * @author Kevin Zhong 
 * T00224182
 */
public class A1q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int n=30;        
        int[] ranArr = new int[n];
        
        for(int i=0; i<ranArr.length; i++)
        {
             ranArr[i]=rand.nextInt(100);
        }
       
        printArray(ranArr);
        System.out.println("  <I just created a new array>");
        
        long startTime = System.nanoTime();
        
        bubbleSort(ranArr);
        
        long endTime = System.nanoTime();
        
        long runTime= endTime-startTime;
        
        System.out.println("\nbubbleSort running time in nano seconds is: "+ runTime);
       
                        
    }
    
    public static void bubbleSort(int[] arrX){
      
        for (int p=0; p<arrX.length; p++)
        {
            for(int s=0; s< arrX.length-1; s++)
            {
                if(arrX[s]>arrX[s+1])
                {
                    int middle;
                    middle=arrX[s];
                    arrX[s]=arrX[s+1];
                    arrX[s+1]=middle;
                               //print out the new array after each swap
                    printArray(arrX);
                    System.out.println("roung one ok");
                }
                            }
                    }
        System.out.println("finished sorted array is: ");
        printArray(arrX);
    }
    
    
    
    public static void printArray(int[] arrX)
    { 
         for(int i:arrX)
         {
            System.out.print(i +" ");
         }
    }
    
}
