package layoutdemo;
import java.awt.*;
import javax.swing.*;

public class BorderPanel extends JPanel{
    
          //constructor of panel
    public BorderPanel()
    {
          BorderLayout border= new BorderLayout();    
          setLayout(border);               //decide the layout of this BorderPanel object
          
          JButton b1 = new JButton ("BUTTON 1");
          JButton b2 = new JButton ("BUTTON 2");
          JButton b3 = new JButton ("BUTTON 3");
          JButton b4 = new JButton ("BUTTON 4");
          JButton b5 = new JButton ("BUTTON 5");
          add (b1,BorderLayout.EAST);         //first parameter the component to be added.
          add (b2,BorderLayout.CENTER);       //second parameter indicates the area to which it is added
          add (b3,BorderLayout.SOUTH);       //add the buttons on this panel according to the selected layout position
          add (b4,BorderLayout.WEST);
          add (b5,BorderLayout.NORTH);
          
          setBackground(Color.YELLOW);
    
    
    }
    
    
}
