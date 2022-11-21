
package styleoptions;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StyleOptionPanel extends JPanel {
    
    private JLabel label;
    private JCheckBox checkBold, checkItalic;
    
    //constructor to build a panel with a label and two check boxes
    public StyleOptionPanel()
    {
           label= new JLabel("Say it with my style!");      //create JLabel object with a passed in Title
           Font font1= new Font("helvatica",Font.PLAIN,36);   //create a Font object to set label's font
           label.setFont(font1);                               //set label's font
           
           checkBold= new JCheckBox("bold");     //to create a checkBold CheckBox object and its description
           checkBold.setBackground(Color.red);
           
           checkItalic= new JCheckBox("italic");  
           checkItalic.setBackground(Color.BLUE);
           
           CheckboxListener listener= new CheckboxListener();             //create a listener object for JCheckbox objects
           checkBold.addItemListener(listener);                        //link checkBox objects with their listener object
           checkItalic.addItemListener(listener);
           
           add(label);
           add(checkBold);
           add(checkItalic);
           
           setPreferredSize(new Dimension(500,300));
           setBackground(Color.GRAY);
           
    
    }
    
    private class CheckboxListener implements ItemListener
    {
         @Override
          public void itemStateChanged(ItemEvent ievent)             //what to do when a checkBox object is checked
          {
                  int style= Font.PLAIN;        //Font.PLAIN==0
                  
                  if(checkBold.isSelected())
                  {
                      style=Font.BOLD;           //Font.BOID==1
                      System.out.println("style for Font.bold is "+style);
                  }
                  if(checkItalic.isSelected())   //don't use else if, or wont do both bold and italic because if (bold is ture), then it wont do else if part
                  {
                      style+=Font.ITALIC;               //Font.ITALIC==2  
                      System.out.println("style for Font.italic is "+style);
                  }
                  
                  System.out.println("final style is "+style);          //java font style can be: both bold&italic == 3, bold==1, italic==2, plain==0
                  
                  Font font1= new Font("Previous", style, 36);        //font object is defined by font name,font style,font size.
                  label.setFont(font1);
                  
                                                                       
          }
    }
    
    
}
