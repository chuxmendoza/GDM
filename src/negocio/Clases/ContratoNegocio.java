package negocio.Clases;
 
import java.util.ArrayList;
import java.util.List;
import negocio.utils.HibernateUtils; 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode;  
import gdm.entidades.clases.Baile;
import gdm.entidades.clases.Contrato;
import gdm.entidades.clases.ContratoCliente;
import gdm.entidades.clases.Escuela;
import gdm.entidades.clases.Especialidad;
import gdm.entidades.clases.FotoPanoramica; 
import gdm.entidades.clases.Misa;
import java.util.Date;

/**
 *
 * @author luis
 */
public class ContratoNegocio {
    
    
    public static Boolean Guardar(int idEscuela, int idEspecialidad, String generacion, Date fechaEvento, FotoPanoramica fotoPanoramica, Misa misa, 
            Baile baile, String comentarios)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Contrato entidad = new Contrato();  
             entidad.setEscuela(new Escuela(idEscuela));
             entidad.setEspecialidad(new Especialidad(idEspecialidad));
             entidad.setGeneracion(generacion);
             entidad.setFechaEvento(fechaEvento);
             entidad.setFotoPanoramica(fotoPanoramica);
             entidad.setMisa(misa);
             entidad.setBaile(baile);
             entidad.setComentarios(comentarios);
             session.save(entidad); 
             tx.commit();
             realizado = true;
        }
        catch (Exception ex) 
        {
             if (tx!=null) 
                 tx.rollback();
             throw ex;
        }
      return realizado;
    }
    /* 
    public static Boolean Editar(int id, int idEscuela, int idEspecialidad, String generacion, Date fechaEvento, FotoPanoramica fotoPanoramica, Misa misa, 
            Baile baile, String comentarios, List<ContratoCliente> clientes)
  
    */
    public static Boolean Editar(int id, int idEscuela, int idEspecialidad, String generacion, Date fechaEvento, FotoPanoramica fotoPanoramica, Misa misa, 
            Baile baile, String comentarios)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
             Contrato entidad = Obtener(id);
             entidad.setEscuela(new Escuela(idEscuela));
             entidad.setEspecialidad(new Especialidad(idEspecialidad));
             entidad.setGeneracion(generacion);
             entidad.setFechaEvento(fechaEvento);
             entidad.setFotoPanoramica(fotoPanoramica);
             entidad.setMisa(misa);
             entidad.setBaile(baile);
             entidad.setComentarios(comentarios);
             //entidad.setContratoCliente(clientes);
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
      return realizado;
    }
    
    public static Boolean Eliminar(int id, int idMisa, int idBaile, int idFoto)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Contrato entidad = new Contrato(id);
                 
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();           
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
        if(realizado){
              EliminarMisa(idMisa);
             EliminarBaile(idBaile);
             EliminarFotoPanoramica(idFoto);
        }
      return realizado;
    }
       
    public static Contrato Obtener(int id)
    { 
        Contrato entidad = new Contrato();
        try
        {
          Session session = HibernateUtils.getSession();
          entidad = (Contrato) session.createCriteria(Contrato.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getStackTrace());
            throw ex;
        }
        return entidad; 
    }
    
    public static Contrato ObtenerDetalle(int id)
    { 
        Contrato entidad = new Contrato();
        try
        {
          Session session = HibernateUtils.getSession();
          //Criteria crit = session.createCriteria(Contrato.class);
          entidad = (Contrato) session.createCriteria(Contrato.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    
    public static List<Contrato> Listado()
    {
        List<Contrato> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Contrato.class);
            lista = (List<Contrato>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<Contrato> Buscar(String especialidad, String escuela, String generacion, Date fechaEvento)
    {
        List<Contrato> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSession();
            Criteria crit = session.createCriteria(Contrato.class);
            crit.createAlias("especialidad", "e");
            crit.createAlias("escuela", "es");
            crit.add(Expression.like("e.nombre", especialidad, MatchMode.ANYWHERE));
            crit.add(Expression.like("es.nombre", escuela, MatchMode.ANYWHERE));
            crit.add(Expression.eq("fechaEvento", fechaEvento)); 
            lista = (List<Contrato>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
        
    public static Boolean EliminarMisa(int id)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Misa entidad = new Misa(id);
        
        
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
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
      return realizado;
    }
     public static Boolean EliminarBaile(int id)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Baile entidad = new Baile(id);
        
        
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
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
      return realizado;
    }
     
  public static Boolean EliminarFotoPanoramica(int id)
    
          
    {
        boolean realizado = false;
        Transaction tx = null; 
        FotoPanoramica entidad = new FotoPanoramica(id);
        
        
        try
        (Session session = HibernateUtils.getSession()) {    
             tx = session.beginTransaction();
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
      return realizado;
    }
      
    
}
