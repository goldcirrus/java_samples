
package gui;
import javax.swing.JOptionPane;


public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String fn= JOptionPane.showInputDialog("enter the first number");
        String sn= JOptionPane.showInputDialog("enter the second number");
        
        int num1= Integer.parseInt(fn);
        int num2= Integer.parseInt(sn);
        int sum= num1+num2;
        
        JOptionPane.showMessageDialog(null, "the sum is "+sum, "the title", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
