
package layoutdemo;
import java.awt.*;
import javax.swing.*;

public class GridPanel extends JPanel{
    
    public GridPanel()           //constructor:  The number of rows and columns in a grid layout is established using parameters
                                       //to the constructor when the layout manager is created.
    {
       setLayout (new GridLayout (2, 3));     //the panel should be managed using a grid of two rows and three columns
       setBackground (Color.green);
       
       JButton b1 = new JButton ("BUTTON 1");
       JButton b2 = new JButton ("BUTTON 2");
       JButton b3 = new JButton ("BUTTON 3");
       JButton b4 = new JButton ("BUTTON 4");
       JButton b5 = new JButton ("BUTTON 5");
       add (b1);
       add (b2);
       add (b3);
       add (b4);
       add (b5);
    
    
    
    }
    
}
