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
public class MInfoLaboral implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nombre_empresa;
  private String nombre_jefe;
  private boolean independiente;
  private String oficion;
  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private MPersona persona;

    public MInfoLaboral() {
    }

    public MInfoLaboral(int id, String nombre_empresa, String nombre_jefe, boolean independiente, String oficion, MPersona persona) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.nombre_jefe = nombre_jefe;
        this.independiente = independiente;
        this.oficion = oficion;
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getNombre_jefe() {
        return nombre_jefe;
    }

    public void setNombre_jefe(String nombre_jefe) {
        this.nombre_jefe = nombre_jefe;
    }

    public boolean isIndependiente() {
        return independiente;
    }

    public void setIndependiente(boolean independiente) {
        this.independiente = independiente;
    }

    public String getOficion() {
        return oficion;
    }

    public void setOficion(String oficion) {
        this.oficion = oficion;
    }

    public MPersona getPersona() {
        return persona;
    }

    public void setPersona(MPersona persona) {
        this.persona = persona;
    }
  
  
}
