
package styleoptions;
import javax.swing.JFrame;

public class StyleOptions {

    
    public static void main(String[] args) 
    {
 
       JFrame frame = new JFrame ("Style Options Title");
       frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

       frame.getContentPane().add (new StyleOptionPanel());

       frame.pack();
       frame.setVisible(true);
    }
    
}
