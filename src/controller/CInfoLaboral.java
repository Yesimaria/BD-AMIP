/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Vistas.DatLab;
import Vistas.Menus;
import dao.DAOPersona;
import dao.DAOInfoLaboral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import lib.OpJCalendar;
import modelo.MPersona;
import modelo.MInfoLaboral;
/**
 *
 * @author maike
 */
public class CInfoLaboral implements ActionListener, KeyListener {
    
    Menus vmenus;
    CMenus cmenus;
    DatLab vlaboral;
    MPersona persona;
    MInfoLaboral infolaboral;
    DAOPersona daopersona;
    DAOInfoLaboral daolaboral;
    String codigo;
    public CInfoLaboral(DatLab vlaboral) {
    this.vlaboral = vlaboral;
    vlaboral.aggActionListener(this);
    vlaboral.setVisible(true);
    this.codigo = "yeret2";
    }
    
    public boolean incluirDatosLaboral(String codigo){
         daopersona = new DAOPersona();
         boolean save;
         System.out.print("test"+ " " + daopersona.getPersonaCodigo(codigo).getInfoLaboral().getNombre_empresa());
         try {
         persona = daopersona.getPersonaCodigo(codigo);
         infolaboral = daopersona.getPersonaCodigo(codigo).getInfoLaboral();
         infolaboral.setNombre_empresa(vlaboral.getTxtNombEmpresa().getText());
         infolaboral.setNombre_jefe(vlaboral.getTxtNomJefe().getText());
         infolaboral.setIndependiente(vlaboral.getRdSi().isSelected() ? vlaboral.getRdSi().isSelected() : false );
         infolaboral.setOficion(vlaboral.getTxtAOficios().getText());
         persona.setInfoLaboral(infolaboral);
         infolaboral.setPersona(persona);
         daolaboral = new DAOInfoLaboral();
         save = this.daolaboral.updatePersona(infolaboral, persona);
        } catch (Exception e) {
         infolaboral = new MInfoLaboral();
         persona = new MPersona();
         infolaboral.setNombre_empresa(vlaboral.getTxtNombEmpresa().getText());
         infolaboral.setNombre_jefe(vlaboral.getTxtNomJefe().getText());
         infolaboral.setIndependiente(vlaboral.getRdSi().isSelected() ? vlaboral.getRdSi().isSelected() : false );
         infolaboral.setOficion(vlaboral.getTxtAOficios().getText());
         persona.setInfoLaboral(infolaboral);
          infolaboral.setPersona(persona);
         daolaboral = new DAOInfoLaboral();
         save = this.daolaboral.updatePersona(infolaboral, persona);
        }
        
        return save;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("cancelar")){
          vlaboral.setVisible(false);
          vmenus= new Menus();
          cmenus = new CMenus(vmenus);
          
        }
         if(e.getActionCommand().equalsIgnoreCase("guardar")){
          boolean save = this.incluirDatosLaboral(codigo);
          if(save){
          vlaboral.setVisible(false);
          vmenus= new Menus();
          cmenus = new CMenus(vmenus);
          System.out.print("incluido exitosamente");
          }else{
              System.out.print("Error al intentar incluir");
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
