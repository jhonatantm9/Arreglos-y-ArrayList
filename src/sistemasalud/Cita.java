/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasalud;
import java.util.*;

/**
 *
 * @author usuario
 */
public class Cita {
    private String fecha;
    private int hora;
    private String medico;
    private int consultorio;
    private Paciente paciente;
        
    public Cita(String fecha, int hora, String med, int consult){
        this.fecha = fecha;
        this.hora = hora;
        medico = med;
        consultorio = consult;        
    }
    
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
            
}
