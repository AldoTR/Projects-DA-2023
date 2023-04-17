
package org.uv.programa7b;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "venta")
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idVenta;
    @Column (name = "fecha")
    private Date fecha;
    @Column (name = "total")
    private double total;
    
    public long getIdVenta(){
        return idVenta;
    }
    
    @OneToMany(mappedBy="venta",fetch = FetchType.LAZY )
    private List <DetalleVenta> detalleVenta;
    
    public Venta() {
        detalleVenta = new ArrayList<>();
    }

    public long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(long idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
