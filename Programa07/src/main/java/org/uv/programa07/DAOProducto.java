/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa07;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author atrcu
 */
/*
public class DAOProducto implements IDAOGeneral<Producto, Long>{
    @Override
    public Empleado create(Empleado p) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        session.save(p);
        t.commit();
        session.close();
        return p;
    }

    @Override
    public boolean delete(Long id) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        Empleado empleado = session.get(Empleado.class, id);
        if (empleado != null) {
            session.delete(empleado);
            t.commit();
            session.close();
            return true;
        } else {
            t.rollback();   //revertir los cambios realizados en la trans y volver al anterior.
            session.close();
            return false;
        }
    }


    @Override
    public Producto update(Producto p, Long id) {
        Session session = HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        Producto producto = session.get(Producto.class, id);
        
        producto.setNombre(p.getNombre());
        producto.setDireccion(p.getDireccion());
        producto.setTelefono(p.getTelefono());
        
        session.update(producto);
        t.commit();
        session.close();
        return producto;
    }

    @Override
    public List<Producto> findAll() {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        String sql = "SELECT * FROM empleados";
        Query query = session.createNativeQuery(sql, Producto.class);
        List<Producto> productos = query.getResultList();      
        session.close();
        return empleados;
    }


    @Override
    public Producto FindById(Long id) {
        Session session = HibernateUtil.getSession();
        Producto producto = session.get(Producto.class, id);
        session.close();
        return empleado;
    }

}
*/