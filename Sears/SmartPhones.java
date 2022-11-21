public class SmartPhones extends Phones {

    private int memorySize;

    public int getMemorySize() {
        System.out.println("getMemorySize() in SmartPhones class");
        return 32;
    }
    
    @Override
    public double getPrice() {
        System.out.println("getPrice() in SmartPhone Class override higher level -Electronics,Phone Class same name method");
        return 10.1;
    }
    
}
