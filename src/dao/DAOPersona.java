/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import modelo.MPersona;
import hibernate.SesionFactory;
import java.util.List;
import org.hibernate.Query;
/**
 *
 * @author maike
 */
public class DAOPersona {

    public DAOPersona() {
    }
    
    
    public boolean savePersona(MPersona persona){
      SesionFactory sesionFactory = new SesionFactory();
        try {
           sesionFactory.openTransaction();
           sesionFactory.save(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
           return true;
        } catch (Exception e) {
            return false;
        }
    }
    
      public boolean updatePersona(MPersona persona){
          SesionFactory sesionFactory = new SesionFactory();
        try {
           sesionFactory.openTransaction();
           sesionFactory.save(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
           return true;
        } catch (Exception e) {
            return false;
        }
     }
      
    public MPersona getPersonaCodigo(String codigo){
     SesionFactory sesionFactory = new SesionFactory();
     MPersona persona;
     persona = (MPersona) sesionFactory.queryUniq("select p from MPersona p where codigo='"+codigo+"'");
     System.out.print(persona);
     return persona;
    }
    
    public List<Object[]> listPersonasAtributo(String atributo, String valor){
       SesionFactory sesionFactory = new SesionFactory();
       Query query;
       query = sesionFactory.query("select p from MPersona p where p."+ atributo +"="+valor);
       return query.list();
   }
}
