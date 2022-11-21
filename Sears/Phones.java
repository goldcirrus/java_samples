public class Phones extends Electronics {

    private String color;

    public String getColor() {
        System.out.println("getColor() in Phones class");
        return "color in Phones class.";
    }
    
    @Override
    public double getPrice() {
        System.out.println("getPrice() in Phones Class - override Electronics getPrice()");
        return 10.1;
    }
    
}
