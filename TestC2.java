package testc2;
import java.util.Scanner;

public class TestC2 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("We believe that you are such a great person" + 
                " and your wife is a teacher in KKK."+12 +"\n" );
        
        System.out.println("Jack is a young man in 1981 movie and 2007 TV shows which can be avoided as a successful business model.");
        
        System.out.println("string concatenation example: "+ 96+4);
        System.out.println(96+4+" String concatenation example:");
        System.out.println("String concatenation example: "+ (96+4));
        
        //from left to right for concatenation precedence
        System.out.println( "the other nick name as \'JJJ\' down the street\n\ttoday"
                                       +"kkk");
        
        //Scanner Class practice
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the new string on the next line:");
        
        String message1 = scan.next();   //take a token, which is characters delimited by space, tab, another line
        String message2 = scan.next();
        String message3 = scan.next();
        
        
        System.out.println("you entered the message1 as: "+ "\""+ message1 +"\"");
        System.out.println("you entered the message2 as: " + "\"" + message2 + "\"");
        System.out.println("you entered the message3 as: "+"\""+message3+"\"");
        
        char x=message3.charAt(2);
        System.out.println((char)(x+5));
        
        
        
    }
   
}
