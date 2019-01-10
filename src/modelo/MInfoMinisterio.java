/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
/**
 *
 * @author maike
 */
@Entity
public class MInfoMinisterio implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String fecha_conversion;
  private String fecha_bautismo_agua;
  private boolean bautismo_espiritu_santo;
  private int edad_inicio_ministerio;
  private String iglesia_organizacion;
  private String ciudad_departamento;
  private String lugares_ministerio;
  private String cargos;
  private String grado_ministerial;
  private String area_experiencia;
  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private MPersona persona;

    public MInfoMinisterio() {
    }

    public MInfoMinisterio(int id, String fecha_conversion, String fecha_bautismo_agua, boolean bautismo_espiritu_santo, int edad_inicio_ministerio, String iglesia_organizacion, String ciudad_departamento, String lugares_ministerio, String cargos, String grado_ministerial, String area_experiencia, MPersona persona) {
        this.id = id;
        this.fecha_conversion = fecha_conversion;
        this.fecha_bautismo_agua = fecha_bautismo_agua;
        this.bautismo_espiritu_santo = bautismo_espiritu_santo;
        this.edad_inicio_ministerio = edad_inicio_ministerio;
        this.iglesia_organizacion = iglesia_organizacion;
        this.ciudad_departamento = ciudad_departamento;
        this.lugares_ministerio = lugares_ministerio;
        this.cargos = cargos;
        this.grado_ministerial = grado_ministerial;
        this.area_experiencia = area_experiencia;
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_conversion() {
        return fecha_conversion;
    }

    public void setFecha_conversion(String fecha_conversion) {
        this.fecha_conversion = fecha_conversion;
    }

    public String getFecha_bautismo_agua() {
        return fecha_bautismo_agua;
    }

    public void setFecha_bautismo_agua(String fecha_bautismo_agua) {
        this.fecha_bautismo_agua = fecha_bautismo_agua;
    }

    public boolean isBautismo_espiritu_santo() {
        return bautismo_espiritu_santo;
    }

    public void setBautismo_espiritu_santo(boolean bautismo_espiritu_santo) {
        this.bautismo_espiritu_santo = bautismo_espiritu_santo;
    }

    public int getEdad_inicio_ministerio() {
        return edad_inicio_ministerio;
    }

    public void setEdad_inicio_ministerio(int edad_inicio_ministerio) {
        this.edad_inicio_ministerio = edad_inicio_ministerio;
    }

    public String getIglesia_organizacion() {
        return iglesia_organizacion;
    }

    public void setIglesia_organizacion(String iglesia_organizacion) {
        this.iglesia_organizacion = iglesia_organizacion;
    }

    public String getCiudad_departamento() {
        return ciudad_departamento;
    }

    public void setCiudad_departamento(String ciudad_departamento) {
        this.ciudad_departamento = ciudad_departamento;
    }

    public String getLugares_ministerio() {
        return lugares_ministerio;
    }

    public void setLugares_ministerio(String lugares_ministerio) {
        this.lugares_ministerio = lugares_ministerio;
    }

    public String getCargos() {
        return cargos;
    }

    public void setCargos(String cargos) {
        this.cargos = cargos;
    }

    public String getGrado_ministerial() {
        return grado_ministerial;
    }

    public void setGrado_ministerial(String grado_ministerial) {
        this.grado_ministerial = grado_ministerial;
    }

    public String getArea_experiencia() {
        return area_experiencia;
    }

    public void setArea_experiencia(String area_experiencia) {
        this.area_experiencia = area_experiencia;
    }

    public MPersona getPersona() {
        return persona;
    }

    public void setPersona(MPersona persona) {
        this.persona = persona;
    }
  
  
}
