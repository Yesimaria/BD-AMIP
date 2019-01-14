/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.DatLab;
import Vistas.DatMinis;
import Vistas.DocAnexos;
import Vistas.EstRealizados;
import Vistas.InfIglesia;
import Vistas.InfMatrimonio;
import Vistas.InfOrganizacionPrev;
import Vistas.InfEconomica;
import Vistas.InfPersonal;
import Vistas.Inicio;
import Vistas.Menus;
import dao.DAOPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lib.OpJCalendar;
import modelo.MPersona;
/**
 *
 * @author maike
 */
public class CMenus implements ActionListener {
    Menus vmenus = new Menus();
    Inicio vinicio;
    CInicio cinicio; 
    InfPersonal vpersonal;
    CInfoPersonal cpersonal;
    InfMatrimonio vmatrimonio;
    CMatrimonio cmatrimonio;
    InfOrganizacionPrev vorganizacion;
    COrganizacion corganizacion;
    InfIglesia viglesia;
    CIglesia ciglesia;
    DatLab vlaboral;
    CInfoLaboral claboral;
    DatMinis vministerial;
    CInfoMinisterial cministerial;
    EstRealizados vestudios;
    CEstudios cestudios;
    InfEconomica veconomica;
    CInfoEconomica ceconomica;
    DocAnexos vanexos;
    CDocumentos cdocumentos;
    String codigo;
    public CMenus(Menus vmenus, String codigo) {
        this.vmenus = vmenus;
        this.codigo = codigo;
        vmenus.aggActionListener(this);
        vmenus.setVisible(true);
        System.out.println("click");
      
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equalsIgnoreCase("salir")){
          vinicio = new Inicio();
          cinicio = new CInicio(vinicio);
          vmenus.setVisible(false);
        }
      if(e.getActionCommand().equalsIgnoreCase("infopersonal")){
          vpersonal = new InfPersonal();
           try {
               cpersonal = new CInfoPersonal(vpersonal, codigo);
           } catch (ParseException ex) {
               Logger.getLogger(CMenus.class.getName()).log(Level.SEVERE, null, ex);
           }
          vmenus.setVisible(false);
        }
      if(e.getActionCommand().equalsIgnoreCase("infolaboral")){
           try {
               vlaboral = new DatLab ();
               claboral = new CInfoLaboral(vlaboral, codigo);
               vmenus.setVisible(false);
           } catch (ParseException ex) {
               Logger.getLogger(CMenus.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
           
        if(e.getActionCommand().equalsIgnoreCase("infoministerial")){
          vministerial = new DatMinis ();
          cministerial = new CInfoMinisterial(vministerial, codigo);
          vmenus.setVisible(false);
        }
         if(e.getActionCommand().equalsIgnoreCase("infoestudios")){
          vestudios = new EstRealizados ();
          cestudios = new CEstudios(vestudios, codigo);
          vmenus.setVisible(false);
        }
          if(e.getActionCommand().equalsIgnoreCase(vmenus.getBtnEconomica().getActionCommand())){
           try {
               veconomica = new InfEconomica ();
               ceconomica = new CInfoEconomica(veconomica, codigo);
               vmenus.setVisible(false);
           } catch (ParseException ex) {
               Logger.getLogger(CMenus.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
        if(e.getActionCommand().equalsIgnoreCase(vmenus.getBtnDocAnex().getActionCommand())){
          vanexos= new DocAnexos ();
          cdocumentos= new CDocumentos(vanexos, codigo);
          vmenus.setVisible(false);
        }
         if(e.getActionCommand().equalsIgnoreCase(vmenus.getBtnIglesia().getActionCommand())){
          viglesia= new InfIglesia();
          ciglesia= new CIglesia(viglesia, codigo);
          vmenus.setVisible(false);
        }
         
         if(e.getActionCommand().equalsIgnoreCase(vmenus.getBtnOrganizacion().getActionCommand())){
           try {
               vorganizacion = new InfOrganizacionPrev();
               corganizacion= new COrganizacion(vorganizacion, codigo);
               vmenus.setVisible(false);
           } catch (ParseException ex) {
               Logger.getLogger(CMenus.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
          if(e.getActionCommand().equalsIgnoreCase(vmenus.getBtnMatrimonio().getActionCommand())){
          vmatrimonio= new InfMatrimonio();
          cmatrimonio= new CMatrimonio(vmatrimonio, codigo);
          vmenus.setVisible(false);
        }
         
         
    }
    
}
