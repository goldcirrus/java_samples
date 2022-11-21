/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcuzzola
 */
public class SafeRidingMower extends RidingMower 
{
    /**method to start the engine when check_seat_sensor method ensures someone is seated.  */
     @Override
     public void start_engine()
    {                               //check_seat_sensor method returns variable(rider_in_seat) in RidingMower Class
        if(check_seat_sensor())     //rider_in_seat must be true to start_entine() which set boolean variable(is_engine_on) in RidingMower Class to true. 
             super.start_engine();
        else
             System.out.println("Failed! Please be seated on the mower first!");
         
    }
     
     /**method to mow when it is seated and engine is on. */
     @Override
     public void mow()
     {
          if(check_seat_sensor())               //check_seat_sensor method return variable(rider_in_seat) in RidingMower Class
              super.mow();
          
          else
              System.out.println("Failed. Please seat on the mower and turn on the engine first.");
      }
     
     
     /**method to stop the mowing when the seat is empty. */
     @Override
        public void mowing_hook()
    {
         if(!check_seat_sensor())
              super.stop_mower();
    }
    
    
}
