gvb/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author Tectonic
 */
public class Rururu {

  
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=0;
        try{
            if(b==0){
        ArithmeticException ex;
        ex=new ArithmeticException();
        throw ex;
}
            c = a/b;
            System.out.println("Div is" +c);
        }
        catch(ArithmeticException e){
            System.out.println("Can not divide by zero!!!");
        }
    
}
