/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elhij
 */
public class MyThread implements Runnable{
    
    
    private int id=0;
    private String nombre="";
    private int numeroIteraciones=0;
    private int tiempoEspera=0;
    private Thread theThread=null;

    public MyThread(int newId, String newNombre) {
        id=newId;
        nombre=newNombre;
        numeroIteraciones=60/id;
        tiempoEspera=id*1000;
        theThread=new Thread(this);
    }
    public Thread start(){
        theThread.start();
        return theThread;
    }
    
    @Override
    public void run() {
        long startTime = 0;
        long endTime = 0;
        long diffTime = 0;
        startTime = System.currentTimeMillis();
        for (int i = 1; i <= numeroIteraciones; i++) {
            try {
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException ex) {
            }
            endTime = System.currentTimeMillis();
            diffTime=endTime - startTime;
            System.out.println("hilo "+id+" con nombre "+nombre+"  Tiempo esperado "+(i*id)+ " segundos,  Tiempo Real "+diffTime / 1000f +" segundos");
        }
    }
    
}
