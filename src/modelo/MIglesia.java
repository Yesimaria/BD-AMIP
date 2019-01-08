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
public class MIglesia implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String direccion_iglesia;
  private String responsable_iglesia;
  private String telef_iglesia;
  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private MPersona persona;

    public MIglesia() {
    }

    public MIglesia(String direccion_iglesia, String responsable_iglesia, String telef_iglesia, MPersona persona) {
       
        this.direccion_iglesia = direccion_iglesia;
        this.responsable_iglesia = responsable_iglesia;
        this.telef_iglesia = telef_iglesia;
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion_iglesia() {
        return direccion_iglesia;
    }

    public void setDireccion_iglesia(String direccion_iglesia) {
        this.direccion_iglesia = direccion_iglesia;
    }

    public String getResponsable_iglesia() {
        return responsable_iglesia;
    }

    public void setResponsable_iglesia(String responsable_iglesia) {
        this.responsable_iglesia = responsable_iglesia;
    }

    public String getTelef_iglesia() {
        return telef_iglesia;
    }

    public void setTelef_iglesia(String telef_iglesia) {
        this.telef_iglesia = telef_iglesia;
    }

    public MPersona getPersona() {
        return persona;
    }

    public void setPersona(MPersona persona) {
        this.persona = persona;
    }
    
}
