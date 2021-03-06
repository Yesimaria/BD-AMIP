/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;
import java.util.ArrayList;
import java.util.List;
import modelo.MPersona;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
/**
 *
 * @author maike
 */
public class SesionFactory {
      SessionFactory sessionFactory;
      Configuration configuration; 
      ServiceRegistry serviceRegistry;
      Session session;
      
    public SesionFactory() {
       this.configuration = new Configuration();
       this.configuration.configure();
       this.serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
       this.sessionFactory = configuration.buildSessionFactory(serviceRegistry);
       this.session = sessionFactory.openSession();
      
    }
    
    public void openTransaction(){
      this.session.beginTransaction();
    }
    
    public void closeTransaction(){
         this.session.close();
         
     }
    
    public void save(Object object){
        this.session.save(object);
        this.session.getTransaction().commit();
    }
      public void saveOrUpdate(Object object){
        this.session.saveOrUpdate(object);
        this.session.getTransaction().commit();
    }
      
     public void delete(Object object){
        this.session.delete(object);
        this.session.getTransaction().commit();
    }
    
    public List query (String sql){
        List objs = new ArrayList();
        objs = this.session.createQuery(sql).list();
        return objs;
        
    }
    
    public Object queryUniq(String sql){
        System.out.println("La busqueda");
        Object query;
        query = this.session.createQuery(sql).uniqueResult();
        System.out.println("La busqueda" + query);
        return query;
    }
   
     public void closeSession(){
        this.sessionFactory.close();
         
     }
     
}
