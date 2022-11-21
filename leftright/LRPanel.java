
package leftright;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
        

public class LRPanel extends JPanel {        //LRPanel Class object includes a label and two buttons in a small panel, button's listener Class(internal class which implements an interface method) object defines what happens when button's event action occurs(click button): update label's content
    
    private JButton leftButton, rightButton;
    private JLabel label;
    private JPanel buttonPanelX;              //the small panel inside the big panel to hold two buttons
    
    public LRPanel()                                 //constructor to build a LRPanel objcet, when every time an LRPanel object is created
    {                                                 //constructor to set up main GUI components: leftButton, rightButton,small panel, listener of buttons and label, 
          leftButton= new JButton("LeftButton");            //create two JButton objects
          rightButton= new JButton("RightButton");
          
                    //create a listener for the button objects
          ButtonListener listener= new ButtonListener();      //link the JButton object's ActionEvent with what shall happen defined by the JButton object's listener Class object
          leftButton.addActionListener(listener);
          rightButton.addActionListener(listener);
          
          
          
          buttonPanelX= new JPanel();              //to create a small panel inside the frame's whole panel to hold the two buttons
          
          buttonPanelX.add(leftButton);                  //small panel setups
          buttonPanelX.add(rightButton);
          buttonPanelX.setBackground(Color.YELLOW);
          buttonPanelX.setPreferredSize(new Dimension(300,150));
          
          
          
          label= new JLabel("push button");
          
          //main panel setups
          add (label);                                  //to add the label and the small panel(holds the two buttons) on the whole panel to fill the frame
          add (buttonPanelX);
          setPreferredSize (new Dimension(400, 300));   //this set the panel which fills the whole frame
          setBackground (Color.cyan);
          
          
    
    }
    
    private class ButtonListener implements ActionListener  //ButtonListener Class object implements ActionListener interface method actionPerformed
    {
           @Override
           public void actionPerformed(ActionEvent event)      //ActionEvent == mouth click is the parameter passed in
           {
                if (event.getSource()==leftButton)
                    label.setText("Left mmaa");
                else
                    label.setText("then it is Right");
           }
    }
    
}
