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
public class Paciente {
    private String nombre;
    private int edad;
    private int documentoIdentidad;
    private String direccion;
    private int telefono;
    private InformacionClinica informacion;
    private Cita cita;
    
    public Paciente(String nombre, int edad, int documento){
        this.nombre = nombre;
        this.edad = edad;
        documentoIdentidad = documento;
    }
    
    public void ingresarInformacion(String estado, String primaria, String secundaria, String fecha){
        informacion = new InformacionClinica(estado, primaria, secundaria, fecha);
    }
    
    public void ingresarInformacion(String enfermedad){
        informacion = new InformacionClinica(enfermedad);
    }
    
    public void asignarCita(String fecha, int hora, String med, int consult){
        cita = new Cita(fecha, hora, med, consult);
        cita.setPaciente(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public InformacionClinica getInformacion() {
        return informacion;
    }

    public Cita getCita() {
        return cita;
    }
    
}
