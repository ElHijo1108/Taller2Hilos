/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

import java.util.Arrays;

/**
 *
 * @author elhij
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        
       
        System.out.println(" Con una matriz 100*100");
        int tamaño=100;
        int[][] matrizUno=noThread.rellenarMatriz(tamaño);
        int[][] matrizDos=noThread.rellenarMatriz(tamaño);
        // int[][] matrizUno={{2,1,1,1,1},{3,4,4,3,1},{4,2,4,2,1},{3,2,2,3,1},{3,2,2,3,1}};
        //int[][] matrizDos={{4,4,3,2,1},{4,4,2,1,1},{1,1,1,4,1},{1,1,4,1,1},{3,2,2,3,1}};
        //int[][] matrizUno={{2,0,1},{3,0,0},{5,1,1}};
        //int[][] matrizDos={{1,0,1},{1,2,1},{1,1,0}};
        int[][] matrizTres=null;
       /* for (int matriz[]:matrizUno){
            System.out.println(Arrays.toString(matriz));
        }
        System.out.println(" ");
        for (int matriz[]:matrizDos){
            System.out.println(Arrays.toString(matriz));
        }*/
        
        
        //Sin Hilos
        System.out.println("Sin hilos");
        
        
        long startTime = 0;
        long endTime = 0;
        long diffTime = 0;
        startTime = System.currentTimeMillis();
        matrizTres=noThread.calcularProducto(matrizUno, matrizDos);
        endTime = System.currentTimeMillis();
        diffTime = (endTime - startTime);

        System.out.println("Tiempo sin hilos: " + diffTime / 1000f);
        
        System.out.println(" ");
        /*for (int[] matriz:matrizTres){
            System.out.println(Arrays.toString(matriz));
           
        }*/
        //Con hilos
        System.out.println("Con hilos");
        startTime = System.currentTimeMillis();
        matrizTres=Concurrente.producto(matrizUno, matrizDos);
        endTime = System.currentTimeMillis();
        diffTime = (endTime - startTime);

        System.out.println("Tiempo con hilos: " + diffTime / 1000f);
        System.out.println(" ");
        /*for (int[] matriz:matrizTres){
            System.out.println(Arrays.toString(matriz));
           
        }*/
        System.out.println(" Con una matriz 500*500");
        tamaño=500;
        matrizUno=noThread.rellenarMatriz(tamaño);
        matrizDos=noThread.rellenarMatriz(tamaño);

         matrizTres=null;
   
        //Sin Hilos
        System.out.println("Sin hilos");
        
        
        startTime = 0;
        endTime = 0;
        diffTime = 0;
        startTime = System.currentTimeMillis();
        matrizTres=noThread.calcularProducto(matrizUno, matrizDos);
        endTime = System.currentTimeMillis();
        diffTime = (endTime - startTime);

        System.out.println("Tiempo sin hilos: " + diffTime / 1000f);
        
        System.out.println(" ");

        //Con hilos
        System.out.println("Con hilos");
        startTime = System.currentTimeMillis();
        matrizTres=Concurrente.producto(matrizUno, matrizDos);
        endTime = System.currentTimeMillis();
        diffTime = (endTime - startTime);

        System.out.println("Tiempo con hilos: " + diffTime / 1000f);
        System.out.println(" ");

        
        
        
        
        System.out.println(" Con una matriz 1000*1000");
        tamaño=1000;
        matrizUno=noThread.rellenarMatriz(tamaño);
        matrizDos=noThread.rellenarMatriz(tamaño);

         matrizTres=null;
   
        //Sin Hilos
        System.out.println("Sin hilos");
        
        
        startTime = 0;
        endTime = 0;
        diffTime = 0;
        startTime = System.currentTimeMillis();
        matrizTres=noThread.calcularProducto(matrizUno, matrizDos);
        endTime = System.currentTimeMillis();
        diffTime = (endTime - startTime);

        System.out.println("Tiempo sin hilos: " + diffTime / 1000f);
        
        System.out.println(" ");

        //Con hilos
        System.out.println("Con hilos");
        startTime = System.currentTimeMillis();
        matrizTres=Concurrente.producto(matrizUno, matrizDos);
        endTime = System.currentTimeMillis();
        diffTime = (endTime - startTime);

        System.out.println("Tiempo con hilos: " + diffTime / 1000f);
        System.out.println(" ");


    }
    
}
