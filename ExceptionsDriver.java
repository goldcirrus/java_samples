
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcuzzola
 */
public class ExceptionsDriver {
    
    public static void main(String[] args) throws IOException
    {
        
        ErrorsInMyCode examples = new ErrorsInMyCode();
        
        
        //examples.array_index_problem();
        //examples.divide_by_zero();
        // examples.wrong_cast();
        // examples.null_pointer();
        
        //examples.two_problems();
        //examples.two_problems_ex1();
        //examples.two_problems_ex2();
        //examples.two_problems_ex3();
        //examples.two_problems_ex4();
        
        //examples.step1();
        

        
         examples.file_problem();
        
        //   examples.call_file_problem();
        
        System.out.println("all good. Program running normally.");
        
    }
    
}
