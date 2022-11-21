
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t00224182
 */
public class MyTimer implements ActionListener  {
    
    //used to pass in main class object
    private TheGameMainWindow mwin;
    
    /**Constructor with a parameter of an main frame object to pass in main frame object to get access to methods in main class. */
    public MyTimer(TheGameMainWindow objX)
    {
         mwin=objX;
    }
    
    @Override       //ganrantee this class has this method
    public void actionPerformed(ActionEvent e)
    {
       mwin.greenGoblingMove();        //through the class variable which is an main frame object to use method in main class
    }
    
}
