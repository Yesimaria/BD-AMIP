/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.InfMatrimonio;
import Vistas.Menus;
import dao.DAOOrganizacion;
import dao.DAOPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.MOrganizacionPrev;
import modelo.MPersona;
import Vistas.InfOrganizacionPrev;

/**
 *
 * @author maike
 */
public class COrganizacion implements ActionListener, KeyListener {
 MPersona persona;
 MOrganizacionPrev organizacion;
 Menus vmenus;
 CMenus cmenus;
 DAOPersona daopersona;
 DAOOrganizacion daoorganizacion;
 InfOrganizacionPrev vorganizacion;
 InfMatrimonio vmatrimonio;
 CMatrimonio cmatrimonio;
 String codigo;
 
    public COrganizacion(InfOrganizacionPrev vorganizacion, String codigo) {
        this.vorganizacion = vorganizacion;
        this.codigo = codigo;
        vorganizacion.aggActionListener(this);
        vorganizacion.setVisible(true);
        
    }
    
   public void incluirDatosOrganizacion(String codigo){
         daopersona = new DAOPersona();
         boolean save = false;
          try {
         persona = daopersona.getPersonaCodigo(codigo);
         System.out.println("la persona en v es: "+ persona.getNombre()+" y el codigo es: "  + persona.getCodigo());
         organizacion = new MOrganizacionPrev();
        
         organizacion.setAnterior_organizacion(vorganizacion.getTxtNombreOrganizacion().getText());
         organizacion.setRecomendacion(vorganizacion.getTxtRecomendacion().getText());
         organizacion.setTelef_organizacion(vorganizacion.getTxtTelefono().getText());
         organizacion.setTelef_recomendacion(vorganizacion.getTxtTelefRecomendacion().getText());
         persona.setOrganizacionPrev(organizacion);
         organizacion.setPersona(persona);
         daoorganizacion = new DAOOrganizacion();
         save = this.daoorganizacion.updateOrganizacionPrev(organizacion, persona);
        } catch (Exception e) {
         System.out.println("error al incluir infoestudios: " + e);
        }
       
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getActionCommand().equalsIgnoreCase("cancelar")){
         
          vmenus= new Menus();
          cmenus = new CMenus(vmenus, codigo);
          vorganizacion.setVisible(false);
        }
         if(e.getActionCommand().equalsIgnoreCase("guardar")){
             try {
           System.out.println("el codigo: "+ codigo);
           this.incluirDatosOrganizacion(codigo);
           vmatrimonio = new InfMatrimonio();
           cmatrimonio = new CMatrimonio(vmatrimonio, codigo);
          System.out.print("incluido exitosamente");
          vorganizacion.setVisible(false);
             } catch (Exception ex) {
                   System.out.print("Error al intentar incluir: "+ ex);
             }
         
         
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
