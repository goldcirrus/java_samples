
package leftright;
import javax.swing.JFrame;

public class LeftRight {

    
    public static void main(String[] args) {
       
        JFrame frame= new JFrame("Title of LR Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new LRPanel());   //add new LRPanel object to ContentPane of the frame object; 
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
