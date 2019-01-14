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
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    String codigo;
    
    public CInfoPersonal(InfPersonal vpersonal , String codigo) throws ParseException {
    this.vpersonal = vpersonal;
    this.codigo = codigo;
    vpersonal.aggActionListener(this);
    System.out.println("el codigo" + this.codigo);
    this.cargarDatos(this.codigo);
    vpersonal.setVisible(true);
    daopersona = new DAOPersona();
    }
    
 public String incluirPersona(){
       
        String nombre = vpersonal.getTxtNombres().getText();
        String apellido = vpersonal.getTxtApellidos().getText();
        String codigo = vpersonal.getTxtcodigo().getText();
        String lnacimiento = vpersonal.getTxtLugarNac().getText();
        String fnac = ObtFecha(vpersonal.getTxtFechaNac(), "dd/mm/yyyy");
        String cedula = vpersonal.getTxtxCedula().getText();
        String correo = vpersonal.getTxtCorreo().getText();
        String telefono = vpersonal.getTxtTelefono().getText();
        String fechaIngre = ObtFecha(vpersonal.getFechaIngre(), "dd/mm/yyyy");
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
        this.daopersona = new DAOPersona();
        if(this.codigo!=null){
            persona = daopersona.getPersonaCodigo(codigo);
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setCodigo(codigo);
            persona.setCant_hijos(cantHijos);
            persona.setCorreo(correo);
            persona.setFecha_ingreso(fechaIngre);
            persona.setFecha_nacimiento(fnac);
            persona.setCedula(cedula);
            persona.setEdo_civil(edoCivil);
            persona.setSexo(sexo);
            persona.setLugar_nacimiento(lnacimiento);
            persona.setTelefono(telefono);
        }else{
         persona = new MPersona(codigo, fechaIngre, nombre, apellido, cedula, telefono, correo, fnac, lnacimiento, edoCivil, cantHijos, sexo, null, null, null, null, null, null, null);   
        }
         boolean save = this.daopersona.updatePersona(persona);
        return codigo;
    }

    public void cargarDatos(String codigo) throws ParseException{
        if(codigo!= null){
            SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yyyy");
            Date fechanac = null;
            Date fechaing = null;
            System.out.println("La busqueda en personal");
            this.daopersona = new DAOPersona();
            this.persona = daopersona.getPersonaCodigo(codigo);
            this.vpersonal.getTxtApellidos().setText(this.persona.getApellido());
            this.vpersonal.getTxtNombres().setText(this.persona.getNombre());
            this.vpersonal.getTxtxCedula().setText(this.persona.getCedula());
            this.vpersonal.getTxtcodigo().setText(this.persona.getCodigo());
            this.vpersonal.getTxtCantHijos().setText(String.valueOf(this.persona.getCant_hijos()));
            this.vpersonal.getTxtCorreo().setText(this.persona.getCorreo());
            fechanac = fecha.parse(this.persona.getFecha_nacimiento());
            this.vpersonal.getTxtFechaNac().setDate(fechanac);
            fechaing = fecha.parse(this.persona.getFecha_ingreso());
            this.vpersonal.getFechaIngre().setDate(fechaing);
            this.vpersonal.getRdCasado().setSelected(this.persona.getEdo_civil() == 1 ? true : false);
            this.vpersonal.getRdSoltero().setSelected(this.persona.getEdo_civil() == 0 ? true : false);
            this.vpersonal.getRdMasculino().setSelected(this.persona.getSexo() == 0 ? true : false);
            this.vpersonal.getRdFemenino().setSelected(this.persona.getSexo()== 1 ? true : false);
            this.vpersonal.getTxtLugarNac().setText(this.persona.getLugar_nacimiento());
            this.vpersonal.getTxtTelefono().setText(this.persona.getTelefono());
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand().equalsIgnoreCase("guardar")){
          try {
          String codigo = this.incluirPersona();
          vlaboral= new DatLab();
          persona = daopersona.getPersonaCodigo(codigo);
          vlaboral.getLbnombre().setText(persona.getNombre());
          claboral = new CInfoLaboral(vlaboral, persona.getCodigo());
          System.out.print("incluido exitosamente");
          vpersonal.setVisible(false);
          } catch (Exception ex) {
              System.out.print("Error al intentar incluir: " + ex);
          }
      }
      if(e.getActionCommand().equalsIgnoreCase("cancelar")){
          vmenus= new Menus();
          cmenus = new CMenus(vmenus, codigo);
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
