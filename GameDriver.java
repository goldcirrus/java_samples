public class GameDriver {

    public static void main(String[] args) {
        
        Grid plane = new Grid();
        
        plane.goPlay();
        
        while(plane.goPlay())
        {
              plane.goPlay();
        
        }
        
        
    }
}
