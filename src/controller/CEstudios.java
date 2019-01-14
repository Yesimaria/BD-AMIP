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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
            this.cargarDatos(codigo);
        } catch (ParseException ex) {
            Logger.getLogger(CEstudios.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        public void cargarDatos(String codigo) throws ParseException{
        if(codigo!= null){
            SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");
            Date fechaEstu = null;
            System.out.println("La busqueda en personal");
            this.daoestudios = new DAOEstudios();
            this.infoestudios = daopersona.getPersonaCodigo(codigo).getInfoEstudios();
            this.vestudios.getTxtDirecSeminario().setText(this.infoestudios.isDireccion_institucion());
            this.vestudios.getTxtInstSemimario().setText(this.infoestudios.getNombre_institucion());
            this.vestudios.getTxtUltimoEstud().setText(this.infoestudios.getUltimo_instituto());
            this.vestudios.getTxtxIdiomas().setText(this.infoestudios.getIdiomas());
            fechaEstu = fecha.parse(this.infoestudios.getFecha_estudios_teolog());
            this.vestudios.getFechaEstu().setDate(fechaEstu);
            this.vestudios.getRdPrimariaSi().setSelected(this.infoestudios.isPrimaria_aprobada() ? true : false);
            this.vestudios.getRdPrimariaNo().setSelected(this.infoestudios.isPrimaria_aprobada() ? false : true);
            this.vestudios.getRdSecundariaSi().setSelected(this.infoestudios.isSecundaria_aprobada() ? true : false);
            this.vestudios.getRdSecundariaNo().setSelected(this.infoestudios.isSecundaria_aprobada() ? false : true);
            this.vestudios.getRdSeminarioSi().setSelected(this.infoestudios.isSeminarios_biblicos() ? true : false);
            this.vestudios.getRdSeminarioNo().setSelected(this.infoestudios.isSeminarios_biblicos() ? false : true);
            this.vestudios.getRdTeologicoSi().setSelected(this.infoestudios.isEstudias_teologicos() ? true : false);
            this.vestudios.getRdTeologicoNo().setSelected(this.infoestudios.isEstudias_teologicos() ? false : true);
            this.vestudios.getRdUniversidadSi().setSelected(this.infoestudios.isUniversidad_aprobada() ? true : false);
            this.vestudios.getRdUniversidadNo().setSelected(this.infoestudios.isUniversidad_aprobada() ? false : true);
            
            
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
          cmenus = new CMenus(vmenus, codigo);
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
