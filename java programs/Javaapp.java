
package javaapp;

class Test{
    int i;
    void seti(int x){
     i=x;
     
    }
    void show(){
        System.out.println(i);
                
    }
}
public class Javaapp{
    public static void main(String[] args) {
        Test t1= new Test();
        Test t2=new Test();
        Test t3 = new Test();
        t1.seti(60);
        t2.seti(50);
        t3.seti(30);
        t1.show();
        t2.show();
        t3.show();
    }
}


 
