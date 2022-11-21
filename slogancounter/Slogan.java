
package slogancounter;


public class Slogan {
    
    private String phrase;
    private static int count;
    
    //constructor of objects of Slogan class
    public Slogan(String word)
    { 
        phrase =  word;
        count++;
    }
    
    @Override
    public String toString()  //retrun a string = phrase contents; not the object address, when print out or concatnate with another string
    {
        return phrase;
    }
    
    public static int getCount()  //static method can use static variable: count
    {
        return count;
    }
    
    
    
}
