/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author elhij
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThread t1=new MyThread(1,"A");
        MyThread t2=new MyThread(2,"B");
        MyThread t3=new MyThread(3,"C");
        MyThread t4=new MyThread(4,"D");
        MyThread t5=new MyThread(5,"E");
        MyThread t6=new MyThread(6,"F");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
    
}
