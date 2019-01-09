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
public class MInfoEconomica implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private boolean dependen_economica;    
  private String nombre_hijos;
  private String nombre_seguro;
  private String nivel;
  private boolean pensionado;
  private String nombre_empresa;
  private boolean casa;
  private String estrato;
  private String direccion;
  private String telefono_fijo;
  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private MPersona persona;

    public MInfoEconomica() {
    }

    public MInfoEconomica(int id, boolean dependen_economica, String nombre_hijos, String nombre_seguro, String nivel, boolean pensionado, String nombre_empresa, boolean casa, String estrato, String direccion, String telefono_fijo, MPersona persona) {
        this.id = id;
        this.dependen_economica = dependen_economica;
        this.nombre_hijos = nombre_hijos;
        this.nombre_seguro = nombre_seguro;
        this.nivel = nivel;
        this.pensionado = pensionado;
        this.nombre_empresa = nombre_empresa;
        this.casa = casa;
        this.estrato = estrato;
        this.direccion = direccion;
        this.telefono_fijo = telefono_fijo;
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDependen_economica() {
        return dependen_economica;
    }

    public void setDependen_economica(boolean dependen_economica) {
        this.dependen_economica = dependen_economica;
    }

    public String getNombre_hijos() {
        return nombre_hijos;
    }

    public void setNombre_hijos(String nombre_hijos) {
        this.nombre_hijos = nombre_hijos;
    }

    public String getNombre_seguro() {
        return nombre_seguro;
    }

    public void setNombre_seguro(String nombre_seguro) {
        this.nombre_seguro = nombre_seguro;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public boolean isPensionado() {
        return pensionado;
    }

    public void setPensionado(boolean pensionado) {
        this.pensionado = pensionado;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public boolean isCasa() {
        return casa;
    }

    public void setCasa(boolean casa) {
        this.casa = casa;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public MPersona getPersona() {
        return persona;
    }

    public void setPersona(MPersona persona) {
        this.persona = persona;
    }
  
  
}
