/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

/**
 *
 * @author elhij
 */
public class MyThread implements Runnable{
    private int inicioFila=0;
 
    private int inicioColumna=0;
    
    private int[][] matriz=null;
    private int[][] matriz2=null;
    private int[] matriz3=new int[1];
    private int tamañoLista=0;
    private Thread thread=null;

    public MyThread() {
    }
    public Thread start(int newinicioFila,int newinicioColumna,  int [][] newmatriz,
            int [][]newmatriz2, int newTamañoLista){
        
        inicioFila=newinicioFila;
        inicioColumna=newinicioColumna;
        
        matriz=newmatriz;
        matriz2=newmatriz2;
        tamañoLista=newTamañoLista;
        thread=new Thread(this);
        thread.start();
        return thread;
    }

    public int[] getMatriz3() {
        return matriz3;
    }

    public Thread getThread() {
        return thread;
    }
    
    @Override
    public void run() {
        synchronized(matriz3){
       matriz3=noThread.calcularProducto(inicioFila, inicioColumna, matriz, matriz2,tamañoLista);
        }
    }
}
