
package nestloop1;


public class NestLoop1 {

   
    public static void main(String[] args) {
        
        for (int i = 1; i<6; i++)                    //i is row, j is column
        {
            for (int j =1;j < 6-i; j++ ) 
            {
                 System.out.print(" ");      //1st row, print 4 blank spaces,
            }
            
            for (int j=1; j<i; j++)         //1st row, print 1
            {
                 System.out.print(j);
            }
            
            for (int j=0; j<i; j++)             //1st row, print 0; 
            {
                 System.out.print(i-j);
            }
            
            System.out.println();
        }
        
        //second loop 
        for (int i = 1; i<6; i++)
        {
            for (int j=0; j<i; j++)
            {
                 System.out.print(" ");
            }
            
            for (int j=1; j<6-i; j++)
            {
                 System.out.print(j);
            }
            
            for (int j=1; j<5-i; j++)         // j=1,j=2,j=3, j=
            {
                 System.out.print(5-i-j); //5-i is each line's Minuend, fixed for each line. j is from 1 to 5-i. 
            }
            
            System.out.println();
        }
        
    }
    
}
