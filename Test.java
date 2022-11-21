
package test;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Random;

public class Test {

    enum Season  {winter,summer}
   
    public static void main(String[] args) {
       
        
      String value="-12.3-65895";
      int index = value.indexOf("-");
      value = value.substring(1);
      System.out.println(value);
      
      
        
    }
    
    
    
    
    
    
    public static void switchP()
    {
           char letter='o';
           
           switch(letter)
           {
                case'a':
                case'e':
                case'i':
                case'o':
                case'u':
                    System.out.println("it is a vowel.");
                    break;
                default:
                    System.out.println("It is not a vowel.");
           
           
           }
    
    }
    
    public static void randNum()
    {
         Random rand= new Random();     //Random() constructor's 括号内没有东西
         int index = rand.nextInt(5);   //call .nextInt(num)  来限制范围
         System.out.println(index);
    }
   
    public static void parseInt()
    {
         String c="23";  //23 is a string
         
         int combine;
         
         combine=Integer.parseInt(c);           //convert string23 to integer23
         combine=combine+4;            //23+4=27
         
         System.out.println(combine);
    }
    
    
    
    public static String minMax()
    {
         System.out.println("How many values:");
         Scanner scan = new Scanner(System.in);
         int nTimes= scan.nextInt();
                             //ask for first value
         System.out.println("please enter a value: ");
         int val1=scan.nextInt();
                             //ask for the rest of values
         int min=0, max=0;
         for(int i=1; i<nTimes; i++)
         {
              System.out.println("please enter a value:");
              int val=scan.nextInt();
              
              max=Integer.max(val1, val);
              min=Math.min(val1, val);
              
         }
         
         
         System.out.println("Max is"+max+"  Min is "+min);
         String str="Max is"+max+ " Min is "+min;
         return str;
    }
    
    
    
    
    public static void drawAstericks()
    {
          for(int row=1; row<=5; row++)
          {
               for(int col=1; col<=row; col++)
               {
                  System.out.print("**");
               
               }
               
               System.out.println();
          }
    
    }
    
    
    
    public static int largestNum(int firstNum, int...nums)
    {
          int maxNum=firstNum;
          
          for(int x: nums)
              maxNum = Integer.max(x, firstNum);   // if( x>maxNum )
                                                   //    maxNum = x;
          
          return maxNum;
                  
    }
            
    
    public static int maxNum(int... nums)
    {
          int maxNum=0;                        //doesn't work if only pass in one integer type parameter
          
          for(int i=0; i<nums.length-1; i++)
          { 
              System.out.println("nums[i]: "+nums[i]);
              System.out.println("nums[i+1]: "+nums[i+1]);
              maxNum = Integer.max(nums[i], nums[i+1]);
          }
          return maxNum;
        
    }
    
    
    
    
    public static void add(int[] x)
    {
         for(int counter=0; counter<x.length; counter++)
         {
               x[counter]= (counter+1)*5;
         }
    }
    
    
    
    public static int[] getEvenArray(int[] numbers)
    {
         int count=0;                           //1. get size of evenArray
         for(int element: numbers)
         {
              if(element%2==0)
                  count++;
         }
         
         int[] evenArray = new int[count];      //2. initialize the new evenArray
         
         int j=0;                               //3. assign even number in old array(numbers) to new evenArray
         for(int element: numbers)
         {   if(element%2==0)
             {
                evenArray[j]=element;
                j++;
             }
         }
         
         return evenArray;
    }
    
    
    
    public static int multiply(int i, int j)      //recursion method
    {
         int result;
         
         if(j==1)
             result=i;
         else
             result=i+multiply(i,j-1);
         
         return result;
    }
    
    
    public static int sum(int n1, int n2)
    {
          int result;
          
          if(n1==n2)
              result=n1;
          else
              result= n1+sum(n1+1,n2); 
          
          return result;
    }
    
    
    public static int sumMidWay(int n1, int n2)
    {
          int result;
          
          if(n1==n2)
              result=n1;
          else
          {
              int mid= (n1+n2)/2;
              result= sumMidWay(n1,mid)+sumMidWay(mid+1,n2);   //recursion: mid+1
          }
          
          return result;
    }
    
    
}
