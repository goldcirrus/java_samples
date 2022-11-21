
package pushcounter;
import javax.swing.JFrame;

public class PushCounter {

    
    public static void main(String[] args) {
        
        JFrame frame= new JFrame("I am the Title");                 //create a new frame to contain the panel, the constructor take a string parameter as the frame's title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //how to close the application when the close button of the frame is clicked
        
        PushCounterPanel panel= new PushCounterPanel();              //create a new PushCounterPanel object(inherited JPanel object) == a panel
        frame.getContentPane().add(panel);                         //add this JPanel object on the frame
                                                          //1.Frame get a Content Pane; 2. the Contaent Pane get a Panel
        frame.pack();              //set up the size of the frame to accomodate the panel: the initial frame size is the size right to contain the panel(the panel size decides the frame's size)
        frame.setVisible(true);    //let the frame be visible
        
        
        
    }
    
}
