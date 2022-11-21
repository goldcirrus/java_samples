public class DriverClass {

    
    
    public static void main(String[] args) {
        
        System.out.println("Create a IPhone object with visibility in Electronics Class level:");
        Electronics xpE = new IPhone();
        xpE.getPrice();                    //object xpE only reach method in Electronics Class level
        System.out.println("object is declared as Electronics, object is new IPhone()");
        System.out.println("xpE="+xpE);
        
        
        
        System.out.println("\n"+ "cast IPhone object's visibility to Phones Class level:");
        Phones xpP = (Phones) xpE;          //new object name xpP is used, but it still point to the same object initially created
        xpP.getColor();                    //as xpE, different name and visibility, and the same object referenced
        xpP.getPrice();
        System.out.println("xpE="+xpE +"  xpP="+xpP);
        
        System.out.println("\n"+"cast IPhone object's visibility to SmartPhones Class level:");
        SmartPhones xpS = (SmartPhones) xpP;   //downcast, same object, different reference name: xpS v.s. xpP,xpE
        xpS.getMemorySize();
        xpS.getColor();
        xpS.getPrice();
        System.out.println("xpS="+xpS +"  xpP="+xpP +"  xpE="+xpE);
        
        System.out.println("\n"+"cast IPhone object's visibility to IPhone level:");
        IPhone xpI = (IPhone) xpS;   //downcast, same object, different reference name.
        xpI.getBrand();
        xpI.getMemorySize();
        xpI.getColor();
        xpI.getPrice();
        System.out.println("xpI="+xpI +"  xpS="+xpS +"  xpP="+xpP +"  xpE="+xpE +"   Iphone SmartPhone Phone Electronics");
        
        
    }
}
