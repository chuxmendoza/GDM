package negocio.Clases;
 
import gdm.entidades.clases.Agradecimiento;
import gdm.entidades.clases.Anillo;
import gdm.entidades.clases.Anticipo;
import java.util.ArrayList;
import java.util.List;
import negocio.utils.HibernateUtils; 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.MatchMode; 
import gdm.entidades.clases.Contrato; 
import gdm.entidades.clases.ContratoCliente;
import gdm.entidades.clases.Modelo;
import java.util.Date;
import org.hibernate.transform.Transformers;

/**
 *
 * @author luis
 */
public class ContratoClienteNegocio {
    
    
    public static Boolean Guardar(int idContrato,int folio, int idModelo, boolean reconocimiento, Agradecimiento agradecimiento, String mensaje, boolean fotoPanoramica,
            boolean fotoMisa, boolean fotoEstudio, Anillo anillo, boolean rentaToga, boolean misa, boolean baile, int mesaExtra, int fotosExtra, 
            boolean triptico, double precio, Date fechaEntregaPaquete, Date fechaEntregaDatos, Date fechaLimitePago, String contratoImagen, 
            Date fechaContrato, String comentarios)
    {
        boolean realizado = false;
        Transaction tx = null; 
        Contrato contrato = ContratoNegocio.Obtener(idContrato);
        try
        (Session session = HibernateUtils.getSessionFactory().openSession()) {    
             tx = session.beginTransaction();
             ContratoCliente entidad = new ContratoCliente();
             entidad.setFolio(folio);
             entidad.setModelo(new Modelo(idModelo));
             entidad.setReconocimiento(reconocimiento);
             entidad.setAgradecimiento(agradecimiento);
             entidad.setMensaje(mensaje);
             entidad.setFotoPanoramica(fotoPanoramica);
             entidad.setFotoMisa(fotoMisa);
             entidad.setFotoEstudio(fotoEstudio);
             entidad.setAnillo(anillo);
             entidad.setRentaToga(rentaToga);
             entidad.setMisa(misa);
             entidad.setBaile(baile);
             entidad.setMesaExtra(mesaExtra);
             entidad.setFotosExtra(fotosExtra);
             entidad.setTriptico(triptico);
             entidad.setPrecio(precio);
             entidad.setFechaEntregaPaquete(fechaEntregaPaquete);
             entidad.setFechaEntregaDatos(fechaEntregaDatos);
             entidad.setFechaLimitePago(fechaLimitePago);
             entidad.setContratoImagen(contratoImagen);
//             entidad.setAnticipos(anticipos);
             entidad.setFechaContrato(fechaContrato);            
             entidad.setComentarios(comentarios);
             double total = 0;                      
             tx.commit();
             realizado = true;
//             boolean liquidado = false;
//             for(Anticipo a : anticipos)
//             {
//                 total = total + a.getCantidad();
//             }
//             if (entidad.getPrecio() == total)
//                 liquidado = true;
             entidad.setLiquidado(false);
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
    
    public static Boolean Editar(int id, int folio, int idModelo, boolean reconocimiento, Agradecimiento agradecimiento, String mensaje, 
            boolean fotoPanoramica, boolean fotoMisa, boolean fotoEstudio, Anillo anillo, boolean rentaToga, boolean misa, boolean baile, int mesaExtra, 
            int fotosExtra, boolean triptico, double precio, Date fechaEntregaPaquete, Date fechaEntregaDatos, Date fechaLimitePago, String contratoImagen, 
            Date fechaContrato, String comentarios)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSessionFactory().openSession()) {    
             tx = session.beginTransaction();
             ContratoCliente entidad = Obtener(id);
             entidad.setFolio(folio);
             entidad.setModelo(new Modelo(idModelo));
             entidad.setReconocimiento(reconocimiento);
             entidad.setAgradecimiento(agradecimiento);
             entidad.setMensaje(mensaje);
             entidad.setFotoPanoramica(fotoPanoramica);
             entidad.setFotoMisa(fotoMisa);
             entidad.setFotoEstudio(fotoEstudio);
             entidad.setAnillo(anillo);
             entidad.setRentaToga(rentaToga);
             entidad.setMisa(misa);
             entidad.setBaile(baile);
             entidad.setMesaExtra(mesaExtra);
             entidad.setFotosExtra(fotosExtra);
             entidad.setTriptico(triptico);
             entidad.setPrecio(precio);
             entidad.setFechaEntregaPaquete(fechaEntregaPaquete);
             entidad.setFechaEntregaDatos(fechaEntregaDatos);
             entidad.setFechaLimitePago(fechaLimitePago);
             entidad.setContratoImagen(contratoImagen); 
             entidad.setFechaContrato(fechaContrato);
           
             entidad.setComentarios(comentarios);
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
    
    public static Boolean Eliminar(int id)
    {
        boolean realizado = false;
        Transaction tx = null; 
        try
        (Session session = HibernateUtils.getSessionFactory().openSession()) {    
             tx = session.beginTransaction();
             ContratoCliente entidad = Obtener(id); 
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
       
    public static ContratoCliente Obtener(int id)
    { 
        ContratoCliente entidad = new ContratoCliente();
        try
        {
          Session session = HibernateUtils.getSessionFactory().openSession();
          entidad = (ContratoCliente) session.createCriteria(ContratoCliente.class).add(Expression.eq("id", id)).uniqueResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return entidad; 
    }
    
    
    public static List<ContratoCliente> Listado()
    {
        List<ContratoCliente> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSessionFactory().openSession();
            Criteria crit = session.createCriteria(ContratoCliente.class);
            lista = (List<ContratoCliente>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
    
    public static List<ContratoCliente> Buscar(int idContrato, String nombre, int folio, boolean liquidado)
    {
        List<ContratoCliente> lista = new ArrayList<>();
        try
        {
            Session session = HibernateUtils.getSessionFactory().openSession();
            Criteria crit = session.createCriteria(Contrato.class); 
            crit.add(Expression.eq("id", idContrato));
            crit.createAlias("cliente", "c");
            if (!nombre.isEmpty())
                crit.add(Expression.like("c.nombre", nombre, MatchMode.ANYWHERE));
            if (folio > 0)
                crit.add(Expression.eq("c.folio", folio));
            crit.add(Expression.eq("c.liquidado", liquidado)); 
            crit.setResultTransformer(Transformers.aliasToBean(ContratoCliente.class));
            lista = (List<ContratoCliente>) crit.list();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        return lista;
    }
     
}
