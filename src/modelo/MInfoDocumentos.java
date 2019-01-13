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
import org.hibernate.type.descriptor.java.BinaryStreamImpl;
/**
 *
 * @author maike
 */
@Entity
public class MInfoDocumentos implements Serializable  {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private byte[] copiaCedula;
    private byte[] copiadiploma;
    private byte[] referenciaLaboral;
    private byte[] referenciaPersonal;
    private byte[] referenciaFamiliar;
    private byte[] copiaCredencial;
    private byte[] copiaActaMatri;
    private byte[] copiaCedulaConyugue;
    private byte[] copiaSeguro;
    private byte[] copiaSisben;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private MPersona persona;

    public MInfoDocumentos() {
    }

    public MInfoDocumentos(byte[] copiaCedula, byte[] copiadiploma, byte[] referenciaLaboral, byte[] referenciaPersonal, byte[] referenciaFamiliar, byte[] copiaCredencial, byte[] copiaActaMatri, byte[] copiaCedulaConyugue, byte[] copiaSeguro, byte[] copiaSisben, MPersona persona) {
        this.copiaCedula = copiaCedula;
        this.copiadiploma = copiadiploma;
        this.referenciaLaboral = referenciaLaboral;
        this.referenciaPersonal = referenciaPersonal;
        this.referenciaFamiliar = referenciaFamiliar;
        this.copiaCredencial = copiaCredencial;
        this.copiaActaMatri = copiaActaMatri;
        this.copiaCedulaConyugue = copiaCedulaConyugue;
        this.copiaSeguro = copiaSeguro;
        this.copiaSisben = copiaSisben;
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getCopiaCedula() {
        return copiaCedula;
    }

    public void setCopiaCedula(byte[] copiaCedula) {
        this.copiaCedula = copiaCedula;
    }

    public byte[] getCopiadiploma() {
        return copiadiploma;
    }

    public void setCopiadiploma(byte[] copiadiploma) {
        this.copiadiploma = copiadiploma;
    }

    public byte[] getReferenciaLaboral() {
        return referenciaLaboral;
    }

    public void setReferenciaLaboral(byte[] referenciaLaboral) {
        this.referenciaLaboral = referenciaLaboral;
    }

    public byte[] getReferenciaPersonal() {
        return referenciaPersonal;
    }

    public void setReferenciaPersonal(byte[] referenciaPersonal) {
        this.referenciaPersonal = referenciaPersonal;
    }

    public byte[] getReferenciaFamiliar() {
        return referenciaFamiliar;
    }

    public void setReferenciaFamiliar(byte[] referenciaFamiliar) {
        this.referenciaFamiliar = referenciaFamiliar;
    }

    public byte[] getCopiaCredencial() {
        return copiaCredencial;
    }

    public void setCopiaCredencial(byte[] copiaCredencial) {
        this.copiaCredencial = copiaCredencial;
    }

    public byte[] getCopiaActaMatri() {
        return copiaActaMatri;
    }

    public void setCopiaActaMatri(byte[] copiaActaMatri) {
        this.copiaActaMatri = copiaActaMatri;
    }

    public byte[] getCopiaCedulaConyugue() {
        return copiaCedulaConyugue;
    }

    public void setCopiaCedulaConyugue(byte[] copiaCedulaConyugue) {
        this.copiaCedulaConyugue = copiaCedulaConyugue;
    }

    public byte[] getCopiaSeguro() {
        return copiaSeguro;
    }

    public void setCopiaSeguro(byte[] copiaSeguro) {
        this.copiaSeguro = copiaSeguro;
    }

    public byte[] getCopiaSisben() {
        return copiaSisben;
    }

    public void setCopiaSisben(byte[] copiaSisben) {
        this.copiaSisben = copiaSisben;
    }

    public MPersona getPersona() {
        return persona;
    }

    public void setPersona(MPersona persona) {
        this.persona = persona;
    }

    
    
}
