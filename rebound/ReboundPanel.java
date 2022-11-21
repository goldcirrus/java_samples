
package rebound;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ReboundPanel extends JPanel {
    
    private final int WIDTH=600, HEIGHT=300, DELAY=20, IMMAGE_SIZE=35;     //DELAY is 20 miliseconds
    
    private ImageIcon image;
    private Timer timer;
    private int x,y,moveX,moveY;
    
    //main JPanel constructor==GUI for the image
    public ReboundPanel()
    {
          ReboundListener listener= new ReboundListener();
          timer= new Timer(DELAY,listener);                 //new Timer object constructor take in parameters(delay milisecond, ActionEvent listener).
          
          image= new ImageIcon("meme.gif");
          
          x=0;
          y=40;
          moveX=moveY=3;
          
          
          //configure main panel size and color
          setPreferredSize(new Dimension(WIDTH,HEIGHT));
          setBackground(Color.black);
          
          timer.start();
    }
    
    
    @Override
    public void paintComponent(Graphics pageX)               //called by repaint() method in listener class method actionPerformed
    {
         super.paintComponent(pageX);
         image.paintIcon(this, pageX, x, y);
         
    }
    
    
    
    //listener class for the timer object
    private class ReboundListener implements ActionListener
    {
           //Updates the position of the image and possibly the direction of movement whenever the timer fires an action event.
          @Override
          public void actionPerformed(ActionEvent event)    //每隔20毫秒，action event occurs set by the timer
          {
                 x+= moveX;                     //move image to a new position
                 y+= moveY;
                 
                 if(x<=0 || x>=WIDTH-IMMAGE_SIZE)
                     moveX= moveX*(-1);           //moveX 重新赋值，换方向: direction of movement
                 
                 if(y<=0 || y>= HEIGHT-IMMAGE_SIZE)
                     moveY= moveY*-1;              ////moveY 重新赋值，换方向: direction of movement
                 
                 repaint();                      //it calls the paintComponent()method
          }
        
        //updates the current x and y coordinate values, then checks to see if those values cause the image to “run into”
//the edge of the panel. If so, the movement is adjusted so that the image will make
//future moves in the opposite direction horizontally, vertically, or both. Note that
//this calculation takes the image size into account.
        
          //repaint eventually causes the paintComponent method to be called, which repaints the image in the new location.
          
    }
    
    
}
