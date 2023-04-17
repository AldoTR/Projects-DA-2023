package org.uv.programa7b;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "detalleVenta")
public class DetalleVenta {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long idDetalleVenta;
    @Column(name = "idProducto")
    private long claveProducto;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "precio")
    private double precio;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "subtotal")
    private double subtotal;
    
    @ManyToOne
    @JoinColumn(name="venta_detalleventa", nullable=false)
    private Venta venta;
      
    @OneToMany(mappedBy="venta",fetch = FetchType.LAZY ) 
    private Venta venta;
    public Venta getVenta()
            return venta;
}  
  
    public Venta() {
        detalleVenta=new ArrayList<>;
    }
    
    public long getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(long idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }
    
    public long getClaveProducto() {
        return claveProducto;
    }

    public void setClaveProducto(long claveProducto) {
        this.claveProducto = claveProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

