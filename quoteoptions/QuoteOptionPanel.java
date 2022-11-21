
package quoteoptions;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class QuoteOptionPanel extends JPanel{
    private JRadioButton coButton, carButton, phButton;
    private JLabel labelQ;
    private String coQuote, carQuote, phQuote;
    
    //set up an constructor to create a panel with JRadioButton objects
    public QuoteOptionPanel()
    {
           coQuote= "comody station";                 //define the string contents for each radioButton will display on the label when the corresponding button is selected
           carQuote= "mesure then cut the wood";
           phQuote= "I think, so I do";
           
           labelQ= new JLabel("Make your choice");                   //create an JLabel object with the string content first displayed
           labelQ.setFont(new Font("Helvetica",Font.ITALIC,16));     //set font for labelQu object, must create a new font object. Font.ITALIC==2
    
           coButton= new JRadioButton("comody show");         //create the JRadioButton objects
           carButton= new JRadioButton("carpentry",true);     //true --- start with this button selected
           phButton= new JRadioButton("philosophy yah");            
           coButton.setBackground(Color.white);
           carButton.setBackground(Color.white );
           phButton.setBackground(Color.MAGENTA);
           
           ButtonGroup group= new ButtonGroup();    //**create a ButtonGroup object to contain all radio buttons, ensure only one button can be selected
           group.add(coButton);                     //**add each radio buttons to this ButtonGroup object
           group.add(carButton);
           group.add(phButton);
           
           QuoteListener listener= new QuoteListener();   //create listener object
           coButton.addActionListener(listener);          //add Actionlistener object to buttons
           carButton.addActionListener(listener);
           phButton.addActionListener(listener);
           
           //add label and button on this panel and set panel color
           add(labelQ);
           add(coButton);
           add(carButton);
           add(phButton);
           
           setPreferredSize(new Dimension(600,300));
           setBackground(Color.YELLOW);
           
    }
    
    private class QuoteListener implements ActionListener
    {
           @Override
           public void actionPerformed(ActionEvent event)
           {
                 Object source= event.getSource();         //**the object on which the event initially occurs
                 
                 if(source==coButton)                 //compare two object's address to see whether they point to the same address
                     labelQ.setText(coQuote);
                 else if(source==carButton)
                     labelQ.setText(carQuote);
                 else
                     labelQ.setText(phQuote);
           }
    
    
    }
    
    
    
    
}
