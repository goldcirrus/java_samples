

import java.util.*;

/**
 * The riding mower class developed by the engineering department. Contains all the functionality needed
 * for a working riding mower.
 *
 */
public class RidingMower {
    
    private boolean rider_in_seat = false;
    
    private boolean is_engine_on = false;
    
    private boolean is_mower_enabled = false;
    
    private Random rn = new Random();
 
    /**
     * Constructor for Riding Mower which automatically launches the main menu.
     */
    public RidingMower()
    {
        mainMenu();
    }

    /** Starts the engine of the riding mower (ignition start) */
    public void start_engine()
    {
        System.out.println("<<< Starting riding mower >>>");
        
        is_engine_on = true;
    }
      
    /** Method that randomly seats and unseats a driver */
    private void sit_rider()
    {
        
        int random = rn.nextInt(5);
        
        if ( random<=1 )
            rider_in_seat = true;
        else 
            rider_in_seat = false;       
        
        System.out.print("\t=>Seated? " + rider_in_seat + "\n");
    }
    
    /** Seat sensor. Returns true if there is a driver seated on the mower or false
     * if no driver is sitting on the mower.
     * @return 
     */
    public boolean check_seat_sensor()
    {   
        return rider_in_seat;
    }
    
    /** Method that engages the mower blades and begins mowing if the ignition is turned on */
    public void mow()
    {
        start_mowing();
    }
    
    /** Primary method that handles the mowing. Checks to see if the ignition is on then the 
      mowing starts otherwise the cutting blades are lowered and ready to mow upon engine start
      */
    private void start_mowing()
    {
        
        is_mower_enabled = true;
        
        System.out.println("Mower blade ready to mow");
        
        if ( !is_engine_on ) return;
        
        int i=1;
        
        while (true)
        {
            mowing(i++);
       
        }
    }
    
    /** Mower fully functioning here and blades are spinning. Simulates a rider being thrown off 
     the mower at step 50,000 */
    private void mowing(int i)
    {
        System.out.println( "Mowing..." + i);
        
        if ( i>50000 ) 
            rider_in_seat = false;
        
        if (rider_in_seat == false)
            System.out.println("\tOMG Mower is moving without a driver?!");
        
        mowing_hook();
    }
    
    /** Hook/Stub function called while the mower is mowing. Other departments divisions can override */
    public void mowing_hook()
    {
        
    }
    
    /** Turns off the ignition. Stops the mower if running. */
    public void stop_mower()
    {
        System.out.println("Stopping the mower.");
        System.exit(0);                                    //stop the whole program
    }
    
    /** Main menu of the mower simulation. Asks user to check/seat a driver, start the mower, 
     * begn mowing the lawn, or exiting the simulation. Method is private and can not be 
     * overriden.
     */
    private void mainMenu()
    {
        Scanner sc = new Scanner( System.in );
        int option;
        
        do
        {
            System.out.println();
            System.out.println("1. Is driver seated? (" + rider_in_seat +")" );
            System.out.println("2. Start mower");
            System.out.println("3. Mow the lawn");
            System.out.println("4. Stop mower (if running) and Exit.");
            System.out.println();
            System.out.println("CHOOSE 1-4");
            
            option = sc.nextInt();
            
            switch ( option )
            {        
                case 1: sit_rider();                   //reset boolean variable (rider_in_seat)
                        break;
                        
                case 2: start_engine();
                        if ( is_mower_enabled ) mow();
                        break;
                
                case 3: mow();
                        break;
                        
                case 4: stop_mower();
                        break;
            }
            
        } while ( true ); // Infinite loop here. Select option #4 to exit the program.
    }
}
