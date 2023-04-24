

package org.uv.programa02;

public class Programa02 {

    public static void main(String[] args) {
      //  Singleton singleton=new Singleton();
      Singleton singleton=Singleton.getInstance();
      singleton.imprimir();
    }
}
