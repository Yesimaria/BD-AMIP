/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author maike
 */

@Entity
public class MPersona implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nombre;
  private String apellido;
  private String cedula;
  private String telefono;
  private String correo;
  private String fecha_nacimiento;
  private String lugar_nacimiento;
   private int edo_civil;
  private int cant_hijos;
  private int sexo; 
  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private MMatrimonio matrimonio;
  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private MInfoEconomica infoEconomica;
  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private MOrganizacionPrev organizacionPrev;
  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private MIglesia iglesia;
 

    public MPersona() {
        
    }

    public MPersona(String nombre, String apellido, String cedula, String telefono, String correo, String fecha_nacimiento, String lugar_nacimiento, int edo_civil, int cant_hijos, int sexo, MMatrimonio matrimonio, MInfoEconomica infoEconomica, MOrganizacionPrev organizacionPrev, MIglesia iglesia) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.lugar_nacimiento = lugar_nacimiento;
        this.edo_civil = edo_civil;
        this.cant_hijos = cant_hijos;
        this.sexo = sexo;
        this.matrimonio = matrimonio;
        this.infoEconomica = infoEconomica;
        this.organizacionPrev = organizacionPrev;
        this.iglesia = iglesia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public int getEdo_civil() {
        return edo_civil;
    }

    public void setEdo_civil(int edo_civil) {
        this.edo_civil = edo_civil;
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public MMatrimonio getMatrimonio() {
        return matrimonio;
    }

    public void setMatrimonio(MMatrimonio matrimonio) {
        this.matrimonio = matrimonio;
    }

    public MInfoEconomica getInfoEconomica() {
        return infoEconomica;
    }

    public void setInfoEconomica(MInfoEconomica infoEconomica) {
        this.infoEconomica = infoEconomica;
    }

    public MOrganizacionPrev getOrganizacionPrev() {
        return organizacionPrev;
    }

    public void setOrganizacionPrev(MOrganizacionPrev organizacionPrev) {
        this.organizacionPrev = organizacionPrev;
    }

    public MIglesia getIglesia() {
        return iglesia;
    }

    public void setIglesia(MIglesia iglesia) {
        this.iglesia = iglesia;
    }

  

}
