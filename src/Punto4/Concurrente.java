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
public class Concurrente {

    public static int[][] producto(int[][] matriz, int[][] matrizDos) throws InterruptedException {

        int[][] salidaFinal = new int[matriz.length][matriz.length];
        int distancia = (matriz.length * matriz.length) / 4;
        int[] salida = new int[distancia];
        MyThread[] t1 = new MyThread[4];
        
        int inicioFila = 0;
        int finFila = 0;
        int inicioColumna = 0;
        int finColumna = -1;
        int contador = 1;
        int hiloTemporal=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
             
                if(matriz.length%2!=0 && i==matriz.length-1 && j==matriz[i].length-2){
                    distancia++;
                    
                }

                if (contador==distancia) {
                    if(finColumna==matriz[i].length-1){
                        inicioFila=finFila+1;
                        inicioColumna=0;
                        finFila=i;
                        finColumna=j;
                    }else{
                        inicioFila=finFila;
                        inicioColumna=finColumna+1;
                        finFila=i;
                        finColumna=j;
                    }
                        
                    t1[hiloTemporal] = new MyThread();
                    
                    t1[hiloTemporal].start(inicioFila, inicioColumna, matriz, matrizDos, distancia);
             
                    hiloTemporal++;
                    contador=1;
                }else{
                contador++;
                }
            }
        }
        
        
        for (int i = 0; i < 4; i++) {
            t1[i].getThread().join();
        }
        
        
        
        
      
        int hilo = 0;
        salida = t1[hilo].getMatriz3();
        int contadorFinal = 0;
        for (int i = 0; i < salidaFinal.length; i++) {
            for (int j = 0; j < salidaFinal[i].length; j++) {
     
                salidaFinal[i][j] = salida[contadorFinal];

                if (contadorFinal == salida.length - 1) {
                    hilo++;
                    if(hilo<t1.length){
                    salida = t1[hilo].getMatriz3();
                    }
                    contadorFinal = 0;
                } else {
                    contadorFinal++;
                }

            }
        }

        return salidaFinal;
    }
}
