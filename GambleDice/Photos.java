import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The Photos class is the images which can be displayed on jPanel by redraw() method built in AnonInnerClass when jPanel constructor is called to create a new jPanel. 
 * @author Kevin
 */


public class Photos {
    
    private int rollNumber;
    private Image img;
    
    private int imageWidth = 120;  
    private int imageHeight = 120; 
    
    /**Constructor to create Photos object with the right image according to the int value passed in. */
    public Photos(int rollX)
    {
        rollNumber=rollX;
        
        switch(rollNumber)      //assign pictures in images folder to Photos Class variable: img
        {
            case 1: {
                 URL imgUrl = Photos.class.getResource("images/1.png");  
                 ImageIcon imgIcon = new ImageIcon(imgUrl);    
                 img = imgIcon.getImage(); //type of image: Image type declared above, so it is class variale
            }   break;
            
            case 2: {
                 URL imgUrl = Photos.class.getResource("images/2.png");  
                 ImageIcon imgIcon = new ImageIcon(imgUrl);    
                 img = imgIcon.getImage(); //type of image: Image type declared above, so it is class variale
            }   break;
            
            case 3: {
                 URL imgUrl = Photos.class.getResource("images/3.png");  
                 ImageIcon imgIcon = new ImageIcon(imgUrl);    
                 img = imgIcon.getImage(); //type of image: Image type declared above, so it is class variale
            }   break;
            
            case 4: {
                 URL imgUrl = Photos.class.getResource("images/4.png");  
                 ImageIcon imgIcon = new ImageIcon(imgUrl);    
                 img = imgIcon.getImage(); //type of image: Image type declared above, so it is class variale
            }   break;
            
            case 5: {
                 URL imgUrl = Photos.class.getResource("images/5.png");  
                 ImageIcon imgIcon = new ImageIcon(imgUrl);    
                 img = imgIcon.getImage(); //type of image: Image type declared above, so it is class variale
            }   break;
            
            case 6: {
                 URL imgUrl = Photos.class.getResource("images/6.png");  
                 ImageIcon imgIcon = new ImageIcon(imgUrl);    
                 img = imgIcon.getImage(); //type of image: Image type declared above, so it is class variale
            }   break;
            
            case 0: {
                 URL imgUrl = Photos.class.getResource("images/winner.jpg");  
                 ImageIcon imgIcon = new ImageIcon(imgUrl);    
                 img = imgIcon.getImage(); //type of image: Image type declared above, so it is class variale
            }   break;
            
        }
        
        System.out.println("create an Photo object");
    
    }
    
    /**Method to display the photo stored in img variable by a Graphics object which can be found on jPanel's redraw method. 
     * It is called in the main Frame Class by redraw method to add Photos object's img picture on the jPanel.  */
    public void displayMyPhoto(Graphics g,int coorX, int coorY)
    {
           
        g.drawImage(img,coorX,coorY, imageWidth, imageHeight, null);
    }       //display img in location of (imgX,imgY), with size of .getWidth .getHeight
            //scaling by *scaleX and *scaleY for img size width and height
    
    /**Method to display the photo stored in img variable by a Graphics object which can be found on jPanel's redraw method. It is called in the main Frame Class by redraw method.  */
    public void displayComPhoto(Graphics g, int coorX, int coorY)  //Graphics g on com_jPanel to draw on com_jPanel
    {
          g.drawImage(img,coorX,coorY, imageWidth, imageHeight, null);
    }       //display img in location of (imgX,imgY), with size of .getWidth .getHeight
            //scaling by *scaleX and *scaleY for img size width and height
    
}
