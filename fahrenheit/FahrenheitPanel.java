
package fahrenheit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FahrenheitPanel extends JPanel {
    
    private JLabel inLabel, outLabel, resultLabel;
    private JTextField fahTextF;
    
    
     //constructor to setup main GUI components
    public FahrenheitPanel()          
    {
            inLabel= new JLabel("Enter Fehrenheit degrees: ");
            outLabel= new JLabel("The Celsius degree is ");
            resultLabel=new JLabel("---");
            
            fahTextF= new JTextField(5);     //5 represents the length/size(# of chars) of the new text filed object
            FahTextListener listener= new FahTextListener();  //create an listener for the text field objects
            fahTextF.addActionListener(listener);
            
            
            add(inLabel);
            add(fahTextF);
            
            add(outLabel);
            add(resultLabel);
            
            setPreferredSize(new Dimension(500,200));     //set main panel size
            setBackground(Color.ORANGE);                  //set main panel background color
    }
    
    //listener class for textfield      implements: ActionListener interface
    private class FahTextListener implements ActionListener 
    {  
          @Override
          public void actionPerformed(ActionEvent event)
          {    
               int fahDegree, celDegree;
               String text= fahTextF.getText();     //retrieve the string content in the fahText text field
               
               fahDegree =Integer.parseInt(text);
               celDegree =(fahDegree-32)*5/9;
               
               resultLabel.setText(""+ celDegree);      //convert celDegree(int) to String and assign it to resultLabel(JLabel) variable
                                                          //or setText(Integer.toString(celDegree));
          }
         
    }
    
    
}
