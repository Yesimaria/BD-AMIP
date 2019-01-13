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
public class MInfoEstudios implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private boolean primaria_aprobada;
  private boolean secundaria_aprobada;
  private boolean universidad_aprobada;
  private String ultimo_instituto;
  private boolean estudias_teologicos;
  private String fecha_estudios_teolog;
  private boolean seminarios_biblicos;
  private String nombre_institucion;
  private String direccion_institucion;
  private String idiomas;
  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private MPersona persona;

    public MInfoEstudios() {
    }

    public MInfoEstudios(int id, boolean primaria_aprobada, boolean secundaria_aprobada, boolean universidad_aprobada, String ultimo_instituto, boolean estudias_teologicos, String fecha_estudios_teolog, boolean seminarios_biblicos, String nombre_institucion, String direccion_institucion, String idiomas, MPersona persona) {
        this.id = id;
        this.primaria_aprobada = primaria_aprobada;
        this.secundaria_aprobada = secundaria_aprobada;
        this.universidad_aprobada = universidad_aprobada;
        this.ultimo_instituto = ultimo_instituto;
        this.estudias_teologicos = estudias_teologicos;
        this.fecha_estudios_teolog = fecha_estudios_teolog;
        this.seminarios_biblicos = seminarios_biblicos;
        this.nombre_institucion = nombre_institucion;
        this.direccion_institucion = direccion_institucion;
        this.idiomas = idiomas;
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPrimaria_aprobada() {
        return primaria_aprobada;
    }

    public void setPrimaria_aprobada(boolean primaria_aprobada) {
        this.primaria_aprobada = primaria_aprobada;
    }

    public boolean isSecundaria_aprobada() {
        return secundaria_aprobada;
    }

    public void setSecundaria_aprobada(boolean secundaria_aprobada) {
        this.secundaria_aprobada = secundaria_aprobada;
    }

    public boolean isUniversidad_aprobada() {
        return universidad_aprobada;
    }

    public void setUniversidad_aprobada(boolean universidad_aprobada) {
        this.universidad_aprobada = universidad_aprobada;
    }

    public String getUltimo_instituto() {
        return ultimo_instituto;
    }

    public void setUltimo_instituto(String ultimo_instituto) {
        this.ultimo_instituto = ultimo_instituto;
    }

    public boolean isEstudias_teologicos() {
        return estudias_teologicos;
    }

    public void setEstudias_teologicos(boolean estudias_teologicos) {
        this.estudias_teologicos = estudias_teologicos;
    }

    public String getFecha_estudios_teolog() {
        return fecha_estudios_teolog;
    }

    public void setFecha_estudios_teolog(String fecha_estudios_teolog) {
        this.fecha_estudios_teolog = fecha_estudios_teolog;
    }

    public boolean isSeminarios_biblicos() {
        return seminarios_biblicos;
    }

    public void setSeminarios_biblicos(boolean seminarios_biblicos) {
        this.seminarios_biblicos = seminarios_biblicos;
    }

    public String getNombre_institucion() {
        return nombre_institucion;
    }

    public void setNombre_institucion(String nombre_institucion) {
        this.nombre_institucion = nombre_institucion;
    }

    public String isDireccion_institucion() {
        return direccion_institucion;
    }

    public void setDireccion_institucion(String direccion_institucion) {
        this.direccion_institucion = direccion_institucion;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public MPersona getPersona() {
        return persona;
    }

    public void setPersona(MPersona persona) {
        this.persona = persona;
    }
  
  
  
}
