
package slogancounter;


public class SloganCounter {

    
    public static void main(String[] args) {
        
        Slogan object;
        
        object = new Slogan("one s stt fdte");
        object = new Slogan("two ssre sdffer");
        System.out.println(object);
        System.out.println(object.toString());
        System.out.println(Slogan.getCount()); //getCount is static method, so it is invoked by its Class Name, not a Object. Don't use object.getCount()
    
    }
    
}
