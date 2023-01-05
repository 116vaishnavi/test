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
class A1{
    void show(){
        System.out.println("In A");
    }
}
class B1 extends A1{
    void show(){
        System.out.println("In B");
    }
}
class C1 extends B1{
    void show(){
        System.out.println("In C");
    }
}
public class Aikka {
    public static void main(String[] args) {
        A1 ob1 = new C1();
      
        
        ob1.show();
        
    }
    
}
