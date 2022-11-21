public class Shoes extends Clothing
{
  
  private int size = 11;
  
  Shoes()
  {
       System.out.println("I am in Shoes constructor, a Shoes object is created and this = "+this);
  }

   public int get_size()
   {
    return size;
   }
  
}