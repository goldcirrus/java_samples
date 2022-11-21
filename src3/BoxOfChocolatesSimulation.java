import java.util.Random;

/**the class to create the two dimensional grid which contains the 8 different chocolates objects. */
public class BoxOfChocolatesSimulation {
    
    Random rand = new Random();
    
    /**declare 8 different objects in the same OurTreats Type. Those objects have visibility upto OurTreats level. 
     *Abstract method is created in OurTreats class to enable those objects to use their own version of methods(defined in different levels) to print out different numbers.*/
    OurTreats aX = new PlainCandyApple();
    OurTreats bX = new PlainCaramelApple();
    
    OurTreats cX = new PeanutCluster();
    OurTreats dX = new GingerCluster();
    
    OurTreats eX = new ChocolateButterCream();
    OurTreats fX = new CocoLocoCream();
    
    OurTreats gX = new CashewBrittle();
    OurTreats hX = new ChilliGarlicPeanutBrittle();
    /**OurTreats objects are created from different root level.    */
    
    
   // OurTreats aY = new ApplesTreat();
   // OurTreats bY = new BrittleTreat();
   // OurTreats cY = new CreamsTreat();
   // OurTreats dY = new ClustersTreat();
    
    
   int row;
   int col;        
   int[][]  box = new int[10][10];
   OurTreats [][] chocoBox= new OurTreats[10][10];   //contains declared OurTreats objects created in lower level
   
  
    
   /**constructor to create a object(box/grid of 10x10) contains random integers from 0 to 7. An intermediate method to create random chocolates. */
   public BoxOfChocolatesSimulation() {
       
       for(row=0; row<box.length; row++)
       {     for(col=0; col<box[row].length; col++)
                box[row][col]= rand.nextInt(8);
       }
}
   
    
    
    /**method to display the box/grid contents which are random integers from 0 to 7. 
     * For testing purpose only, not used to display chocolates. */
    public void displayBox() 
    {    
         System.out.println("   A B C D E F G H I J ");
        
         for(row=0; row<box.length; row++)
         {      System.out.print((char)(row+65) + "| ");
               for(col=0; col<box[row].length; col++)
               {   
                   System.out.print(box[row][col]+" ");
               }
               System.out.println();
         }
    }
    
    /**method to set up chocoBox array with OurTreats objects according to box array content values and 
     * display OurTreats objects as integers numbers by calling different versions of toString() and print methods.
     * abstract methods in OurTreats class and class below it are required because the chocolate objects are declared at OurTreats level.*/
    public void start() {  
                             /**replace box/grid's random integer numbers in the box with chocolate objects. */
        for(row=0; row<box.length; row++)
        {
             for(col=0; col<box[row].length; col++)
             {
                  switch( box[row][col] )             //add OurTreats objects created in different 
                  {
                      case 1: chocoBox[row][col] = aX;
                               break;
                      case 2:chocoBox[row][col] = bX;
                               break;
                      case 3:chocoBox[row][col] = cX;
                               break;
                      case 4:chocoBox[row][col] = dX;
                               break;
                      case 5:chocoBox[row][col] = eX;
                               break;         
                      case 6:chocoBox[row][col] = fX;
                               break;         
                      case 7:chocoBox[row][col] = gX;
                               break;         
                      case 0:chocoBox[row][col] = hX;
                               break;        
                  }
             }
        }
        
        displayChocoBox();
        
        displayT4Box();
        
        displayT2Box();
        
        displayT2Nut();
    }
    
    /**method to retrieve chocoBox array elements by their row column positions.
     * @param row
     * @param col
     * @return chocoBox elements as OurTreats objects */
    public OurTreats getChocoBox(int row, int col)
    {
           return chocoBox[row][col];
    }
    
    /**method to display the chocolate box contains Treats Objects as integer numbers (strings) to represent all 8 types of chocolates. 
     toString() is defined/used version at 8 candies level(lowest level is used for inheritance). */
    public void displayChocoBox() 
    {    System.out.println("The first box contains 8 types of chocolates. ");
         System.out.println("   A B C D E F G H I J ");
        
         for(row=0; row<chocoBox.length; row++)
         {     System.out.print((char)(row+65) + "| ");
         
               for(col=0; col<chocoBox[row].length; col++)
               {   
                   System.out.print(chocoBox[row][col]+" ");     //toString() method is called here automatically, eventhough toString() is not written here. 
               }                                                 //toString() method is defined at level 2nd to the bottom level(interface) which are the root object decides wich version of toString is used. 
               System.out.println();
         
         }
    }
    
    
    /**method to display the box as 4 types of Treats.
     final printMe() is defined/used version at 4 Treats level(lowest level version is used for inheritance). */
    public void displayT4Box() 
    {    System.out.println("\n"+"The second box to show 4 types of Treats. ");
         System.out.println("   A B C D E F G H I J ");
        
         for(row=0; row<chocoBox.length; row++)
         {     System.out.print((char)(row+65) + "| ");
         
               for(col=0; col<chocoBox[row].length; col++)
               {                                                          //chocoBox[row][col] contains the OurTreats objects created from different root level.
                   System.out.print(chocoBox[row][col].printMe()+" ");  //depending on the OurTreats objects are created from which root, 4 different version of printMe() is called here.
               }
               System.out.println();
         
         }
    }
    
    
    /**method to display the chocoBox contents as 2 types of Made. 
     print2Made() is defined/used version at 2 KettleMade and Chocolates level(lowest level version is used for inheritance).*/
    public void displayT2Box() 
    {    System.out.println("\n"+"The third box to show 2 types of Made. ");
         System.out.println("   A B C D E F G H I J ");
        
         for(row=0; row<chocoBox.length; row++)
         {     System.out.print((char)(row+65) + "| ");
         
               for(col=0; col<chocoBox[row].length; col++)
               {   
                   System.out.print(chocoBox[row][col].print2Made()+" ");  //depending on the OurTreats objects created from which root, different 2 print2Made() version is called here. 
               }
               System.out.println();
         
         }
    }
    
    /**method to display whether it contains peanuts or not.
     interface printNut() is defined in 8 different candy class level which implements this interface.(interface method is defined by the class who implements it)*/
    public void displayT2Nut() 
    {    System.out.println("\n"+"The fourth box to show 0 does not contain peanuts and 1 contains peanuts. ");
         System.out.println("   A B C D E F G H I J ");
        
         for(row=0; row<chocoBox.length; row++)
         {     System.out.print((char)(row+65) + "| ");
         
               for(col=0; col<chocoBox[row].length; col++)
               {   
                   System.out.print(chocoBox[row][col].printNut()+" ");      //printNut() print: 1 for containing peanut, 0 no peanut
               }                                        //depending on the OurTreats objects created from which root, 2 different printNut() version is called.
               System.out.println();
         
         }
    }
    
    
    
}

