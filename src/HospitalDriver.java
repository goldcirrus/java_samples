/***
 * Sample program demonstrating instanceof, (up/down)casting, and visibility
 */
public class HospitalDriver {

    public static void main(String[] args) 
    {
        /** Lets create a hospital object */
        Hospital hosp = new Hospital();
        
        /** Lets create the five different types of hospital patients */
        BrainInjuryVictim patient1 = new BrainInjuryVictim("Mike");
        CancerSurvivor patient2 = new CancerSurvivor("Jane");
        CancerVictim patient3 = new CancerVictim("Shane");
        HeartAttackVictim patient4 = new HeartAttackVictim("Bill");
        Dog patient5 = new Dog("spot");
        
        /** Now lets treat each of the patients at the hospital. Note that the treats method
         * is defined as treats(Patient p) so Java automatically does an upcast from each of the
         * five hospital patients to visibility/type of Patients.
         */
        hosp.treats( patient1 );
        hosp.treats( patient2 );
        hosp.treats( patient3 );
        hosp.treats( patient4 );
        hosp.treats( patient5 );
    }
}
