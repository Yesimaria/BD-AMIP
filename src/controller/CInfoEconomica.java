/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Vistas.InfEconomica;
import Vistas.InfOrganizacionPrev;
import Vistas.Menus;
import dao.DAOEconomica;
import dao.DAOPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import modelo.MInfoEconomica;
import modelo.MPersona;

/**
 *
 * @author maike
 */
public class CInfoEconomica implements ActionListener, KeyListener {
    MPersona persona;
    MInfoEconomica infoEconomica;
    
    Menus vmenus;
    CMenus cmenus;
    DAOPersona daopersona;
    DAOEconomica daoeconomica;
    InfEconomica veconomica;
    InfOrganizacionPrev vorganizacion;
    COrganizacion corganizacion;
    String codigo;
    
    public CInfoEconomica(InfEconomica veconomica, String codigo ) throws ParseException {
      this.veconomica = veconomica;
      this.codigo = codigo;
        veconomica.aggActionListener(this);
      this.cargarDatos(codigo);
       veconomica.setVisible(true);
    }
    
      public void incluirDatosEconomica(String codigo){
         daopersona = new DAOPersona();
         boolean save = false;
          try {
         persona = daopersona.getPersonaCodigo(codigo);
         System.out.println("la persona en v es: "+ persona.getNombre()+" y el codigo es: "  + persona.getCodigo());
         infoEconomica = new MInfoEconomica();
         infoEconomica.setCasa(veconomica.getRdCasaSi().isSelected() ? veconomica.getRdCasaSi().isSelected() : false);
         infoEconomica.setDependen_economica(veconomica.getRdDependenSi().isSelected() ? veconomica.getRdDependenSi().isSelected() : false);
         infoEconomica.setPensionado(veconomica.getRdPensionSi().isSelected() ? veconomica.getRdPensionSi().isSelected() : false);
         infoEconomica.setDireccion(veconomica.getTxtDireccion().getText());
         infoEconomica.setEstrato(veconomica.getTxtEstrato().getText());
         infoEconomica.setNivel(veconomica.getTxtNivel().getText());
         infoEconomica.setNombre_empresa(veconomica.getTxtNombreEmpresa().getText());
         infoEconomica.setNombre_hijos(veconomica.getTxtHijos().getText());
         infoEconomica.setNombre_seguro(veconomica.getTxtNombreSeguro().getText());
         infoEconomica.setTelefono_fijo(veconomica.getTxtTelefono().getText());
         persona.setInfoEconomica(infoEconomica);
         infoEconomica.setPersona(persona);
         daoeconomica = new DAOEconomica();
         save = this.daoeconomica.updateInfoEconomica(infoEconomica, persona);
        } catch (Exception e) {
         System.out.println("error al incluir infoestudios: " + e);
        }
       
    }
        public void cargarDatos(String codigo) throws ParseException{
       daopersona = new DAOPersona();
         this.infoEconomica = daopersona.getPersonaCodigo(codigo).getInfoEconomica();
        if(this.infoEconomica instanceof MInfoEconomica){
            System.out.println("La busqueda en personal");
            this.daoeconomica = new DAOEconomica();
            this.veconomica.getTxtDireccion().setText(this.infoEconomica.getDireccion());
            this.veconomica.getTxtEstrato().setText(this.infoEconomica.getEstrato());
            this.veconomica.getTxtHijos().setText(this.infoEconomica.getNombre_hijos());
            this.veconomica.getTxtNivel().setText(this.infoEconomica.getNivel());
            this.veconomica.getTxtNombreEmpresa().setText(this.infoEconomica.getNombre_empresa());
            this.veconomica.getTxtNombreSeguro().setText(this.infoEconomica.getNombre_seguro());
            this.veconomica.getTxtTelefono().setText(this.infoEconomica.getTelefono_fijo());
            this.veconomica.getRdCasaSi().setSelected(this.infoEconomica.isCasa() ? true : false);
            this.veconomica.getRdCasaNo().setSelected(this.infoEconomica.isCasa() ? false : true);
            this.veconomica.getRdDependenSi().setSelected(this.infoEconomica.isDependen_economica() ? true : false);
            this.veconomica.getRdDependenNo().setSelected(this.infoEconomica.isDependen_economica() ? false : true);
            this.veconomica.getRdPensionSi().setSelected(this.infoEconomica.isPensionado() ? true : false);
            this.veconomica.getRdPensionNo().setSelected(this.infoEconomica.isPensionado() ? false : true);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand().equalsIgnoreCase("cancelar")){
         
          vmenus= new Menus();
          cmenus = new CMenus(vmenus, codigo);
          veconomica.setVisible(false);
        }
         if(e.getActionCommand().equalsIgnoreCase("guardar")){
             try {
           System.out.println("el codigo: "+ codigo);
           this.incluirDatosEconomica(codigo);
           vorganizacion = new InfOrganizacionPrev() ;
           corganizacion = new COrganizacion(vorganizacion, codigo);
          System.out.print("incluido exitosamente");
          veconomica.setVisible(false);
             } catch (Exception ex) {
                   System.out.print("Error al intentar incluir: "+ ex);
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
