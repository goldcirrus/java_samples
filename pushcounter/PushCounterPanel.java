
package pushcounter;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
        

public class PushCounterPanel extends JPanel {
    
    private JButton button;
    private JLabel label;
    private int counter;
    
    public PushCounterPanel()   //constructor to set up the GUI: build a JPanel object to use JPanel methods
    {
         counter=0;
         
         button= new JButton("Push Me");     //take a string parameter to be shown on the button; button is a component will be added on the panel
         
         label= new JLabel("push times: "+ counter);   //take a string parameter to be shown on the lable; label is a component will be added on the panel
         
         add(button);   //add button component on the panel
         add(label);    //add label component on the panel
         
                                                            //a JButton generate an Action Event when it is pushed, so when button is pushed, the ActionEvent is passed to ButtonListener's actionPerformed() method to update the counter and label
         button.addActionListener(new ButtonListener());    //**** associate the relationship between the component(button) and the listener(an new ButtonListener object)
  //component(button)        //what does button action event(click) trige  // the ButtonListener object has one method(update the counter and label) to do when the button event occurs(clicked)
                                             //ActionListen Class(implements ButtonListener Class) object to tell button component what to do when an action event(click) occurs: component.addActionListener(take a parameter==new ButtonListener object) :to update the counter and label when the button event (click) occurs
         
         setBackground(Color.pink);                    //set the color of the panel
         setPreferredSize(new Dimension(500,800));    //set the size of the panel, take an parameter of a new Dimension object
    }
    
              //action listener Class        //interface        //ButtonListener Class is an inner class within Panel Class
    private class ButtonListener implements ActionListener   // listener class: wait for when button component has an action event occurs(is clicked), do update the counter and label string
    {                                                         // to tell button component what to do when its event(click) occurs
           @Override                    //ActionEvent object is the pushing button event                   
           public void actionPerformed(ActionEvent event)    //an ButtonListener object wait for an event action(clicked) occurs to perform this method: to update the counter and label's text content when button's event occurs(clicked)
           {                                                 //what does the button action event(click) do as the follows:
                  counter++;                              //*** a JButton generate an Action Event when it is pushed, this ActionEvent is taken by this method as a parameter
                  label.setText("push times is"+counter);  //this method is an ActionEvent listener, because it takes in a ActionEvent parameter
           }
                         //action listener Class implemented through ActionListener interface, to listen for the ActionEvent(push the button), and do the update when the ActionEvent object passed in when the button is pushed
                        //action listener Class defines the ActionListener interface's method: actionPerformed() what to do when ActionEvent occur/passed in
    }
                       //ButtonListener Class 要调用ActionListener interface的actionPerformed method to define what to do when the ActionEvent occurs
}
