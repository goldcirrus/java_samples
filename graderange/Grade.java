
package graderange;


public class Grade {
    
    private String grade;
    private int lowerBound;
    
    public Grade (String gradeX, int bound)
    {
         this.grade = gradeX;
         this.lowerBound = bound;         
    }
    
    @Override
    public String toString()
    {
         return grade+":  "+lowerBound;     //return this string pattern when an Grade object is print or concatenate with another String
    }
    
    
    
}
