/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.MPersona;
import modelo.MInfoMinisterio;
import hibernate.SesionFactory;

/**
 *
 * @author Usuario
 */
public class DAOMinisterial {
    
     public boolean saveInfoMinisterio(MInfoMinisterio infoMinisterio, MPersona persona){
      SesionFactory sesionFactory = new SesionFactory();
        try {
           sesionFactory.openTransaction();
           sesionFactory.save(infoMinisterio);
           sesionFactory.save(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
           return true;
        } catch (Exception e) {
            return false;
        }
    }
    
      public boolean updateInfoMinisterio(MInfoMinisterio infoMinisterio, MPersona persona){
          SesionFactory sesionFactory = new SesionFactory();
        try {
           sesionFactory.openTransaction();
           sesionFactory.saveOrUpdate(infoMinisterio);
           sesionFactory.saveOrUpdate(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
           return true;
        } catch (Exception e) {
            return false;
        }
     }
}
