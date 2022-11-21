/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

public class Circle {
    //declare Circle's fields
    int coordinateX = 0;
    int coordinateY = 0;
    
    //constructor to create a new circle object
    public Circle (int corX, int corY) {
        coordinateX = corX;
        coordinateY = corY;
    }

    //method to change an Circle object's coordinate value
    public void moveCircle ( Circle circleObj,int deltaX,int deltaY ) {
        //parameter circleObj - passed in by a object, the change persist after the execution of the method is called.
        //argument myCircle is passed-in-as-object, so the object of myCircle is changed after the execution of method is called.
        circleObj.coordinateX = coordinateX + deltaX;
        circleObj.coordinateY = coordinateY + deltaY;
        
        //passed in by value - to assign a new reference to circleObj,but is useless, this new reference is passed in by values, and never be stored after the method is called. It only exists within the method.
        //argument is only a variable to hold the reference of the object,not the object itself. 
        //给argument赋值是pass by value into method
        circleObj = new Circle(7,8);
        System.out.println("temp copy circleObj X = "+circleObj.coordinateX);
        System.out.println("temp copy circleObj Y = "+circleObj.coordinateY);
        System.out.println("original myCircle object X,Y value is not changed to (7,8). It is the temp copy circleObj's coordinates are changed to 7,8; and the tem copy of object only live within the method" );
       
    }
    
    //主程序
    public static void main(String[] args) {
        
     //create a new object named myCircle by using constructor with an orignial coordinate (10,20)
     Circle myCircle = new Circle (10,20);
     
     //call method moveCircle to increment x+3, Y+4
     //the myCircle is passed in as an object
     myCircle.moveCircle (myCircle,3,4);
     
     //to prove the object has been changed after the method is called
     System.out.println("myCircle's coordinate has been changed, and the new myCircle coordinateX = "+ myCircle.coordinateX);
     System.out.println("myCircle's coordinate has been changed, and the new myCircle coordinateY = "+ myCircle.coordinateY);
    }
    
}
