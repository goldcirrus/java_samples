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
    
    /**Constructor to create a new Photo object */
    public Photos(String title)
    {
        picName = title;
    }
    
    public String getName()
    {
        return picName;
    }
    
}
