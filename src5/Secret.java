import java.util.Random;


public class Secret implements Encryptable {

    private String message;

    private int shift;

    private boolean encrypted;
    
    private Random rand;
    
    //constructor: store the original message and establish a value for the encryption shift
    public Secret (String msg)           //constructor to pass in msg as the content of message
    {
         message = msg;
         encrypted = false;
         rand = new Random();
         shift = rand.nextInt(10)+5;
    }
    
    //write the method encrypt() for interface Encryptable to encrypt this message with a Caesar cipher
    @Override
    public void encrypt(){
        if(!encrypted)
        {
            String masked="";
            for(int index=0; index<message.length(); index++)
                masked = masked + (char)(message.charAt(index)+shift);
                                         //shift message characters by the number of shift 
            message = masked;            //encrypted message string
            encrypted = true;
        }       
    }
    
    //write the method decrypt() for interface Encryptable to decrypt the encrypted message, if it is encrypted
    @Override
    public String decrypt(){
        if(encrypted)
        {
            String unmasked="";
            for(int index=0; index<message.length(); index++)
                unmasked = unmasked + (char)(message.charAt(index)-shift);
            
            message= unmasked;
            encrypted= false;
        }
        
        return message;
    }


    public boolean isEncrypted() {
        return encrypted;
    }

    public String toString() {
        return message;
    }
}
