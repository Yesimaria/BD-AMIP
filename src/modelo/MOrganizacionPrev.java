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
public class MOrganizacionPrev implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String anterior_organizacion;
  private String telef_organizacion;
  private String recomendacion;
  private String telef_recomendacion;
  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private MPersona persona;

    public MOrganizacionPrev() {
    }

    public MOrganizacionPrev(String anterior_organizacion, String telef_organizacion, String recomendacion, String telef_recomendacion, MPersona persona) {
        this.id = id;
        this.anterior_organizacion = anterior_organizacion;
        this.telef_organizacion = telef_organizacion;
        this.recomendacion = recomendacion;
        this.telef_recomendacion = telef_recomendacion;
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnterior_organizacion() {
        return anterior_organizacion;
    }

    public void setAnterior_organizacion(String anterior_organizacion) {
        this.anterior_organizacion = anterior_organizacion;
    }

    public String getTelef_organizacion() {
        return telef_organizacion;
    }

    public void setTelef_organizacion(String telef_organizacion) {
        this.telef_organizacion = telef_organizacion;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getTelef_recomendacion() {
        return telef_recomendacion;
    }

    public void setTelef_recomendacion(String telef_recomendacion) {
        this.telef_recomendacion = telef_recomendacion;
    }

    public MPersona getPersona() {
        return persona;
    }

    public void setPersona(MPersona persona) {
        this.persona = persona;
    }
  
  
}
