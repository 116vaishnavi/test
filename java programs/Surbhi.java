/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

class Test5{
    int i,j;
    Test5(){
        i=14;
        j=41;
        System.out.println("INVERTED ROLL NOS.");
    }
    void add(){
        System.out.println(i+j);
    }
}
public class Surbhi {
    public static void main(String[] args) {
        Test5 t5= new Test5();
        t5.add();
        
    }
}
