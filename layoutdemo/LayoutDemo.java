
package layoutdemo;
import javax.swing.*;

public class LayoutDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame= new JFrame("title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tb= new JTabbedPane();  //tabbed pane, a container that allows the user to select (by clicking on a tab) which of several panes is currently visible.
        
        IntroPanel i= new IntroPanel();    //each tab of the tabbed pane contains a panel that is controlled by a different layout manager.
        tb.addTab("Intro", i);                 //addTab method creates a tab, specifying the name that appears on the tab
        
        FlowPanel f= new FlowPanel();
        tb.addTab("Flow", f);
        
        BorderPanel o= new BorderPanel();
        tb.addTab("Border",o);
        
        GridPanel g= new GridPanel();
        tb.addTab("Grid",g);
        
        BoxPanel b= new BoxPanel();
        tb.addTab("Box",b);
        
        frame.getContentPane().add(tb);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
