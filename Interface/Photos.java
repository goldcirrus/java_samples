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
 *
 * @author t00224182
 */
public class Photos {
    
    private String picName;
    private Image img;
    
    private int imgX=200;
    private int imgY=200;
    
    private double scaleX=1.0;
    private double scaleY=1.0;
    
    /**Constructor to create a new Photo object according to a title string passed in, 
     * and take a right .png picture in the given URL location by switch condition based on passed in string name, and store this .png image in class variable(img). */
    public Photos(String title)
    {
        picName = title;
        
        switch(picName)
        { 
            case"Verona Table":
            {   URL imgUrl = Photos.class.getResource("images/verona_table.jpg");  
                ImageIcon imgIcon = new ImageIcon(imgUrl);    
                img = imgIcon.getImage(); //type of image: Image type declared above, so it is class variale
                
            } break;                        //store this imgIcon object in Image variable: ashleyTable
            
            case"Libby Table":
            {    URL imgUrl = Photos.class.getResource("images/libby.png");
                 ImageIcon imgIcon = new ImageIcon(imgUrl);
                 img = imgIcon.getImage();
            } break;
            
            case"Red Chair":
            {    URL imgUrl = Photos.class.getResource("images/trans_chair.png");
                 ImageIcon imgIcon = new ImageIcon(imgUrl);
                 img = imgIcon.getImage();
            } break;
            
            case"Living Room":
            {    URL imgUrl = Photos.class.getResource("images/room3.jpg");
                 ImageIcon imgIcon = new ImageIcon(imgUrl);
                 img = imgIcon.getImage();
            } break;
            
            case"Movie Room":
            {    URL imgUrl = Photos.class.getResource("images/room1.jpg");
                 ImageIcon imgIcon = new ImageIcon(imgUrl);
                 img = imgIcon.getImage();
            } break;
            
            case"Sofa Black":
            {    URL imgUrl = Photos.class.getResource("images/sofa1.png");
                 ImageIcon imgIcon = new ImageIcon(imgUrl);
                 img = imgIcon.getImage();
            } break;
            
             case"Black Chair":
            {    URL imgUrl = Photos.class.getResource("images/black_chair.png");
                 ImageIcon imgIcon = new ImageIcon(imgUrl);
                 img = imgIcon.getImage();
            } break;
            
            case"Dresser":
            {    URL imgUrl = Photos.class.getResource("images/dresser.png");
                 ImageIcon imgIcon = new ImageIcon(imgUrl);
                 img = imgIcon.getImage();
            } break;
            
        }                                  
    } 
    
    /**Method to display the photo stored in img variable with scaling and flip features. It is called in Frame Class by redraw method.  */
    public void displayPhoto(Graphics g)
    {
         g.drawImage(img,imgX,imgY, (int)(scaleX*img.getWidth(null)), (int)(scaleY*img.getHeight(null)), null);
    }       //display img in location of (imgX,imgY), with size of .getWidth .getHeight
            //scaling by *scaleX and *scaleY for img size width and height
    
    
    /**Method to change the value of imgX (x-coordinate of picture).   */
    public void setImgX(int coorX)
    {
         imgX=coorX;
    }
    
    /**Method to change the value of imgY(y-coordinate of picture).  */
    public void setImgY(int coorY)
    {
         imgY=coorY;
    }
    
    public void setScaleX(double x)
    {
         scaleX = x;
    }
    
     public void setScaleY(double y)
    {
         scaleY = y;
    }
     
     public double getScaleX()
     {
         return scaleX;
     }
     
     public double getScaleY()
     {
         return scaleY;
     }
    
    
     
     
     
     
    
    public String getName()
    {
        return picName;
    }
    
}
