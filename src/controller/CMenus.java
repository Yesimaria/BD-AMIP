/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.DatLab;
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
   

    public CMenus(Menus vmenus) {
        this.vmenus = vmenus;
        vmenus.aggActionListener(this);
        vmenus.setVisible(true);
        System.out.println("click");
      
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equalsIgnoreCase("salir")){
          vmenus.setVisible(false);
          vinicio = new Inicio();
          cinicio = new CInicio(vinicio);
        }
      if(e.getActionCommand().equalsIgnoreCase("infopersonal")){
          vmenus.setVisible(false);
          vpersonal = new InfPersonal();
          cpersonal = new CInfoPersonal(vpersonal);
        }
      if(e.getActionCommand().equalsIgnoreCase("infolaboral")){
          vmenus.setVisible(false);
          vlaboral = new DatLab ();
          claboral = new CInfoLaboral(vlaboral);
        }
    }
    
}
