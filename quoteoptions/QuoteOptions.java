

package quoteoptions;
import javax.swing.JFrame;



public class QuoteOptions {

    
    public static void main(String[] args) {
        JFrame frame= new JFrame("the title of Quote Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        QuoteOptionPanel panel= new QuoteOptionPanel();
        frame.getContentPane().add(panel);
        
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
