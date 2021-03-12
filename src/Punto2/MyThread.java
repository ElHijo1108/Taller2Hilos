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
public class MyThread implements Runnable{
    
    
    private Thread theThread=null;
    private int contador=0;
    private VariableCompartida variableCompartidda=null;
    
    public MyThread() {
    }
    public Thread start(VariableCompartida newVariableComp){
        variableCompartidda=newVariableComp;
        theThread=new Thread(this);
        theThread.start();
        return theThread;
    }
    
    public Thread getThread(){
        return theThread;
    }
    

    
    @Override
    public void run() {
        synchronized(variableCompartidda){
        variableCompartidda.aumentar();
        }
    }
    
}
