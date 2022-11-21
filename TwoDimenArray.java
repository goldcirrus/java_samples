
package twodimenarray;


public class TwoDimenArray {
        
   public static void main(String[] args) {
                                               // [5 arrays][10 integers]
         int [][] table = new int [5][10];      // first prime array has 5 elements, which each element is an array has 10 integer elements
                                            // [ [10 integers],[10 integers],[.......],[.......],[10 integers] ]
         
                                         //for each [row] 
         for(int row=0; row<table.length; row++)                       //table.length=5=first prime array's size
         {                                                            //under [this row],for column[0]-column[this row array.length-1] //row # is the first array's size
             for (int column=0; column<table[row].length; column++)
                 table[row][column] = row*10+column;                  //assign integer value to array elements
         }
         
                                            // print out table's integer elements
         for(int row=0; row<table.length; row++)                //for each row
         {                       
             for (int column=0; column<table[row].length; column++)       //for [this row]
                 System.out.print(table[row][column]+"\t");           //   print out [this row]'s: column[0]-column[table.this row.length-1]
             
             System.out.println();                             //under [this row], change line
         }   
      
    }
    
}
