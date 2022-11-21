
package parametertest;


public class ParameterTest {

    /**
     passing parameters from constructor
     */
    public static void main(String[] args) {
        
        int a = 10;               //a is a primitive data type: integer with origianl value as 10
        Num b = new Num(20);      //b is an object(Num class), and its variable(value) is set originally as 20
        Num c = new Num(30);      //c is an object(Num class), and its variable(value) is set originally as 30
        
        ParameterModifier pmObj = new ParameterModifier();  //this construcor is not written in its class, so by default it has no effect on the object, it is created because we need an object to invoke its non-static meathod: changValue()
        
        System.out.println();
        System.out.println("\"Before calling changeValue method:\", variables a(primitive data type,integer), b and c (Num Class type, objects) declared original values are: " + a +"\t" +b +"\t" +c+"\n");
        
        pmObj.changeValue(a, b, c);   //pass in parameter as a(int),b(obj),c(obj).  (object b's private variable value==20 is passed to formal parameter p2) (object c's private variable value==30 is passed to formal parameter p3)
        
        System.out.println("@@@@@@@back to main method @@@@@ test on variable a,b,c after passed into changeValue method@@@@@@");
        System.out.println("After a ParameterModifier Class object(pmObj) used a,b,c as its actual parameters to invoke its changeValue(primitive1,p2,p3) method, and changed its formal parameters(primitive1,p2,p3)'s value\nwithin the method, now we check a,b,c's value after pmObj.changeValue(p1,p2,p3) is returned to the main program method:");
        System.out.println("Now, the actual parameter a is "+a+ ";   The value of a is not changed");
        System.out.println("Now, the actual parameter b is "+b+ ";  The value contained by object b is changed. However, object b's reference address is not changed. Another Class ParameterModifier's object(pmObj)'s method changeValue() used b as its pass-in actual parameter," + 
                            "\n                                     and b is an object and was reset/given a new value==888 contained in b's internal variable 'value', <b.setValue(888)> therefore, b object's contained value is changed to 888");
        System.out.println("Now, the actual parameter c is "+c+ ";   The value contained by object c is not changed. object c is passed into changeValue() method as a actual parameter, however, the formal parameter(p3) refers to another new Num class object, so that change has no effect on object c.  ");
    }
    
}
