/** 
 * Class that demonstrates the use of the instanceof keyword
 */
public class Hospital {

    /** Lets treat each of the patients */
    public void treats(Patient p) 
    {
        /** The Patient class has a get_name() method so we can print out the names of every patient. The other
         * patient classes inherit this method.
         */
        System.out.println("Hospital is treating patient " + p.get_name() );
        
        /** Variable p is of type Patient. We use the instanceof keyword to see exactly what type of object p was created
         * as and print out the appropriate Doctor and treatment for that patient
         */
        if ( p instanceof BrainInjuryVictim == true )
        {
            System.out.println("Brain injury - calling Dr. Neurologist.");
            System.out.println("Prep. for brain scan.");
        }
        
        else if ( p instanceof CancerSurvivor == true )
        {
            System.out.println("Cancer Survivor - calling Dr. Oncologist.");
            System.out.println("Take blood tests for white blood cell counts");
        }
        
        else if ( p instanceof CancerVictim == true )
        {
            System.out.println("Cancer Victim - calling Dr. Oncologists.");
            System.out.println("Prepare patient for chemotherapy");
        }
    
        else if ( p instanceof HeartAttackVictim == true )
        {
            System.out.println("Heart attack patient - calling Dr. Cardiologist.");
            System.out.println("Prescribing drugs like Aspirin");
        }
    
        /** Hospital doesn't treat animals so we call the Vet */
        else if ( p instanceof AnimalPatient == true )
        {
            System.out.println("calling Dr. Veterinarian.");
            
            /** We want to call the "call_vet" method of this animal object *BUT* because this variable p is of type
             * Patient whose visibility does not have access to the "call_vet" method we need to do a downcast first 
             */
            AnimalPatient animal = (AnimalPatient) p;
            animal.call_vet();
        }
        else
        {
            System.out.println("General Admission Patient - calling Dr. Family Doctor (General Practioner).");
        }   
        
        System.out.println();
    }
}
