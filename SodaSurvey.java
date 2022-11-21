
package sodasurvey;
import java.text.DecimalFormat;


public class SodaSurvey {

   
    public static void main(String[] args) {
        
        int [][]  scores = { {3,5,6,3,2,5,4,2,1,3},           //row is for the same soda  
                             {2,4,3,2,5,1,4,3,2,5},          //column is for the same people
                             {3,2,4,1,2,3,2,1,5,2},
                             {5,4,3,4,5,3,2,5,1,3} };   // [prime array] [inner arrays]
        
        final int SODAS = scores.length;      //row # is SODA # = prime array's size 
        final int PEOPLE = scores[0].length;  //column # is PEOPLE # = first secondary array's size
        
        // create an array to hold SODA#(size) integers
        int[] sodaSumScore = new int[SODAS];                   // to hold scores for each type of soda  by different people
        // create an array to hold PEOPLE#(size) integers
        int[] peopleSumScore = new int[PEOPLE];                //to hold scores by each person for different sodas
        
        for(int soda=0; soda<SODAS; soda++)     //for loop control rows:sodas
        {     
                                   //scores.length is row#
            for (int people=0; people<PEOPLE; people++)   //for loop control columns:people
              {            //for soda=0, sodaSum[0]= sum of scores[soda=0] x [[people [0] to people[column length]], then loop ++: row/soda= (0-row length-1)
                  sodaSumScore [soda]+= scores[soda][people];     //under certain soda row, sumSoda= sum of people/column's scores
                       
                  peopleSumScore [people] += scores[soda][people];   //under certain people column sumPeople= sum of soda/row's scores
              }             //for people=0, peopleSum[0]= sum of scores [ [soda=0] to [soda=row length] ] x [people=0]
        }                   //then loop++: column/peoplw= 0- (column length-1)
        
        System.out.println("sodaSum array list is: ");
        for(int i=0; i<SODAS; i++)
        {   
            System.out.print(sodaSumScore[i]+",  ");
        }
        
        System.out.println();
        
               
        System.out.println("peopleSum array list is: ");
        for(int i=0; i<PEOPLE; i++)
        {
            System.out.print(peopleSumScore[i]+",  ");
        }
        
        System.out.println();
        
        
        DecimalFormat fmt = new DecimalFormat("0.###");
        
        for (int soda=0; soda<SODAS; soda++)
        {     
              double sodaAverage = (double) sodaSumScore[soda] /PEOPLE;       //each sodaSum element/people#(column#)
              System.out.println("Soda No."+ (soda+1)+ "'s average rating is "+fmt.format(sodaAverage));
        }
        
        
        for (int person=0; person<PEOPLE; person++)
        {
             double peopleAverage = (double) peopleSumScore[person] /SODAS;
             System.out.println("people No."+(person+1)+"'s average rating is: " +fmt.format(peopleAverage));
        }
        
        
        
       
        
     
        
    }
    
}
