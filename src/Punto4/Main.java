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
    public static void main(String[] args) {
        int w=5/2;
        System.out.println(w);
        int tamaño=3;
        int[][] matrizUno=noThread.rellenarMatriz(tamaño);
        int[][] matrizDos=noThread.rellenarMatriz(tamaño);
        //int[][] matrizUno={{2,0,1},{3,0,0},{5,1,1}};
        //int[][] matrizDos={{1,0,1},{1,2,1},{1,1,0}};
        int[][] matrizTres=noThread.calcularProducto(0, 0, tamaño, tamaño, matrizUno, matrizDos);
        for (int matriz[]:matrizUno){
            System.out.println(Arrays.toString(matriz));
        }
        System.out.println(" ");
        for (int matriz[]:matrizDos){
            System.out.println(Arrays.toString(matriz));
        }
        System.out.println(" ");
        for (int matriz[]:matrizTres){
            System.out.println(Arrays.toString(matriz));
        }
        
        
        
        
        
        
    }
    
}
