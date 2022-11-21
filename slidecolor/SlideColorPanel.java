
package slidecolor;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;


public class SlideColorPanel extends JPanel {
    
       private JPanel controlPanel, colorPanel;
       private JSlider rSlider, gSlider, bSlider;
       private JLabel rLabel, gLabel, bLabel;
   
       //constructor of an SlideColorPanel object
       public SlideColorPanel()
       {
            rSlider= new JSlider(JSlider.HORIZONTAL, 0,255, 0);    //first determines the orientation of the slider using one of two JSlider constants (HORIZONTAL or VERTICAL).
                                                              //The second and third parameters specify the maximum and minimum values of the slider, which are set to 0 and 255 for each of the sliders in the example.
                                                            //The last parameter of the JSlider constructor specifies the slider's initial value.
            rSlider.setMajorTickSpacing(50);
            rSlider.setMinorTickSpacing(10);
            rSlider.setPaintTicks(true);      //make above two visible
            
            rSlider.setPaintLabels(true);     //Labels indicating the value of the major tick marks are displayed
            rSlider.setAlignmentX(Component.LEFT_ALIGNMENT);    //Component is a Class, so C not c. 
            
            gSlider= new JSlider(JSlider.HORIZONTAL,0,255,0);
            gSlider.setMajorTickSpacing(50);
            gSlider.setMinorTickSpacing(10);
            gSlider.setPaintTicks(true);
            gSlider.setPaintLabels(true);
            gSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
            
            bSlider= new JSlider(JSlider.HORIZONTAL,0,255,0);
            bSlider.setMajorTickSpacing(50);
            bSlider.setMinorTickSpacing(10);
            bSlider.setPaintTicks(true);
            bSlider.setPaintLabels(true);
            bSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
            
            SliderListener listener= new SliderListener();  //link component(sliders) with their listener(ChangeListener object)
            rSlider.addChangeListener(listener);
            gSlider.addChangeListener(listener);
            bSlider.addChangeListener(listener);
            
            //configure labels
            rLabel= new JLabel("Red: 0");      //initial "Red is 0" is displayed for rLabel
            gLabel= new JLabel("Green: 0");
            bLabel= new JLabel("Blue: 0");
            rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);       //allign the labels from the left side
            gLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
            bLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
            
            //configure panels 
            controlPanel= new JPanel();        //create the panel which contains the sliders and labels
            BoxLayout layout= new BoxLayout(controlPanel, BoxLayout.Y_AXIS);     //decide the layout type
            controlPanel.setLayout(layout);        //set the layout for controlPanel, 加在controlPanel上的component如何排列
            
            controlPanel.add(rLabel);       //first add label on top of slider
            controlPanel.add(rSlider);
            controlPanel.add(Box.createRigidArea(new Dimension(0,20)));    //相当于 加一个空行。
            
            controlPanel.add(gLabel);
            controlPanel.add(gSlider);
            controlPanel.add(Box.createRigidArea(new Dimension(0,20)));
            
            controlPanel.add(bLabel);
            controlPanel.add(bSlider);
            
            colorPanel= new JPanel();
            colorPanel.setPreferredSize(new Dimension(50,50));
            colorPanel.setBackground(Color.red);          //initial colorPanel's color is red
            
            //add control panel and color panel on this main panel which will be added to the frame
            add(controlPanel);
            add(colorPanel);
            setPreferredSize(new Dimension(500,400));
            setBackground(Color.ORANGE);
            
            
       }
       
       private class SliderListener implements ChangeListener
       {
              private int red,green,blue;
              @Override
              public void stateChanged(ChangeEvent event)
              {
                     red= rSlider.getValue();                             //retrieve the sLider's value everytime the slider is adjusted
                     green= gSlider.getValue();
                     blue= bSlider.getValue();
                     
                     rLabel.setText("Red: "+red);                    //show sLider's value on their labels
                     gLabel.setText("Green: "+green);
                     bLabel.setText("Blue: "+blue);
                     
                     colorPanel.setBackground(new Color(red,green,blue));      //update the background color to colorPanel with the new slider readings
                                                //decides the color displayed: an Color Class object takes 3 integer parameters
              }
       }
    
}
