/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasalud;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class SistemaSalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaPacientes lista = new ListaPacientes();
        
        //JOptionPane.showMessageDialog(null, "A");
        boolean fin = false;
        Scanner lea = new Scanner(System.in);
        //Ciclo que termina cuando el usuario no quiera realizar más operaciones
        while(!fin){
            System.out.println("Por favor seleccione el número correspondiente a la"
                    + " operación que desea realizar \n1:Ingresar nuevo paciente. 2: Mostrar"
                    + " todos los pacientes. 3: Asignar una nueva cita.\n"
                    + "4: Mostrar pacientes en un rango de edad. 5: Mostrar los "
                    + "pacientes con una enfermedad específica. \n6: Buscar una cita. "
                    + "7: Mostar todas las citas.");
            int operacion = Integer.parseInt(lea.next());
            switch(operacion){
                //Agregar paciente
                case 1:{
                    System.out.println("A continuación ingrese el nombre, la edad y el"
                            + " documento de identidad del paciente separándolos con una coma,"
                            + "pero sin espacios entre ellos\n"
                            + "Ejemplo: Pepito Perez,24,351122");
                    String informacionInicial = lea.next();
                    String[] datos = new String[3];
                    datos = informacionInicial.split(",");
                    Paciente p = new Paciente(datos[0], Integer.parseInt(datos[1]), 
                            Integer.parseInt(datos[2]));
                    System.out.println("\nAhora, para ingresar la enfermedad principal del paciente,"
                            + " escriba el número correspondiente a esta.\n"
                            + "1: Hipertensión, 2: Diabetes, 3: Dislipidemia, 4: Cáncer"
                            + "\n5: Enfermedad de la tiroides, 6: Enfermedad huérfana\n"
                            + "Nota: Para cualquier otro número ingresado, se asignará"
                            + " enfermedad huérfana como valor por defecto.");
                    int enfermedad = Integer.parseInt(lea.next());
                    if(enfermedad > 6 || enfermedad < 1){
                        p.ingresarInformacion("Enfermedad huérfana");
                    }else{
                        p.ingresarInformacion(ListaPacientes.enfermedades[enfermedad-1]);
                    }
                    lista.agregarPaciente(p);
                    System.out.println("Paciente ingresado\n ");
                }break;
                //Mostrar todos los pacientes
                case 2:{
                    lista.mostrarTodo();
                }break;
                //Agendar cita
                case 3:{
                    
                }break;
                //Mostrar por rango de edad
                case 4:{
                    System.out.println("\n Por favor seleccione el rango de edad que desea ver:");
                    System.out.println("1: niños, 2: adolescentes, 3: jóvenes, 4: adultos,"
                            + " 5: adultos mayores");
                    int opcion = Integer.parseInt(lea.next());
                    if(opcion<1 || opcion>5){
                        lista.mostrarNombresPorCategoriaEdad("Ninguno");
                    }else{
                        lista.mostrarNombresPorCategoriaEdad(ListaPacientes.edades[opcion-1]);
                    }
                }break;
                //Mostrar por enfermedad
                case 5:{
                    System.out.println("\n Por favor seleccione la enfermedad de los pacientes que desea ver:");
                    System.out.println("1: hipertensión, 2: diabetes, 3: dislipidemia, "
                            + "4: cáncer, 5: enfermedad de la tiroides, 6: enfermedad huérfana");
                    int opcion = Integer.parseInt(lea.next());
                    if(opcion<1 || opcion>6){
                        lista.mostrarNombresPorEnfermedad("Ninguno");
                    }else{
                        lista.mostrarNombresPorEnfermedad(ListaPacientes.edades[opcion-1]);
                    }
                }break;
                //Buscar una cita
                case 6:{
                    
                }
            }
            System.out.println("Seguir?");
            int fin2 = Integer.parseInt(lea.next());
            if(fin2==0){
                fin = true;
            }
        }
                
        
    }
    
}
