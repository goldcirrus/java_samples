public class TestDriver
{
  
 public static void main(String[] args)
 {
   
   Shoes nikeX = new NikeAirMax();       //Create a new NikeAirMax object with a Shoes Type
                                        //nike has visibility to public methods upper from Shoes, Clothing, Object Class
   
   System.out.println( "I'm the first main print out: "+nikeX.get_size() );            //size is private attribute in Shoes Class
                                                     //get_size() is public method in Shoes Class
                                                     
   System.out.println( "I'm the second main print out: "+nikeX.get_price() );           //price is private attribute in Clothing Class
                                                     //get_price() is public method in clothing Class
   
                  //System.out.println( nike.get_inventor() );   //won't work because nike is Shoes Type, not NikeAirMax Type, so this object can't use NikeAirMax Class 
   
   
   /**cast down nikeX, no constructor is called.   */
   NikeAirMax nikeX_DownCast = (NikeAirMax)nikeX;  //nike is Shoe Type when it is created, now cast nike to NikeAirMax Type
                                           //nike_2 has visibility to public methods up from NikeAirMax Class, Shoe, Clothing, Object Class
   System.out.println( "I'm the third main print out: "+nikeX_DownCast.get_inventor());    
    
                  //nike.get_inventor();     //nike still can't see the NikeAirMax Class method eventhough it points to the same object as the nike_2 does
    
    
    
   System.out.println(nikeX_DownCast + " = object refered by 'nikeX_DownCast', nikeX_DownCast's Type is Changed from Shoes to NikeAirMax,so nikeX_DownCast can use public method in NikeAirMax Class by nikeX_DownCast.method_name()");
                                 //nike_2 still refers to the original nike object with the same address
                                 
   System.out.println(nikeX + "= object refered by 'nikeX'. it is the same object refered by 'nikeX_DownCast', but different type, and no visibility to method in NikeAirMax Class");
    

 }
  
 
}