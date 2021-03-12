/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elhij
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        VariableCompartida variableCompartida=new VariableCompartida();
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        MyThread t4=new MyThread();
        
        t1.start(variableCompartida);
        t2.start(variableCompartida);
        t3.start(variableCompartida);
        t4.start(variableCompartida);
        t1.getThread().join();
        t2.getThread().join();
        t3.getThread().join(); 
        t4.getThread().join();
        System.out.println(variableCompartida.getContador());  
        
    } 
    
}
