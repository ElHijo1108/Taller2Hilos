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
    private int finFila=0;
    private int inicioColumna=0;
    private int finColumna=0;
    private int[][] matriz=null;
    private int[][] matriz2=null;
    private int[][] matriz3=null;
    private Thread thread=null;

    public MyThread() {
    }
    public Thread start(int newinicioFila, int newfinFila,
            int newinicioColumna, int newfinColumna, int [][] newmatriz,
            int [][]newmatriz2){
        
        inicioFila=newinicioFila;
        finFila=newfinFila;
        inicioColumna=newinicioColumna;
        finColumna=newfinColumna;
        matriz=newmatriz;
        matriz2=newmatriz2;
        thread=new Thread(this);
        thread.start();
        return thread;
    }

    public int[][] getMatriz3() {
        return matriz3;
    }
    
    @Override
    public void run() {
       matriz3=noThread.calcularProducto(inicioFila, inicioColumna, finFila, finColumna, matriz, matriz2);
    }
}
