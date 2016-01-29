/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.Clases;
import gdm.entidades.clases.Anticipo;
import gdm.entidades.clases.ContratoCliente;
import gdm.entidades.clases.Escuela;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import negocio.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
/**
 *
 * @author Chuy
 */
public class AnticipoNegocio {
      
     public static Anticipo Obtener(int id)
    { 
        Anticipo entidad = new Anticipo();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Anticipo) session.createCriteria(Anticipo.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
      public static Boolean Guardar(int idContratoCliente, 
              String nombre, String celular, String telefono,double cantidad,String concepto,String recibo, 
              Date fecha)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        ContratoCliente contratoCliente = ContratoClienteNegocio.Obtener(idContratoCliente);
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Anticipo entidad = new Anticipo();            
             entidad.setNombre(nombre);
             entidad.setCelular(celular);
             entidad.setTelefono(telefono);
             entidad.setCantidad(cantidad);
             entidad.setConcepto(concepto);
             entidad.setRecibo(recibo);
             entidad.setFecha(fecha);
             if(contratoCliente.getAnticipos()==null){
               List<Anticipo> anticipos = new ArrayList();
               anticipos.add(entidad);
               contratoCliente.setAnticipos(anticipos);
             }else{               
             contratoCliente.getAnticipos().add(entidad);             
             }
             session.update(contratoCliente);            
             tx.commit();
             realizado = true;
        }
        catch (Exception ex) 
        {
             if (tx!=null) 
                 tx.rollback();
             throw ex;
        }
        finally 
        {
            session.close(); 
        }
      return realizado;
    }
       public static Boolean Editar(int id,
               String nombre, String celular, String telefono,double cantidad,String concepto,String recibo)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Anticipo entidad = Obtener(id);             
              entidad.setNombre(nombre);
             entidad.setCelular(celular);
             entidad.setTelefono(telefono);
             entidad.setCantidad(cantidad);
             entidad.setConcepto(concepto);
             entidad.setRecibo(recibo);
             session.update(entidad); 
             tx.commit();
             realizado = true;
        }
        catch (Exception ex) 
        {
             if (tx!=null) 
                 tx.rollback();
             throw ex;
        }
        finally 
        {
            session.close(); 
        }
      return realizado;
    }
    
    public static Boolean Eliminar(int id)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Session session = null;
        try
        {
             session = HibernateUtils.getSession();    
             tx = session.beginTransaction();
             Anticipo entidad = Obtener(id); 
             session.delete(entidad); 
             tx.commit();
             realizado = true;
        }
        catch (Exception ex) 
        {
             if (tx!=null) 
                 tx.rollback();
             throw ex;
        }
        finally 
        {
            session.close(); 
        }
      return realizado;
    }
     public static String ObtenerNombre(int id)
    {
        String nombre = "";
        try 
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Anticipo.class);
            crit.add(Expression.eq("id", id));
            crit.setProjection(Projections.projectionList()
                .add(Projections.property("nombre")));
            nombre = (String) crit.setMaxResults(1).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return nombre;
    }
     public static List<Anticipo> Listado()
    {
        List<Anticipo> lista = new ArrayList<Anticipo>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Anticipo.class);
            lista = (List<Anticipo>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<Anticipo> Buscar(String nombre)
    {
        List<Anticipo> lista = new ArrayList<Anticipo>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Anticipo.class);
            crit.add(Expression.like("nombre", nombre, MatchMode.ANYWHERE));
            lista = (List<Anticipo>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
}
