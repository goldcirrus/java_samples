
package slidecolor;
import java.awt.*;
import javax.swing.*;


public class SlideColor {

    
    public static void main(String[] args) {
        JFrame frame= new JFrame("The title of SlideColor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SlideColorPanel panel= new SlideColorPanel();
        frame.getContentPane().add(panel);
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
