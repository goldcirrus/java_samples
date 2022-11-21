public class Clothing
{
   private double price = 0;       //attribute for Clothing Class
   
   public Clothing( double p )    //constructor to create a Clothing Object
   {
       price = p;           //Clothing class constructor to assign value to attribute 'price'.
       
       System.out.println(" In Clothing constructor  "+this+"=this in Clothing Constructor");
   }
   
   public double get_clothing_price()
   {
     return price;
   }
  
}