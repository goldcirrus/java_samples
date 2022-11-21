/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This program create two dogs with their name and what they say. 
 * @author Liang Zhong
 */
public class DogProjectMain {

    /**Program creates two dogs, assigns what they say, and print out their name and what they say.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dogs dog1= new Dogs("spot");
        Dogs dog2= new Dogs("scruffy");
        
        dog1.setSays("Ruff!");
        dog2.setSays("Wurf!");
        
        System.out.println("Dog "+dog1.getName()+" says "+dog1.getSays());
        System.out.println("Dog "+dog2.getName()+" says "+dog2.getSays());
    }
    
}
