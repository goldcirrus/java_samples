import java.util.*;

public class AlarmedCar extends Car {
    
    Scanner scan = new Scanner(System.in);

    /**
     * Override turn_ignition() method to start the car. We want to ask for a password first.
     * AlarmedCar class override the turn_ignition() method, but inside it to use super(parent object)'s turn_ignition() method
     */
    public void turn_ignition() {
        
        /** put your code somewhere in here to ask for a password. If
         * password is wrong refuse to start the car
         */
        System.out.println("enter a code to start the engin:");
        int code = scan.nextInt();
        
        if(code==5678)
            super.turn_ignition();   //super represent(parent object)to call the same name method(same name as this method itself which use it) in the parent Class(Car Class)
        else
            System.out.println("wrong code");
        
    }
}
