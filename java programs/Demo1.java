

        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author Tectonic
 */
public class Demo1 {
    public static void main(String[] args) {
        int a,b,c;
        a=100000;
        b=0;
        try{
            c=a/b;
            System.out.println("Div is" +c);
        }catch(ArithmeticException e){
            System.out.println("can not divide by zero!!!");
        }finally{
            System.out.println("Always executed!!!");
        }
    }
    
}
