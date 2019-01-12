/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.EstRealizados;
import Vistas.Menus;
import dao.DAOPersona;
import dao.DAOEstudios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import lib.OpJCalendar;
import modelo.MPersona;
import modelo.MInfoEstudios;
/**
 *
 * @author Usuario
 */
public class CEstudios implements ActionListener, KeyListener {
    
    Menus vmenus;
    CMenus cmenus;
    EstRealizados vestudios;
    MPersona persona;
    MInfoEstudios infoestudios;
    DAOPersona daopersona;
    DAOEstudios daoestudios;
    String codigo;
    public CEstudios(EstRealizados vestudios) {
    this.vestudios = vestudios;
    vestudios.aggActionListener(this);
    vestudios.setVisible(true);
    this.codigo = "yeret2";
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
