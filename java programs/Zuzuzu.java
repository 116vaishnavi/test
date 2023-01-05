/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.util.Scanner;
public class Zuzuzu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int [size];
        for(int i=0;i<arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(max(arr));
    }
}
    
    


class Demo12 extends Zuzuzu{
    
        static int max (int[]x){
        int max = x[0];
        for(int i=0;i<x.length;i++){
            if(max < x[i]){
                max=x[i];
            }
        
        } 
     return max;
}
}

