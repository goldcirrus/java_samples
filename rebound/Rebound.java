
package rebound;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rebound {

    
    public static void main(String[] args) {
        
        JFrame frame= new JFrame("The title of the frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ReboundPanel panel= new ReboundPanel();
        frame.getContentPane().add(panel);
        
        frame.pack();
        frame.setVisible(true);
        
        
        
    }
    
}
