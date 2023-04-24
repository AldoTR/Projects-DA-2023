package org.uv.programa03;

public class Programa03 {

    public static void main(String[] args) {
    
      //ClaseConcreta c=new ClaseConcreta();
      //c.imprimir();
        
      //ClaseAHija cah=new ClaseAHija();
      //cah.imprimir();
        
        ClaseA ca=null;
        
        ca=new ClaseAHija();
        ca.imprimir();
        
        ca=new ClaseAHija2();
        ca.imprimir();
        
        ca=new ClaseA() {
            @Override
            public void msg() {
             System.out.println("Otra clase anónima");
            }
        };
        ca.imprimir();
            
           
        }
}