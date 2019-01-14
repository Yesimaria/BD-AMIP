/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.InfIglesia;
import Vistas.InfMatrimonio;
import Vistas.Menus;
import dao.DAOMatrimonio;
import dao.DAOPersona;
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
import modelo.MMatrimonio;
import modelo.MPersona;

/**
 *
 * @author maike
 */
public class CMatrimonio extends OpJCalendar implements ActionListener, KeyListener {

    MPersona persona;
    DAOPersona daopersona;
    MMatrimonio matrimonio;
    DAOMatrimonio daomatrimonio;
    CMenus cmenus;
    Menus vmenus;
    InfMatrimonio vmatrimonio;
     InfIglesia viglesia;
     CIglesia ciglesia;
    String codigo;

    public CMatrimonio(InfMatrimonio vmatrimonio, String codigo) {
        this.vmatrimonio = vmatrimonio;
        this.codigo = codigo;
        vmatrimonio.aggActionListener(this);
       
        try {
            this.cargarDatos(codigo);
        } catch (ParseException ex) {
            Logger.getLogger(CMatrimonio.class.getName()).log(Level.SEVERE, null, ex);
        }
         vmatrimonio.setVisible(true);
    }

    public void incluirDatosMatrimonio(String codigo) {
        daopersona = new DAOPersona();
        boolean save = false;
        try {
            persona = daopersona.getPersonaCodigo(codigo);
            System.out.println("la persona en v es: " + persona.getNombre() + " y el codigo es: " + persona.getCodigo());
            matrimonio = new MMatrimonio();
            matrimonio.setNombre(vmatrimonio.getTxtNombre().getText());
            matrimonio.setApellido(vmatrimonio.getTxtApellidos().getText());
            matrimonio.setCedula(vmatrimonio.getTxtCedula().getText());
            matrimonio.setCorreo(vmatrimonio.getTxtCorreo().getText());
            matrimonio.setLugar_nacimiento(vmatrimonio.getTxtLugarNac().getText());
            matrimonio.setTelefono(vmatrimonio.getTxtTelefono().getText());
            matrimonio.setFecha_nacimiento(ObtFecha(vmatrimonio.getFechaMatri(), "dd/mm/yyyy"));
            persona.setMatrimonio(matrimonio);
            matrimonio.setPersona(persona);
            daomatrimonio = new DAOMatrimonio();
            save = this.daomatrimonio.updateMatrimonio(matrimonio, persona);
        } catch (Exception e) {
            System.out.println("error al incluir infoestudios: " + e);
        }

    }
        public void cargarDatos(String codigo) throws ParseException{
         daopersona = new DAOPersona();
          this.matrimonio = daopersona.getPersonaCodigo(codigo).getMatrimonio();
        if(this.matrimonio instanceof MMatrimonio){
            SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yyyy");
            Date fechaMatri = null;
            System.out.println("La busqueda en personal");
            this.daomatrimonio = new DAOMatrimonio();
            this.vmatrimonio.getTxtApellidos().setText(this.matrimonio.getApellido());
            this.vmatrimonio.getTxtCedula().setText(this.matrimonio.getCedula());
            this.vmatrimonio.getTxtCorreo().setText(this.matrimonio.getCorreo());
            this.vmatrimonio.getTxtLugarNac().setText(this.matrimonio.getLugar_nacimiento());
            this.vmatrimonio.getTxtNombre().setText(this.matrimonio.getNombre());
            this.vmatrimonio.getTxtTelefono().setText(this.matrimonio.getTelefono());
            fechaMatri = fecha.parse(this.matrimonio.getFecha_nacimiento());
            this.vmatrimonio.getFechaMatri().setDate(fechaMatri);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("cancelar")) {

            vmenus = new Menus();
            cmenus = new CMenus(vmenus, codigo);
            vmatrimonio.setVisible(false);
        }
        if (e.getActionCommand().equalsIgnoreCase("guardar")) {
            try {
                System.out.println("el codigo: " + codigo);
                this.incluirDatosMatrimonio(codigo);
                viglesia = new InfIglesia();
                ciglesia = new CIglesia(viglesia, codigo);
                System.out.print("incluido exitosamente");
                vmatrimonio.setVisible(false);
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
