public class IPhone extends SmartPhones {

    private String brand;

    public String getBrand() {
        System.out.println("getBrand() in IPhone class");
        return "Iphone Brand";
    }
    
    
    @Override
    public double getPrice() {
        System.out.println("getPrice() in IPhone Class - overriden getPrice() method in Electronics,Phone,SmartPhones");
        return 10.1;
    }
}
