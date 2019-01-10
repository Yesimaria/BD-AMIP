/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import lib.OpJCalendar;
import Vistas.Inicio;
import Vistas.Menus;
import Vistas.Principal;
import controller.CMenus;

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
            vmenus = new Menus();
            cmenus = new CMenus(this.vmenus);
            vinicio.setVisible(false);
        }
        if(e.getActionCommand().equalsIgnoreCase("consulta")){
              System.out.println("click");
            vprincipal = new Principal();
            
        }
    }
}
