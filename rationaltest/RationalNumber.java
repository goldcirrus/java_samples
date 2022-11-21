
package rationaltest;


public class RationalNumber {
    private int numerator, denominator;
    
    //constructor: nonZero denominator, only numerator is signned
    public RationalNumber(int nume, int denom)
    {
        if (denom==0)   
       {   System.out.println("Invalid input, denominator can't be Zero. Reset denominator to 1.");
            denom =1;
        }    
        
        if (denom < 0 )   //if denominator is negotive, change both signs for denominator and numerator.
       {
            nume = nume * -1;
            denom = denom * -1;
        }      
            
        numerator = nume;
        denominator = denom;
        reduce();
    }
    
    private int gcd(int num1, int num2) //use Euclid algorithm to find the greatest common divisor between tow integers
    {   
        while (num1!=num2)
        {    if (num1>num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num1;
    }
    
    private void reduce()    //simplify this rational number by the greatest common facor of the numerator and denominaor.
    {   
        if (numerator != 0)           //numerator == this.numerator == calling object's numerator
        {   
           int common = gcd(Math.abs(numerator),denominator);    //reduce() method calls another gcd() method in the same class  // denominator==this.denominator, numerator==this.numerator
           numerator = numerator/common;
           denominator = denominator/common;
        }
    }
    
    public int getNumerator()
    {
         return numerator;
    }
    
    public int getDenominator()
    {
         return denominator;
    }
    
                                                           //a method to return a new RationalNumber type object= the reciprocal of the rational number
    public RationalNumber reciprocal()
    {
        return new RationalNumber(denominator,numerator);  //call the RationalNumber constructor to build a new RationalNumber object. then, return it. 
    }
    
                                                          //a method to add a RationalNumber type object passed in as a parameter to this RationalNumber who called the add method
    public RationalNumber add(RationalNumber obj2)       // a/b + c/d = sum(ad+cb)/common denominator bc
    {
         int newDenom = denominator*obj2.getDenominator();  //b*d=new denominator
         int newNumer = numerator*obj2.getDenominator() + obj2.getNumerator()*denominator;  //ad+cb = new Numerator
         
         return new RationalNumber(newNumer,newDenom);  //use RationalNumber constructor to create a new RationalNumber object which is the sum of two objects, and ruturn the new object's variables value
    }
    
    public RationalNumber subtrace(RationalNumber obj2)
    {
         int newDenom = denominator*obj2.getDenominator(); // b*d = new denominator
         int newNumer = numerator*obj2.getDenominator() - obj2.getNumerator()*denominator;
         
         return new RationalNumber(newNumer, newDenom);
    }
    
    public RationalNumber multiply(RationalNumber obj2)    // a/b * c/d = a*c / b*d
    {
         int newDenom = denominator*obj2.getDenominator();  //new denominator = b*d
         int newNumer = numerator*obj2.getNumerator();      //new numerator = a*c
         
         return new RationalNumber(newNumer,newDenom);
    }
    
    public RationalNumber divide(RationalNumber obj2)  // object1(a/c) / object2(c/d) = (a/b)*(1/(c/d))
    {
         return this.multiply(obj2.reciprocal());   //take parameter of a RationalNumber type object, and return a RationalNumber type objec
    }
    
    public boolean isLike (RationalNumber obj2)   //compare two objects' variable value, variables are all integers, so can use == to verify the equality
    {
          return (this.numerator == obj2.getNumerator() && this.denominator==obj2.getDenominator());
    }
    
    @Override
    public String toString()    //when a RationalNumber type object need to print or concatnate with another string, this method is automatically called to convert the RationalNumber object to a string
    {
         String resultStr;
         
         if (numerator==0)
             resultStr = "0";
         else
             if (denominator==1)
                 resultStr = numerator + "";    //integer numerator to concatnate with a string"", so resultStr is a string
             else 
                 resultStr = numerator + "/" + denominator;  // two integer concatnated with a string char "/", so the result is string
    
         return resultStr;   //if numerator is 0, the rational number is 0. if denominator is 1, the rational number is the integer numerator, else, the rational number is in the form of string: a/c
    }
    
    }
    
    
    

