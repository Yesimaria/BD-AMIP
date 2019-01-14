/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.DocAnexos;
import Vistas.InfIglesia;
import Vistas.Menus;
import dao.DAOIglesia;
import dao.DAOPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.MIglesia;
import modelo.MPersona;

/**
 *
 * @author maike
 */


public class CIglesia implements ActionListener, KeyListener {

    MPersona persona;
    DAOPersona daopersona;
    MIglesia iglesia;
    DAOIglesia daoiglesia;
    CMenus cmenus;
    Menus vmenus;
    DocAnexos vanexos;
    CDocumentos cdocumentos;
    InfIglesia viglesia;
    String codigo;
    
    public CIglesia(InfIglesia viglesia, String codigo) {
        this.viglesia = viglesia;
        this.codigo = codigo;
        viglesia.aggActionListener(this);
        viglesia.setVisible(true);
    }
    
     public void incluirDatosIglesia(String codigo){
         daopersona = new DAOPersona();
         boolean save = false;
          try {
         persona = daopersona.getPersonaCodigo(codigo);
         System.out.println("la persona en v es: "+ persona.getNombre()+" y el codigo es: "  + persona.getCodigo());
         iglesia = new MIglesia();
         iglesia.setDireccion_iglesia(viglesia.getTxtDireccion().getText());
         iglesia.setResponsable_iglesia(viglesia.getTxtResponsable().getText());
         iglesia.setTelef_iglesia(viglesia.getTxtTelefono().getText());
         persona.setIglesia(iglesia);
         iglesia.setPersona(persona);
         daoiglesia = new DAOIglesia();
         save = this.daoiglesia.updateIglesia(iglesia, persona);
        } catch (Exception e) {
         System.out.println("error al incluir infoestudios: " + e);
        }
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
 if (e.getActionCommand().equalsIgnoreCase("cancelar")) {

            vmenus = new Menus();
            cmenus = new CMenus(vmenus, codigo);
            viglesia.setVisible(false);
        }
        if (e.getActionCommand().equalsIgnoreCase("guardar")) {
            try {
                System.out.println("el codigo: " + codigo);
                this.incluirDatosIglesia(this.codigo);
                DocAnexos vanexo = new DocAnexos();
                CDocumentos cdocumentos = new CDocumentos(vanexo, this.codigo);
                System.out.print("incluido exitosamente");
                viglesia.setVisible(false);
            } catch (Exception ex) {
                System.out.print("Error al intentar incluir: " + ex);
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
