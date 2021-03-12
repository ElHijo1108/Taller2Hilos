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
public class noThread {
    
    public static int[][] rellenarMatriz(int tamaño){
        int[][] matriz=new int[tamaño][tamaño];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int) (Math.random()*tamaño+1);
                //matriz[i][j]=4;
            }
        }
        
        return matriz;
    }
    
    public static int[][] calcularProducto(int inicioFila,int inicioColumna,int finFila,int finColumna, int [][] matriz, int [][] matrizDos){
        
        
        int[][] salida=new int[finFila-inicioFila][finColumna-inicioColumna];
        for (int i = inicioFila; i < finFila; i++) {
            for (int j = inicioColumna; j < finColumna; j++) {
                int valor=0;
                
                for (int k = 0; k < matriz.length; k++) {
                    
                    //System.out.println(i+" "+j+" "+k);
                   valor=valor+((matriz[i][k])*(matrizDos[k][j]));
                    
                   
                }
                salida[i][j]=valor;
            }
        }
        
        return salida;
    }
    
}
