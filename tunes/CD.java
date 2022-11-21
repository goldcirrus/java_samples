
package tunes;
import java.text.NumberFormat;
import java.util.Locale;

public class CD {
    
    private String title;
    private String artist;
    private double cost;
    private int tracks;
                                                     //create a CD object with relative information
    public CD(String name, String singer, double price, int numTrack)  //CD constructor
    {     
           this.title=name;
           this.artist=singer;
           this.cost=price;
           this.tracks=numTrack;
    }
    
    @Override
    public String toString()   //String called for CD object
    {      
           NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.CANADA);
           String cdString = fmt.format(cost) + "  " + tracks+ "  " + title + "  " + artist;
           return cdString;
    }
    
    
}
