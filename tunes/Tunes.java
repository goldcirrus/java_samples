
package tunes;

public class Tunes {    
    public static void main(String[] args) {
                                                    //call CDcollection Class constructor to create a new object
        CDcollection music = new CDcollection();       //CDcollection object music has an array variable(object's variable) which contains a list of CD objects.
        
        music.addCD("Wind up", "Tayler Swift", 2.35, 8);
        music.addCD("A Love Song", "Tony", 8.69, 7);
        music.addCD("Let's Sing", "Bob", 1.36, 3);
        music.addCD("A good Song", "Tobby", 5.23, 5);
        music.addCD("Song Song Song", "Ria Oia", 3.69, 6);
        music.addCD("No.6 Song", "Jarry", 8.36, 5);
        
        System.out.println(music);
    }
    
}
