/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.MPersona;
import modelo.MInfoDocumentos;
import hibernate.SesionFactory;
/**
 *
 * @author Usuario
 */
public class DAODocumentos {
    
    public boolean saveInfoDocumentos(MInfoDocumentos infoDocumentos, MPersona persona){
      SesionFactory sesionFactory = new SesionFactory();
        try {
           sesionFactory.openTransaction();
           sesionFactory.save(infoDocumentos);
           sesionFactory.save(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
           return true;
        } catch (Exception e) {
            return false;
        }
    }
    
      public boolean updateInfoDocumentos(MInfoDocumentos infoDocumentos, MPersona persona){
          SesionFactory sesionFactory = new SesionFactory();
        try {
           sesionFactory.openTransaction();
           sesionFactory.saveOrUpdate(infoDocumentos);
           sesionFactory.saveOrUpdate(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
           return true;
        } catch (Exception e) {
            return false;
        }
     }
}
