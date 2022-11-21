/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcuzzola
 */
public class IDontLikeMondaysDriver {
    
    public static void main(String[] args) throws IDontLikeMondaysException  //must use throws if not use try/catch when the Exception class is checked(extends exception)
    {                                     //no need of throws .. if the Exception class is unchecked(extends RuntimeException)
        WhatDayIsIt wDay = new WhatDayIsIt();
        try{
        wDay.ask();         //try catch  here or throws the Exception to the uper class main meathod level.
        }catch(IDontLikeMondaysException ex)
        {
           System.out.println("catch my own exception class error thrown out.");
        }
    }
}
             //ask() method has/cause the IDontLikeMondayException type of exception