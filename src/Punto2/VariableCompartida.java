/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

/**
 *
 * @author elhij
 */
public class VariableCompartida {
    private int contador=0;

    public VariableCompartida() {
    }
    
    public void aumentar(){
        for (int i = 0; i < 5000; i++) {
            contador++;
        }
    }

    public int getContador() {
        return contador;
    }
    
}
