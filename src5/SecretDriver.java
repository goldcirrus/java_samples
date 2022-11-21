public class SecretDriver {

    public static void main(String[] args) {
        
        Secret m1 = new Secret("You are such a good person");
        System.out.println(m1);
        
        m1.encrypt();
        System.out.println(m1);
        
        m1.decrypt();
        System.out.println(m1);
    }
}
