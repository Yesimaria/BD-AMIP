/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Vistas.DocAnexos;
import Vistas.Menus;
import dao.DAODocumentos;
import dao.DAOPersona;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.MInfoDocumentos;
import modelo.MPersona;
/**
 *
 * @author maike
 */
public class CDocumentos implements ActionListener, KeyListener {
    
    byte[] cedula;
    int longitudCedula;
     byte[]  acta;
    int longitudActa;
     byte[]  diplomas;
    int longitudDiploma;
     byte[]  seguro;
    int longitudSeguro;
     byte[]  refPersonal;
    int longitudPersonal;
     byte[]  refFamiliar;
    int longitudFamiliar;
     byte[]  refLaboral;
    int longitudLaboral;
     byte[]  cedulaM;
    int longitudCedulaM;
     byte[]  credencial;
    int longitudCredencial;
     byte[]  sisben;
    int longitudSisben;
    
    CMenus cmenus;
    Menus vmenus;
    MInfoDocumentos documentos;
    DAODocumentos daodocumentos;
    MPersona persona;
    DAOPersona daopersona;
    DocAnexos vanexos;
    String codigo;
    
    public CDocumentos(DocAnexos vanexos, String codigo) {
        this.vanexos = vanexos;
        this.codigo = codigo;
       
        this.vanexos.aggActionListener(this);
        this.cargarDatos(codigo);
        this.vanexos.setVisible(true);
    }
    
    
    public byte[] btnAgregarImagen(JLabel lbmagen,  byte[]  store, int longitud) throws IOException {                                                
        lbmagen.setIcon(null);
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado=j.showOpenDialog(null);
        if(estado== JFileChooser.APPROVE_OPTION){
            try{
                InputStream is= new FileInputStream(j.getSelectedFile());
                longitud=(int)j.getSelectedFile().length();
                byte[] buffer = new byte[longitud];
                int readers = is.read(buffer);
                store = buffer;
                //necesitamos saber la cantidad de bytes
                
                try {
                    Image icono=ImageIO.read(j.getSelectedFile()).getScaledInstance
                            (lbmagen.getWidth(),lbmagen.getHeight(),Image.SCALE_DEFAULT);
                    lbmagen.setIcon(new ImageIcon(icono));
                    lbmagen.updateUI();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(vanexos, "imagen: "+ex);
                }
            }catch(FileNotFoundException ex){
                ex.printStackTrace();
            }
        }
        return store;
    } 
    
     public void incluirDocumentos(String codigo){
         daopersona = new DAOPersona();
         boolean save = false;
          try {
         persona = daopersona.getPersonaCodigo(codigo);
         System.out.println("la persona en v es: "+ persona.getNombre()+" y el codigo es: "  + persona.getCodigo());
         documentos = new MInfoDocumentos();
         documentos.setCopiaCedula(cedula);
         documentos.setCopiaCedulaConyugue(cedulaM);
         documentos.setCopiaCredencial(credencial);
         documentos.setCopiaSeguro(seguro);
         documentos.setCopiaSisben(sisben);
         documentos.setCopiadiploma(diplomas);
         documentos.setCopiaActaMatri(acta);
         documentos.setReferenciaFamiliar(refFamiliar);
         documentos.setReferenciaLaboral(refLaboral);
         documentos.setReferenciaPersonal(refPersonal);
         persona.setInfoDocumentos(documentos);
         documentos.setPersona(persona);
         daodocumentos = new DAODocumentos();
         save = this.daodocumentos.updateInfoDocumentos(documentos, persona);
        } catch (Exception e) {
         System.out.println("error al incluir infoestudios: " + e);
        }
    }
     
