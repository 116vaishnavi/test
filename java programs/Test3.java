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
class Demo {
    int i;
    static int j;
    void seti (int x){
        i=x;
        j=j+1;
    }
    void show(){
        System.out.println(i);
        System.out.println(j);
        
    }
}
public class Test3 {
    
    public static void main(String[] args) {
        Demo t1 = new Demo();
        Demo t2 = new Demo();
         Demo t3 = new Demo();
         t1.seti(10);
         t2.seti(10);
         t3.seti(10);
          t1.show();
          t2.show();
          t3.show();
   
    } 
}
