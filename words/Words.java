
package words;


public class Words {

    
    public static void main(String[] args) {
        
        Dictionary webster = new Dictionary();     //Dictionary inherits Book Class, so Dictionary objects can use both Class variables and methods
        
        System.out.println ("Number of pages: " + webster.getPages());    
        System.out.println ("Number of definitions: " + webster.getDefinitions());
        System.out.println ("Definitions per page: " + webster.computeRatio());
        
        
    }
    
}
