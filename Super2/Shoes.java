public class Shoes extends Clothing
{
   private String shoe_name = null;
   
   /**Constructor to create a Shoes object. This constructor uses its parent class(super)'s constructor. */
   public Shoes( String shoeName, double priceX )  //constructor
   {
       super( priceX );   //super represents Clothing Class constructor <Clothing(String p)> pass in Clothing Constructor one parameter 'priceX' here to assign value to Clothing Class attribute 'price'.
       
       
       shoe_name = shoeName ;    //the rest is to assign the Shoes class variable: shoe_name's value. 
       
       System.out.println(" In Shoes constructor  "+this+"=this in shoes Constructor");
   }
    
   public String get_shoe_name()
   {
     return shoe_name;
   }
}