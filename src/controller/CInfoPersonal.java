/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Vistas.DatLab;
import Vistas.InfPersonal;
import Vistas.Menus;
import dao.DAOPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import lib.OpJCalendar;
import modelo.MPersona;
/**
 *
 * @author maike
 */
public class CInfoPersonal extends OpJCalendar implements ActionListener, KeyListener {

    Menus vmenus;
    CMenus cmenus;
    DatLab vlaboral;
    CInfoLaboral claboral;
    InfPersonal vpersonal;
    MPersona persona;
    DAOPersona daopersona;
    
    public CInfoPersonal(InfPersonal vpersonal , String codigo) {
    this.vpersonal = vpersonal;
    vpersonal.aggActionListener(this);
    vpersonal.setVisible(true);
    }
    
 public String incluirPersona(){
       
        String nombre = vpersonal.getTxtNombres().getText();
        String apellido = vpersonal.getTxtApellidos().getText();
        String codigo = vpersonal.getTxtcodigo().getText();
        String lnacimiento = vpersonal.getTxtLugarNac().getText();
        String fnac = ObtFecha(vpersonal.getTxtFechaNac(), "dd-mm-yyyy");
        String cedula = vpersonal.getTxtxCedula().getText();
        String correo = vpersonal.getTxtCorreo().getText();
        String telefono = vpersonal.getTxtTelefono().getText();
        String fechaIngre = ObtFecha(vpersonal.getFechaIngre(), "dd-mm-yyyy");
        int cantHijos = Integer.parseInt(vpersonal.getTxtCantHijos().getText().trim());
        boolean sexoM = vpersonal.getRdMasculino().isSelected();
        boolean sexoF = vpersonal.getRdFemenino().isSelected();
        int sexo = 0;
        if(sexoM){
            sexo = 0;
        }else{
            sexo = 1;
        }
        boolean edoC = vpersonal.getRdCasado().isSelected();
        boolean edoS = vpersonal.getRdSoltero().isSelected();
        int edoCivil = 0;
        if(edoC){
            edoCivil = 1;
        }else{
            edoCivil = 0;
        }
         persona = new MPersona(codigo, fechaIngre, nombre, apellido, cedula, telefono, correo, fnac, lnacimiento, edoCivil, cantHijos, sexo, null, null, null, null, null, null, null);
         this.daopersona = new DAOPersona();
         boolean save = this.daopersona.savePersona(persona);
        return codigo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand().equalsIgnoreCase("guardar")){
     
          try {
          String codigo = this.incluirPersona();
          vlaboral= new DatLab();
          persona = daopersona.getPersonaCodigo(codigo);
          vlaboral.getLbnombre().setText(persona.getNombre());
          System.out.println("el codigo 1 es :" + codigo+"  el codigo 2 es :" + persona.getNombre());
          claboral = new CInfoLaboral(vlaboral, persona.getCodigo());
          System.out.print("incluido exitosamente");
          vpersonal.setVisible(false);
          } catch (Exception ex) {
              System.out.print("Error al intentar incluir: " + ex);
          }
      }
      if(e.getActionCommand().equalsIgnoreCase("cancelar")){
          vmenus= new Menus();
          cmenus = new CMenus(vmenus);
          vpersonal.setVisible(false);
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
