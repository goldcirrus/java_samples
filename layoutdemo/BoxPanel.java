
package layoutdemo;
import java.awt.*;
import javax.swing.*;


public class BoxPanel extends JPanel {
    
    public BoxPanel()
    {                                              //X axis (horizontal) or the Y axis (vertical)
           setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  //the constructor of the BoxLayout class takes as its first parameter the component that it will govern
           setBackground (Color.green);
           
           JButton b1 = new JButton ("BUTTON 1");
           JButton b2 = new JButton ("BUTTON 2");
           JButton b3 = new JButton ("BUTTON 3");
           JButton b4 = new JButton ("BUTTON 4");
           JButton b5 = new JButton ("BUTTON 5");
           
           add (b1);
           add (Box.createRigidArea (new Dimension (0, 10)));     //The Box class, which is also part of the Java standard class library, contains
                                                                 //static methods that can be used to create these invisible components for gaps between the visible components
       
           add (b2);
           add (Box.createVerticalGlue());   //glue, which specifies where excess space in a container should go.
           
           add (b3);
           add (b4);
           add (Box.createRigidArea (new Dimension (0, 20)));
           
           add (b5);
    
    
    
    }
    
}
