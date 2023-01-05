/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;


class A{
    void show(){
        System.out.println("In A");
    }
}
class B extends A{
    void show(){
        System.out.println("In B");
    }
}
class C extends B{
    void show(){
        System.out.println("In C");
    }
}
public class Akshu {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();
        
        ob1.show();
        ob2.show();
        ob3.show();
    }
    
}
