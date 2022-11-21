public class TestDriver
{
  
 public static void main(String[] args)
 {
   
    Shoes nike = new NikeAirMax();
     
    boolean check;
    
    check = nike instanceof NikeAirMax;
    System.out.println( "Is nike an instance of NikeAirMax?  " + check );
    
    check = nike instanceof Shoes;
    System.out.println( "Is nike an instance of Shoes?  " + check );
    
    check = nike instanceof Clothing;
    System.out.println( "Is nike an instance of Clothing?  " + check );
    
    check = nike instanceof Object;
    System.out.println( "Is nike an instance of Object?  " + check );
    
    check = nike instanceof Online;
    System.out.println( "Is nike an instance of Online?  " + check );
   
 }
 
}