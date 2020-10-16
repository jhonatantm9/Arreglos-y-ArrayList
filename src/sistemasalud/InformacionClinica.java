/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasalud;

/**
 *
 * @author usuario
 */
public class InformacionClinica {
    private String estadoSalud;
    private String enfermedadPrincipal;
    private String enfermedadSecundaria;
    private String fechaAdquirida;
    
    public InformacionClinica(String estado, String primaria, String secundaria, String fecha){
        estadoSalud = estado;
        enfermedadPrincipal = primaria;
        enfermedadSecundaria = secundaria;
        fechaAdquirida = fecha;
    }
    
    public InformacionClinica(String enfermedadPrincipal){
        this.enfermedadPrincipal = enfermedadPrincipal;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getEnfermedadPrincipal() {
        return enfermedadPrincipal;
    }

    public void setEnfermedadPrincipal(String enfermedadPrincipal) {
        this.enfermedadPrincipal = enfermedadPrincipal;
    }

    public String getEnfermedadSecundaria() {
        return enfermedadSecundaria;
    }

    public void setEnfermedadSecundaria(String enfermedadSecundaria) {
        this.enfermedadSecundaria = enfermedadSecundaria;
    }

    public String getFechaAdquirida() {
        return fechaAdquirida;
    }

    public void setFechaAdquirida(String fechaAdquirida) {
        this.fechaAdquirida = fechaAdquirida;
    }
    
    
}
