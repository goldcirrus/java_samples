
package layoutdemo;
import javax.swing.*;
import java.awt.*;


public class IntroPanel extends JPanel {
    
    //constructor to set up this JPanel with two labels
    public IntroPanel()
    {
          JLabel l1 = new JLabel ("Layout Manager Demonstration*");
          JLabel l2 = new JLabel ("Choose a tab to see an example of a layout manager.");
          add (l1);
          add (l2);
          
          setBackground(Color.green);
    
    }
    
    
    
}
