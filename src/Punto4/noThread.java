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
                matriz[i][j]=(int) (Math.random()*100+1);
            }
        }
        
        return matriz;
    }
    
    public static int[] calcularProducto(int inicioFila,int inicioColumna, int [][] matriz, int [][] matrizDos, int tamañoLista){
        
        int[] salida=new int[tamañoLista];
        int tamaño=0;
        boolean bandera=true;
        
        for (int i = inicioFila; i < matriz.length; i++) {
            
            if (bandera==false){
                inicioColumna=0;  
            }
            for (int j = inicioColumna; j < matriz.length; j++) {
              
                if (tamaño<tamañoLista){
               
                int valor=0;
                for (int k = 0; k < matriz.length; k++) {
                   valor=valor+((matriz[i][k])*(matrizDos[k][j]));  
                }
                
                salida[tamaño]=valor;
                
                
                tamaño ++;
                bandera=false;
                }else{
                    i=matriz.length;
                    j=matriz.length;
                }
                
            }
        }
        return salida;
    }
    
    
    public static int[][] calcularProducto( int [][] matriz, int [][] matrizDos){
        
        int[][] salida=new int [matriz.length][matriz.length];
        int[] temporal=calcularProducto(0, 0, matriz, matrizDos, matriz.length*matriz.length);
        int contadorFinal = 0;
        for (int i = 0; i < salida.length; i++) {
            for (int j = 0; j < salida[i].length; j++) {
     
                salida[i][j] = temporal[contadorFinal];

             contadorFinal++;
            }
        }
        return salida;
    }
    
}
