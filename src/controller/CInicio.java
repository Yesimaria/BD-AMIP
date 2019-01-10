/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.Inicio;
import Vistas.Menus;
import Vistas.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import lib.OpJCalendar;

/**
 *
 * @author maike
 */
public class CInicio implements ActionListener {
    
    Inicio vinicio;
    Menus vmenus;
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
            System.out.println("click");
            this.vmenus = new Menus();
            
        }
        if(e.getActionCommand().equalsIgnoreCase("consulta")){
              System.out.println("click");
            this.vprincipal = new Principal();
            
        }
    }
}
