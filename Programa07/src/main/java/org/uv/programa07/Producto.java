/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.uv.programa07;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType
import java.persistence.Id;
import java.persistence.Table;

/* 
@author atrcu
*/        
 
public class Producto {
    
@Entity
@Table(name = 'productos')
     
    private long clave;
    private String nombre;
    private double precio;

    public void setClave(long clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}
*/