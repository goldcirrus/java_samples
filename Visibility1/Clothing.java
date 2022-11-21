public class Clothing
{
  private double price = 229.95;
  
  Clothing()
  {
      System.out.println("I am in Clothing constructor, a Clothing object is created: this = "+this);
  }
  
   public double get_price()
   {
     return price;
   }
  
}