
package variableparameters;


public class VariableParameters {

   
    public static void main(String[] args) {
        
        Family f1=new Family("jack","mary","tony");
        Family f2=new Family("abc","efg","lnm", "kls","edg");
        
        System.out.println(f1);
        System.out.println(f2);
    }
    
}
