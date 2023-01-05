/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
class Z{
    void show(){
        System.out.println("in class Z");
    }
}
class Y extends Z{
    void show(){
        System.out.println("in class Y");
    }
}
public class Kshiti {
    public static void main(String[] args) {
        Z y1=new Y();
        Z z1=new Z();
        y1.show();
        z1.show();
    }
 
}
