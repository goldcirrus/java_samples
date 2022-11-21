public class AnimalPatient extends Patient {

    public AnimalPatient(String name) 
    {
        super(name);
    }

    public void call_vet() 
    {
        System.out.println("Calling veterinarian clinic: Phone# 1-800-377-BARK");
    }
}
