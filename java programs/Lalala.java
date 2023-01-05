/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.time.Clock;

/**
 *
 * @author Tectonic
 */
public class Lalala {
    static void display(String x,int... a){
        System.out.println(x);
        for(int i=0;i<a.length ;i++){
            System.out.println(a[i]);
            
        }
    }

    public static void main(String[] args) {
        display("Hello",1,2,3,4);
        
      
    }
    
}
