public class NikeAirMax extends Shoes
{
    /**Constructor to create a NikeAirMax object. Inside this constructor, it uses parent class(super)'s constructor. */
    public NikeAirMax()   
    {
        super( "Nike Air Max", 229.95 );    // super represents Shoes Class constructor< Shoes(String x, double y) > (pass in Shoes constructor 2 parameters here)
                
        System.out.println("create an NikeAirMax object In NikeAir constructor  "+this+"=this");
    }
  
   public void just_dont_do_it()
   {
       String name = get_shoe_name();    //no need to create a Shoe object to use Shoe Class method because NikeAirMax Class extends/inherits Shoe Class
       double price = get_clothing_price();       //no need to create a Clothing object to use Clothing Class method because NikeAirMax Class extends Shoes Class which extends Clothing Class
       
     System.out.println( "just_dont_do_it method fired: The " + name + " will cost " + price );
     
   }
  
}