
package transactions;

import java.text.NumberFormat;


public class Transactions {

    public static void main(String[] args) {
        
        Accounts acct1 = new Accounts("Jack",65895267,50);
        Accounts acct2 = new Accounts("Harry",58963254,100);
        Accounts acct3 = new Accounts("Tori",98756445,200);
        
        acct1.deposit(25.10); //return balance value ignored, not print out
        double harryBalance = acct2.deposit(30.25);
        System.out.println("Harry's balance after deposit 30.25 is "+harryBalance);
        harryBalance = acct2.withdraw(10, -1.50);
        System.out.println("Harry's balance after withdraw 10 plus fee of -1.50 is "+harryBalance);
        
        acct1.addInterest();
        System.out.println("Jack's account details are "+acct1);
        
        
    }
    
}
