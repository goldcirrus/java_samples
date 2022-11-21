
package sneakeyes;


public class Die {
    private final int MAX =6;
    private int faceValue;
    
    public Die()   //constructor for Die class objects  (Capital first letter for this special method)
    {  
        faceValue =1;
    }
    
    public int roll()                                  // method roll(): setter and getter faceValue in one method
    {                                                  //Math.random() return double 0-0.999999, *MAX=6 return 0-5.99999 cast to integer = 0-5, +1 = 0-6
        faceValue = (int)(Math.random()*MAX)+1;   //faceValue mutator(setter)
        return faceValue;                        // faceValue accessor(getter)
    }
    
    public void setFaceValue(int value)  //facevalue mutator(setter): to set a new facevalue method
    {
         if (value>=1 && value <=MAX)
             faceValue = value;
    }
    
    public int getFaceValue()   //faceValue accessor(getter)(read only),return faceValue integer value
    {
         return faceValue;
    }
    
    @Override
    public String toString()
    {
         return Integer.toString(faceValue);
    }
    
    }
    
    
    

