
package org.uv.programa02;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Singleton {
    
    private static Singleton s=null;
    public static Singleton getInstance(){
        if(s==null)
            s= new Singleton();
        return s;
    }
    private Singleton(){
    }

public void imprimir(){
    Logger.getLogger(Singleton.class.getName()).log(Level.INFO,"hola...");
    }
}