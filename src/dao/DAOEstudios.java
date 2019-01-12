/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import modelo.MPersona;
import modelo.MInfoEstudios;
import hibernate.SesionFactory;
/**
 *
 * @author Usuario
 */
public class DAOEstudios {
    
    public boolean saveInfoEstudios(MInfoEstudios infoEstudios, MPersona persona){
      SesionFactory sesionFactory = new SesionFactory();
        try {
           sesionFactory.openTransaction();
           sesionFactory.save(infoEstudios);
           sesionFactory.save(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
           return true;
        } catch (Exception e) {
            return false;
        }
    }
    
      public boolean updateInfoEstudios(MInfoEstudios infoEstudios, MPersona persona){
          SesionFactory sesionFactory = new SesionFactory();
        try {
           sesionFactory.openTransaction();
           sesionFactory.saveOrUpdate(infoEstudios);
           sesionFactory.saveOrUpdate(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
           return true;
        } catch (Exception e) {
            return false;
        }
     }
}
