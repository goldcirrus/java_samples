
package graderange;


public class GradeRange {

    
    public static void main(String[] args) {
        
        Grade[]  grades = { new Grade("A",90),            //instantiate this array by Initializer List
                            new Grade("B",80),
                            new Grade("C",70),
                            new Grade("D",60),
                            new Grade("F",0)   };
        
        for (Grade x: grades)
        {
             System.out.println(x);  //print out every Grade object in array-grades, toString method automatically called for each Grade object
        }
        
        System.out.println("grades-Array's size is "+ grades.length);
    }
    
}
