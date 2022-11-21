public class KettleMade extends OurTreats {
    
    /*child level of the same name abstract method. A child class must define its parent's abstract method. 
     *However, the real use is for the grandchild class(defined at 4 Treats level). So, simply return empty string here.  
     *method is to print numeric value for 4 types of treats. */
    @Override
    public String printMe(){
       return "";
    }
    
    /**child level of the same name abstract method to return string "0" for this class object. it is need here.
     * @return String "0" */
    @Override
    public String print2Made()
    {
       return "0";
    }
    
    /*child level of the same name abstract method. A child class must define its parent's abstract method. 
     *However, the real use is for the grandchild class. So, simply return empty string here.
     *method is used at 8 different chocolate objects.*/
    @Override
    public String printNut()
    {
       return "";
    }
    
}
