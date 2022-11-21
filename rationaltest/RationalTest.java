
package rationaltest;


public class RationalTest {

    
    public static void main(String[] args) {
      
        RationalNumber r1 = new RationalNumber(3,5);
        RationalNumber r2 = new RationalNumber(2,6);
        RationalNumber r3,r4,r5,r6;
        
        System.out.println("print out first r1, automatically called toString()method for r1 and r2.\nr1 is " + r1);
        System.out.println("r2 is "+r2);
        
        if (r1.isLike(r2))
            System.out.println("r1 and r2 are equal rational numbers.");
        else
            System.out.println("r1 and r2 are not equal rational numbers.");
        
        
        r3 = r1.reciprocal();
        r4 = r1.add(r2);
        r5 = r1.subtrace(r2);
        r6 = r1.multiply(r2);
                
        
        System.out.println("the reciprocal of r1 is "+r3);
        System.out.println("r1 + r2 = "+r4);
        System.out.println("r1 - r2 = "+r5);
        System.out.println("r1 x r2 = "+r6);
        System.out.println("r1 / r2 = "+r1.divide(r2));
        
        
    }
    
}
