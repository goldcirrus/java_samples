
package hanoitower;


public class Towers {
    
    private int totalDisk;            // local private variable for constructor
    
    public Towers(int x)             //constructor to create a Tower Class object which has local variable(totalDisk) set with its parameter's value
    {
         totalDisk=x;
    }
    
    private void moveOneDisk(int x, int y)
    {
       System.out.println("Move one disk from position " + x + " to position " +y);
    }
    
    public void solve()     //recursion method moveTower is a private local method, it can not be called by outside world, so public method solve is used to call it
    {
       move(totalDisk,1,3,2);
    }
    
                     
    private void move(int diskNumX, int start, int end, int temp )    //solve passed in parameter value is (diskNumX==constructor set(totalDisk),start==1,end==3,temp==2)
    {                // formal parameter    start=1,   end=3,    temp=2    as passed in parameter values by solve()
              
           if (diskNumX == 1)
            moveOneDisk(start,end);         //if(diskNumX==1), start==1,end==3 will be print out
                       
           else
           {                   //=1,    =2,   =3    are passed in formal parameter's values
               move(diskNumX-1, start, temp, end );  //slove passsed in parameter: (diskNumX==diskTotal-1,start=1,temp==3,end==2)
            //new diskNum=diskNum-1,new start=1,new end=2,new temp=3
          //moveTower(new diskNumX,new-start,new-end,new-temp)
          
                                      //moveOneDisk use parameter 
               moveOneDisk(start,end);      //as start and end value changes, the moveOneDisk() print out different values for start and end
                             
                                    //1,  3,   2
               move(diskNumX-1,temp,end,start);    //recursive again, call its own method
           }
               
   
    }
    
    
}
