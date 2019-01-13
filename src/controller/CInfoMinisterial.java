/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.DatLab;
import Vistas.DatMinis;
import Vistas.EstRealizados;
import Vistas.Menus;
import dao.DAOMinisterial;
import dao.DAOPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import lib.OpJCalendar;
import modelo.MInfoLaboral;
import modelo.MInfoMinisterio;
import modelo.MPersona;

/**
 *
 * @author maike
 */
public class CInfoMinisterial extends OpJCalendar implements ActionListener, KeyListener {

    CMenus cmenus;
    Menus vmenus;
    CInfoLaboral claboral;
    DatLab vlaboral;
    MPersona persona;
    MInfoMinisterio infoministerial;
    DatMinis vministerial;
    DAOMinisterial daoministerial;
    DAOPersona daopersona;
    EstRealizados vestudios;
    CEstudios cestudios;
    String codigo;
    public CInfoMinisterial(DatMinis vministerial, String codigo ) {
        this.vministerial = vministerial;
        vministerial.aggActionListener(this);
        vministerial.setVisible(true);
        this.codigo = codigo; 
    }

     public void incluirDatosMinisterial(String codigo){
         boolean save = false;
         daopersona = new DAOPersona();
          try {
         persona = daopersona.getPersonaCodigo(codigo);
         infoministerial = new MInfoMinisterio();
         infoministerial.setFecha_conversion(ObtFecha(vministerial.getFechaCon(), "dd-mm-yyyy"));
         infoministerial.setFecha_bautismo_agua(ObtFecha(vministerial.getFechaBaut(), "dd-mm-yyyy"));
         infoministerial.setArea_experiencia(vministerial.getTxtExpeMinis().getText());
         infoministerial.setBautismo_espiritu_santo(vministerial.getRdBautizoSi().isSelected() ? vministerial.getRdBautizoSi().isSelected() : false );
         infoministerial.setCargos(vministerial.getTxtCargos().getText());
         infoministerial.setCiudad_departamento(vministerial.getTxtCiudad().getText());
         infoministerial.setEdad_inicio_ministerio(Integer.parseInt(vministerial.getTxtEdadMinis().getText()));
         infoministerial.setGrado_ministerial(vministerial.getTxtGradoMinis().getText());
         infoministerial.setIglesia_organizacion(vministerial.getTxtIgleMinis().getText());
         infoministerial.setLugares_ministerio(vministerial.getTxtEjerMinis().getText());
         persona.setInfoMinisterio(infoministerial);
         infoministerial.setPersona(persona);
         daoministerial = new DAOMinisterial();
         save = this.daoministerial.updateInfoMinisterio(infoministerial, persona);
        } catch (Exception ex) {
         System.out.println(ex);
       System.out.println("error en incluir ministerio 2: " + ex);
        }
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand().equalsIgnoreCase("cancelar")){
          vmenus= new Menus();
          cmenus = new CMenus(vmenus);
          vministerial.setVisible(false);
          
        }
         if(e.getActionCommand().equalsIgnoreCase("guardar")){
         try {
         this.incluirDatosMinisterial(this.codigo);
          vestudios = new EstRealizados();
          cestudios = new CEstudios(vestudios, this.codigo);
           vministerial.setVisible(false);
          System.out.print("incluido exitosamente");
             } catch (Exception ex) {
                   System.out.print("Error al intentar incluir ministerio 1: "+ ex);
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
