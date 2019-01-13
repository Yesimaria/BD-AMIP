/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.EstRealizados;
import Vistas.InfEconomica;
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
public class CEstudios extends OpJCalendar implements ActionListener, KeyListener {
    
    Menus vmenus;
    CMenus cmenus;
    EstRealizados vestudios;
    MPersona persona;
    MInfoEstudios infoestudios;
    DAOPersona daopersona;
    DAOEstudios daoestudios;
    InfEconomica veconomica;
    CInfoEconomica ceconomica;
    String codigo;
    
    public CEstudios(EstRealizados vestudios, String codigo) {
    this.vestudios = vestudios;
    this.codigo = codigo;
    vestudios.aggActionListener(this);
    vestudios.setVisible(true);
    
    }
      public void incluirDatosEstudios(String codigo){
         daopersona = new DAOPersona();
         boolean save = false;
          try {
         persona = daopersona.getPersonaCodigo(codigo);
         System.out.println("la persona en v es: "+ persona.getNombre()+" y el codigo es: "  + persona.getCodigo());
         infoestudios = new MInfoEstudios();
         infoestudios.setPrimaria_aprobada(vestudios.getRdPrimariaSi().isSelected() ? vestudios.getRdPrimariaSi().isSelected() : false);
         infoestudios.setSecundaria_aprobada(vestudios.getRdSecundariaSi().isSelected() ? vestudios.getRdSecundariaSi().isSelected() : false);
         infoestudios.setUniversidad_aprobada(vestudios.getRdUniversidadSi().isSelected() ? vestudios.getRdUniversidadSi().isSelected() : false);
         infoestudios.setEstudias_teologicos(vestudios.getRdTeologicoSi().isSelected() ? vestudios.getRdTeologicoSi().isSelected() : false);
         infoestudios.setSeminarios_biblicos(vestudios.getRdSeminarioSi().isSelected() ? vestudios.getRdSeminarioSi().isSelected() : false);
         infoestudios.setDireccion_institucion(vestudios.getTxtDirecSeminario().getText());
         infoestudios.setNombre_institucion(vestudios.getTxtInstSemimario().getText());
         infoestudios.setFecha_estudios_teolog(ObtFecha(vestudios.getFechaEstu(), "dd-mm-yyyy"));
         infoestudios.setIdiomas(vestudios.getTxtxIdiomas().getText());
         infoestudios.setUltimo_instituto(vestudios.getTxtUltimoEstud().getText());
         persona.setInfoEstudios(infoestudios);
         infoestudios.setPersona(persona);
         daoestudios = new DAOEstudios();
         save = this.daoestudios.updateInfoEstudios(infoestudios, persona);
        } catch (Exception e) {
         System.out.println("error al incluir infoestudios: " + e);
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

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equalsIgnoreCase("cancelar")){
         
          vmenus= new Menus();
          cmenus = new CMenus(vmenus);
          vestudios.setVisible(false);
        }
         if(e.getActionCommand().equalsIgnoreCase("guardar")){
             try {
           System.out.println("el codigo: "+ codigo);
           this.incluirDatosEstudios(codigo);
           veconomica = new InfEconomica();
           ceconomica = new CInfoEconomica(veconomica, codigo);
          System.out.print("incluido exitosamente");
          vestudios.setVisible(false);
             } catch (Exception ex) {
                   System.out.print("Error al intentar incluir: "+ ex);
             }
         
         
        }
    }
    
}
