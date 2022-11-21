/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createobjectdemo;

// define Points and Rectangles, and their constructors and methods
public class CreateObjectDemo {
    
        public class Point {
        public int x = 0 ;
        public int y = 0 ;
        
        //construcotr to create a point
        public Point(int a,int b) {
            x= a;
            y= b;
        }
    }
    
        public class Rectangle {
        public int width = 0;
        public int height = 0;
        public Point origin; //declare a variable of type Point
        
        //four constructors to create Rectanger objects
        public Rectangle() {
            origin = new Point(0,0); //call Point constructor to create a point object
        }
        
        public Rectangle(Point P) {
            origin = P;                             
        }
        
        public Rectangle (int w, int h) {
            origin = new Point(0,0);
            width = w;
            height =h;
        }
        
        public Rectangle(Point P, int w, int h) {
            origin = P;
            width = w;
            height = h;
        }
        
        //a method to move the rectangle
        public void move(int x, int y) {
            origin.x = x;
            origin.y = y;            
        }    
         //a method to compute the area of the rectangle
        public int getArea() {
            return width*height;
        }
   
    }
    

    
    
  public static void main (String[] args) {
      //create nest class objects
      CreateObjectDemo temp = new CreateObjectDemo();
      CreateObjectDemo.Point originOne = temp.new Point(23,94);
      CreateObjectDemo.Rectangle rectOne = temp.new Rectangle(originOne,100,200);
      CreateObjectDemo.Rectangle rectTwo = temp.new Rectangle (50,100);
      
    //display rectOne's width,height and area
    System.out.println("width of rectOne: "+ rectOne.width);
    System.out.println("height of rectOne "+ rectOne.height);
    System.out.println("area of rectOne "+ rectOne.getArea());
    
    //set rectTwo's position
    rectTwo.origin = originOne;
    
    //move rectTwo's position to (40,72)
    rectTwo.move(40,72);
    
    
    //display rectTwo's position
    System.out.println("rectTwo's X position "+ rectTwo.origin.x);
    System.out.println("rectTwo's Y position "+ rectTwo.origin.y );
    
    
    
    
      
  }
  
}