     public void cargarImag(JLabel lb, byte[] arch){
        ImageIcon foto;
        InputStream is;
        BufferedImage bi;
        is = new ByteArrayInputStream(arch);            
        try {
           bi = ImageIO.read(is);
           foto = new ImageIcon(bi);
           Image img = foto.getImage();
           Image newimg = img.getScaledInstance(lb.getWidth(),lb.getHeight(), java.awt.Image.SCALE_SMOOTH);
           ImageIcon newicon = new ImageIcon(newimg); 
           lb.setIcon(newicon);
        } catch (IOException ex) {
            System.out.println(ex);
            Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
        }  
     }
     public void cargarDatos(String codigo){
      daopersona = new DAOPersona();
       System.out.println("Cargos");
         this.documentos = daopersona.getPersonaCodigo(codigo).getInfoDocumentos();
        //if(this.documentos instanceof MInfoDocumentos){
            System.out.println("Cargos1");
              try {
            this.cargarImag(this.vanexos.getLbCedulaConyuge(),this.documentos.getCopiaCedulaConyugue());
            this.cargarImag(this.vanexos.getLbCopiaacta(),this.documentos.getCopiaActaMatri());
            this.cargarImag(this.vanexos.getLbcopiaCedula(),this.documentos.getCopiaCedula());
            this.cargarImag(this.vanexos.getLbCopiaCredencial(),this.documentos.getCopiaCredencial());
            this.cargarImag(this.vanexos.getLbCopiaSeguro(),this.documentos.getCopiaSeguro());
            this.cargarImag(this.vanexos.getLbCopiaSisben(),this.documentos.getCopiaSisben());
            this.cargarImag(this.vanexos.getLbdiplomas(),this.documentos.getCopiadiploma());
            this.cargarImag(this.vanexos.getLbrefFamiliar(),this.documentos.getReferenciaFamiliar());
            this.cargarImag(this.vanexos.getLbreferelaboral(),this.documentos.getReferenciaLaboral());
            this.cargarImag(this.vanexos.getLbreferenciapers(),this.documentos.getReferenciaPersonal());
              } catch (Exception e) {
                  System.err.println(e);
              }
            
         // }
     }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equalsIgnoreCase("cedula")){
           try {
               this.cedula = this.btnAgregarImagen(vanexos.getLbcopiaCedula(), cedula, longitudCedula);
           } catch (IOException ex) {
               Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       if(e.getActionCommand().equalsIgnoreCase(vanexos.getBtnDiplomas().getActionCommand())){
           try {
              this.diplomas = this.btnAgregarImagen(vanexos.getLbdiplomas(),diplomas,longitudDiploma);
           } catch (IOException ex) {
               Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       if(e.getActionCommand().equalsIgnoreCase(vanexos.getBtnCedulaCony().getActionCommand())){
           try {
              this.cedulaM = this.btnAgregarImagen(vanexos.getLbCedulaConyuge(),cedulaM,longitudCedulaM);
           } catch (IOException ex) {
               Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       if(e.getActionCommand().equalsIgnoreCase(vanexos.getBtnCredencial().getActionCommand())){
           try {
               this.credencial = this.btnAgregarImagen(vanexos.getLbCopiaCredencial(), credencial,longitudCredencial);
           } catch (IOException ex) {
               Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       if(e.getActionCommand().equalsIgnoreCase(vanexos.getBtnSeguro().getActionCommand())){
           try {
             this.seguro = this.btnAgregarImagen(vanexos.getLbCopiaSeguro(),seguro, longitudSeguro);
           } catch (IOException ex) {
               Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       if(e.getActionCommand().equalsIgnoreCase(vanexos.getBtnSisben().getActionCommand())){
           try {
              this.sisben = this.btnAgregarImagen(vanexos.getLbCopiaSisben(),sisben, longitudSisben);
           } catch (IOException ex) {
               Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       if(e.getActionCommand().equalsIgnoreCase(vanexos.getBtnMatrimonio().getActionCommand())){
           try {
              this.acta = this.btnAgregarImagen(vanexos.getLbCopiaacta(),acta, longitudActa);
           } catch (IOException ex) {
               Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
      if(e.getActionCommand().equalsIgnoreCase(vanexos.getBtnRefFam().getActionCommand())){
           try {
              this.refFamiliar = this.btnAgregarImagen(vanexos.getLbrefFamiliar(),refFamiliar, longitudFamiliar);
           } catch (IOException ex) {
               Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
      if(e.getActionCommand().equalsIgnoreCase(vanexos.getBtnRefLab().getActionCommand())){
           try {
             this.refLaboral =  this.btnAgregarImagen(vanexos.getLbreferelaboral(),refLaboral, longitudLaboral);
           } catch (IOException ex) {
               Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
      if(e.getActionCommand().equalsIgnoreCase(vanexos.getBtnPersonal().getActionCommand())){
           try {
             this.refPersonal =  this.btnAgregarImagen(vanexos.getLbreferenciapers(),refPersonal,longitudPersonal);
           } catch (IOException ex) {
               Logger.getLogger(CDocumentos.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
      
      if (e.getActionCommand().equalsIgnoreCase("cancelar")) {

            vmenus = new Menus();
            cmenus = new CMenus(vmenus, codigo);
            vanexos.setVisible(false);
        }
        if (e.getActionCommand().equalsIgnoreCase("guardar")) {
            try {
                System.out.println("el codigo: " + codigo);
                this.incluirDocumentos(codigo);
                vmenus = new Menus();
                cmenus = new CMenus(vmenus, codigo);
                System.out.print("incluido exitosamente");
                vanexos.setVisible(false);
            } catch (Exception ex) {
                System.out.print("Error al intentar incluir: " + ex);
            }

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
