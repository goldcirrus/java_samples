
package transactions;
import java.text.NumberFormat;

public class Accounts {
    
    private final double RATE=0.035;
    private String name;
    private long acctNumber;
    private double balance;
    
    
    //constructor for an account object, to assign instance data value to object variables
    public Accounts (String owner, long account, double initial)
    {
       name = owner;
       acctNumber = account;
       balance = initial;
    }
    
    //balance setter method called deposit to change balance, and return the balance value
    public double deposit (double amount)
    {
         if (amount>0)
             balance = balance + amount;
         return balance;
    }
  
    //withdraw the money form the account
    public double withdraw(double amount, double fee)
    {
         if (amount>0 && fee>0 && (amount+fee)<balance)
             balance = balance - (amount+fee);
         return balance;
    }
    
    //add interest to balance
    public double addInterest()
    {
         balance = balance*(1+RATE);   
         return balance;
    }
    
    //get balance: return balance value
    public double getBalance()
    {
        return balance;
    }
    
    //return the account details as a string
    @Override
    public String toString()    //return a string of "account number, name and balance"
    {                           //when a object called this method as object1.toString(): the account number, name, balance is provided as a series of string 
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber +"\t"+ name +"\t"+ fmt.format(balance);
        
    }
    
}
