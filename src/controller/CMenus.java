/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.DatLab;
import Vistas.DatMinis;
import Vistas.EstRealizados;
import Vistas.InfPersonal;
import Vistas.Inicio;
import Vistas.Menus;
import dao.DAOPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;
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
    DatLab vlaboral;
    CInfoLaboral claboral;
    DatMinis vministerial;
    CInfoMinisterial cministerial;
    EstRealizados vestudios;
    CEstudios cestudios;
    
    public CMenus(Menus vmenus) {
        this.vmenus = vmenus;
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
          cpersonal = new CInfoPersonal(vpersonal, null);
          vmenus.setVisible(false);
        }
      if(e.getActionCommand().equalsIgnoreCase("infolaboral")){
          vlaboral = new DatLab ();
          claboral = new CInfoLaboral(vlaboral, null);
          vmenus.setVisible(false);
        }
      
        if(e.getActionCommand().equalsIgnoreCase("infoministerial")){
          vministerial = new DatMinis ();
          cministerial = new CInfoMinisterial(vministerial, null);
          vmenus.setVisible(false);
        }
         if(e.getActionCommand().equalsIgnoreCase("infoestudios")){
          vestudios = new EstRealizados ();
          cestudios = new CEstudios(vestudios, null);
          vmenus.setVisible(false);
        }
    }
    
}
