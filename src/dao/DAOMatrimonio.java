/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.MPersona;
import modelo.MMatrimonio;
import hibernate.SesionFactory;
import java.util.List;
import org.hibernate.Query;
/**
 *
 * @author Usuario
 */
public class DAOMatrimonio {
   
    public boolean savePersona(MMatrimonio matrimonio, MPersona persona){
      SesionFactory sesionFactory = new SesionFactory();
        try {
           sesionFactory.openTransaction();
           sesionFactory.save(matrimonio);
           sesionFactory.save(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
           return true;
        } catch (Exception e) {
            return false;
        }
    }
    
      public boolean updatePersona(MMatrimonio matrimonio, MPersona persona){
          SesionFactory sesionFactory = new SesionFactory();
        try {
           sesionFactory.openTransaction();
           sesionFactory.saveOrUpdate(matrimonio);
           sesionFactory.saveOrUpdate(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
           return true;
        } catch (Exception e) {
            return false;
        }
     }
}
