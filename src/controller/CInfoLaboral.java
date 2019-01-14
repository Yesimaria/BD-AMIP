/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Vistas.DatLab;
import Vistas.DatMinis;
import Vistas.Menus;
import dao.DAOPersona;
import dao.DAOInfoLaboral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    DatMinis vministerial;
    CInfoMinisterial cministerial;
    String codigo;
    
    public CInfoLaboral(DatLab vlaboral, String codigo) throws ParseException {
    this.vlaboral = vlaboral;
    this.codigo = codigo;
    System.out.println("el codigo en v es: "+ codigo);
    vlaboral.aggActionListener(this);
    vlaboral.setVisible(true);
    this.cargarDatos(codigo);
    
    
    }
    
    public void incluirDatosLaboral(String codigo){
         daopersona = new DAOPersona();
         boolean save = false;
          try {
         persona = daopersona.getPersonaCodigo(codigo);
         System.out.println("la persona en v es: "+ persona.getNombre()+" y el codigo es: "  + persona.getCodigo());
         infolaboral = new MInfoLaboral();
         infolaboral.setNombre_empresa(vlaboral.getTxtNombEmpresa().getText());
         infolaboral.setNombre_jefe(vlaboral.getTxtNomJefe().getText());
         infolaboral.setIndependiente(vlaboral.getRdSi().isSelected() ? vlaboral.getRdSi().isSelected() : false );
         infolaboral.setOficion(vlaboral.getTxtAOficios().getText());
         persona.setInfoLaboral(infolaboral);
         infolaboral.setPersona(persona);
         daolaboral = new DAOInfoLaboral();
         save = this.daolaboral.updateLabora(infolaboral, persona);
        } catch (Exception e) {
         System.out.println("error al incluir infolaboral: " + e);
        }
       
    }
        public void cargarDatos(String codigo) throws ParseException{
        if(codigo!= null){
            System.out.println("La busqueda en personal");
            this.daolaboral = new DAOInfoLaboral();
            this.infolaboral = daopersona.getPersonaCodigo(codigo).getInfoLaboral();
            this.vlaboral.getTxtAOficios().setText(this.infolaboral.getOficion());
            this.vlaboral.getTxtNomJefe().setText(this.infolaboral.getNombre_jefe());
            this.vlaboral.getTxtNombEmpresa().setText(this.infolaboral.getNombre_empresa());
            this.vlaboral.getRdSi().setSelected(this.infolaboral.isIndependiente() ? true : false);
            this.vlaboral.getRdNo().setSelected(this.infolaboral.isIndependiente() ? false : true);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("cancelar")){
         
          vmenus= new Menus();
          cmenus = new CMenus(vmenus, codigo);
          vlaboral.setVisible(false);
        }
         if(e.getActionCommand().equalsIgnoreCase("guardar")){
             try {
           System.out.println("el codigo: "+ codigo);
           this.incluirDatosLaboral(codigo);
           vministerial = new DatMinis();
           cministerial = new CInfoMinisterial(vministerial, codigo);
          System.out.print("incluido exitosamente");
          vlaboral.setVisible(false);
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
