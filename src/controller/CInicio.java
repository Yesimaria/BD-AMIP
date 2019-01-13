/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import Vistas.Consultar;
import Vistas.InfPersonal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import lib.OpJCalendar;
import Vistas.Inicio;
import Vistas.Menus;
import Vistas.Principal;
import controller.CMenus;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maike
 */
public class CInicio implements ActionListener {
    
    Inicio vinicio;
    Menus vmenus;
    CMenus cmenus;
    Principal vprincipal;
    OpJCalendar c;
    InfPersonal vpersonal;
    CInfoPersonal cpersonal;
    CConsulta cconsulta;
    Consultar vconsulta;
    
    public CInicio(Inicio vinicio){
        Date fechaac = new Date();
        c = new OpJCalendar();
        this.vinicio = vinicio;
        vinicio.aggActionListener(this);
        vinicio.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("incluir")){
          vpersonal = new InfPersonal();
            try {
                cpersonal = new CInfoPersonal(vpersonal, null);
                vinicio.setVisible(false);
            } catch (ParseException ex) {
                Logger.getLogger(CInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        if(e.getActionCommand().equalsIgnoreCase(vinicio.getBtnConsultar().getActionCommand())){
            vconsulta = new Consultar();
            cconsulta = new CConsulta(vconsulta);
            vinicio.setVisible(false); 
        }
    }
}
