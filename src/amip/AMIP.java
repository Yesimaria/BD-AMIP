/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amip;
import modelo.MPersona;
import hibernate.SesionFactory;
/**
 *
 * @author Usuario
 */
public class AMIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        SesionFactory sesionFactory = new SesionFactory();
        
        MPersona persona = new MPersona();
        sesionFactory.openTransaction();
           persona.setNombre("maiker");
           persona.setApellido("Gutierrez");
           persona.setCedula("21503775");
           sesionFactory.save(persona);
           sesionFactory.closeTransaction();
           sesionFactory.closeSession();
    
    }
}
