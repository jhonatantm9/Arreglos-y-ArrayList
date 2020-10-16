/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasalud;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ListaPacientes {
    private List<Paciente> pacientes;
    private List<Cita> citas;
    private List<Paciente> ninos = new ArrayList();; //de 0 a 11 años
    private List<Paciente> adolescentes = new ArrayList(); // de 12 a 17 años
    private List<Paciente> jovenes = new ArrayList(); // de 18 a 26 años
    private List<Paciente> adultos = new ArrayList(); // de 27 a 60 años
    private List<Paciente> adultosMayores = new ArrayList(); // mayores a 60 años
    private List<Paciente> hipertension = new ArrayList();
    private List<Paciente> diabetes = new ArrayList();
    private List<Paciente> dislipidemia = new ArrayList();
    private List<Paciente> cancer = new ArrayList();
    private List<Paciente> tiroides = new ArrayList();
    private List<Paciente> enfermedadHuerfana = new ArrayList();
    private int cantidadPacientes;    
    static public String[] enfermedades = {"Hipertensión","Diabetes","Dislipidemia",
        "Cáncer","Enfermedad de la tiroides","Enfermedad huérfana"};
    static public String[] edades = {"Niños", "Adolescentes", "Jóvenes", "Adultos", "Adultos mayores"};
    Scanner lea = new Scanner(System.in);
    
    public ListaPacientes(){
        cantidadPacientes=0;
        pacientes = new ArrayList();
        citas = new ArrayList();
        
    }
    
    public void agregarPaciente(Paciente p){
        pacientes.add(p);        
        cantidadPacientes++;
        citas.add(p.getCita());
        if(p.getEdad()<12){
            ninos.add(p);
        }else if(p.getEdad()<18 && p.getEdad()>11){
            adolescentes.add(p);
        }else if(p.getEdad()<27 && p.getEdad()>17){
            jovenes.add(p);
        }else if(p.getEdad()<61 && p.getEdad()>26){
            adultos.add(p);
        }else{
            adultosMayores.add(p);
        }
        
        if(p.getInformacion().getEnfermedadPrincipal().equalsIgnoreCase(enfermedades[0])){
            hipertension.add(p);
        }else if(p.getInformacion().getEnfermedadPrincipal().equalsIgnoreCase(enfermedades[1])){
            diabetes.add(p);
        }else if(p.getInformacion().getEnfermedadPrincipal().equalsIgnoreCase(enfermedades[2])){
            dislipidemia.add(p);
        }else if(p.getInformacion().getEnfermedadPrincipal().equalsIgnoreCase(enfermedades[3])){
            cancer.add(p);
        }else if(p.getInformacion().getEnfermedadPrincipal().equalsIgnoreCase(enfermedades[4])){
            tiroides.add(p);
        }else{
            enfermedadHuerfana.add(p);
        }
    }
    
    public void nuevoPaciente(String nombre, int edad, int documento){
        Paciente nuevo = new Paciente(nombre, edad, documento);
        agregarPaciente(nuevo);
    }
    
    
    public void mostrarTodo(){
        Paciente[] auxiliar = pacientes.toArray(new Paciente[pacientes.size()]);
        for (int i = 0; i < auxiliar.length; i++) {
            System.out.println(auxiliar[i].getNombre());
        }
    }
    
    public void mostrarNombresPorCategoriaEdad(String opcion){
        Paciente[] auxiliar;
        /*System.out.println("Elija la lista a mostrar: ninos, adolescentes, jovenes, adultos o"
                + " adultos mayores");
        String opcion = lea.nextLine();*/
        if(opcion.equalsIgnoreCase("ninos")){
            if(ninos.isEmpty()){
                System.out.println("No hay niños en la lista de pacientes");
            }else{
                auxiliar = ninos.toArray(new Paciente[ninos.size()]);
                System.out.println("La lista de niños es:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else if(opcion.equalsIgnoreCase("adolescentes")){
            if(adolescentes.isEmpty()){
                System.out.println("No hay adolescentes en la lista de pacientes");
            }else{
                auxiliar = adolescentes.toArray(new Paciente[adolescentes.size()]);
                System.out.println("La lista de adolescentes es:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else if(opcion.equalsIgnoreCase("jovenes") || opcion.equalsIgnoreCase("jóvenes")){
            if(jovenes.isEmpty()){
                System.out.println("No hay jóvenes en la lista de pacientes");
            }else{
                auxiliar = jovenes.toArray(new Paciente[jovenes.size()]);
                System.out.println("La lista de jóvenes es:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else if(opcion.equalsIgnoreCase("adultos")){
            if(adultos.isEmpty()){
                System.out.println("No hay adultos en la lista de pacientes");
            }else{
                auxiliar = adultos.toArray(new Paciente[adultos.size()]);
                System.out.println("La lista de adultos es:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else if(opcion.equalsIgnoreCase("adultos mayores")){
            if(adultosMayores.isEmpty()){
                System.out.println("No hay adultos mayores en la lista de pacientes");
            }else{
                auxiliar = adultosMayores.toArray(new Paciente[adultosMayores.size()]);
                System.out.println("La lista de adultos mayores es:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else{
            System.out.println("Lista no encontrada");
        }
    }
    
    public void mostrarNombresPorEnfermedad(String eleccion){
        Paciente[] auxiliar;
        /*System.out.println("Elija una de las listas de enfermedades: hipertensión, diabetes,"
                + " dislipidemia, cáncer, enfermedad de la tiroides o enfermedad huárfana");
        String eleccion = lea.nextLine();*/
        if(eleccion.equalsIgnoreCase("hipertension") || eleccion.equalsIgnoreCase("hipertensión")){
            if(hipertension.isEmpty()){
                System.out.println("No hay pacientes con hipertensión");
            }else{
                auxiliar = hipertension.toArray(new Paciente[hipertension.size()]);
                System.out.println("Los pacientes con hipertensión son:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else if(eleccion.equalsIgnoreCase("diabetes")){
            if(diabetes.isEmpty()){
                System.out.println("No hay pacientes con diabetes");
            }else{
                auxiliar = diabetes.toArray(new Paciente[diabetes.size()]);
                System.out.println("Los pacientes con siabetes son:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else if(eleccion.equalsIgnoreCase("cancer") || eleccion.equalsIgnoreCase("cáncer")){
            if(cancer.isEmpty()){
                System.out.println("No hay pacientes con cáncer");
            }else{
                auxiliar = cancer.toArray(new Paciente[cancer.size()]);
                System.out.println("Los pacientes con cáncer son:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else if(eleccion.equalsIgnoreCase("dislipidemia")){
            if(dislipidemia.isEmpty()){
                System.out.println("No hay pacientes con dislipidemia");
            }else{
                auxiliar = dislipidemia.toArray(new Paciente[dislipidemia.size()]);
                System.out.println("Los pacientes con dislipidemia son:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else if(eleccion.equalsIgnoreCase("enfermedad de la tiroides") || eleccion.equalsIgnoreCase("tiroides")){
            if(tiroides.isEmpty()){
                System.out.println("No hay pacientes con enfermedad de la tiroides");
            }else{
                auxiliar = tiroides.toArray(new Paciente[tiroides.size()]);
                System.out.println("Los pacientes con enfermedad de la tiroides son:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else if(eleccion.equalsIgnoreCase("enfermedad huérfana") || eleccion.equalsIgnoreCase("enfermedad huerfana")){
            if(enfermedadHuerfana.isEmpty()){
                System.out.println("No hay pacientes con enfermedad huérfana");
            }else{
                auxiliar = enfermedadHuerfana.toArray(new Paciente[enfermedadHuerfana.size()]);
                System.out.println("Los pacientes con enfermefaf huérfana son:");
                for (int i = 0; i < auxiliar.length; i++) {
                    System.out.println(auxiliar[i].getNombre());
                }
            }
        }else{
            System.out.println("Lista no encontrada");
        }
    }
    
    public static void main(String[] args) {
        ListaPacientes li = new ListaPacientes();
        Paciente a = new Paciente("juan", 45, 323);
        a.ingresarInformacion("Estable", "Diabetes", "", "12-05");
        Paciente b = new Paciente("sara", 36, 443);
        b.ingresarInformacion("Estable", "Enfermedad huérfana", "", "2-05");
        Paciente c = new Paciente("maria", 44, 321);
        c.ingresarInformacion("Estable", "Hipertensión", "", "14-02");
        Paciente d = new Paciente("diego", 10, 321);
        d.ingresarInformacion("Estable", "Hipertensión", "", "14-02");
        
        li.agregarPaciente(c);
        li.agregarPaciente(a);
        li.agregarPaciente(b);
        li.agregarPaciente(d);
        
        //li.mostrarNombresPorCategoriaEdad();
    }
}
