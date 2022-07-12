package test;

import modelo.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Usuario {
    private static ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private static ArrayList<Cita> citasAgendadas = new ArrayList<Cita>();
    private static ArrayList<Atencion> atencionesL =new ArrayList<Atencion>();
    private static String apertura="7:00";
    private static String cierre="20:00";
    private static int duracionCita=15;
    
    static Scanner sc = new Scanner(System.in);

    public static void inicializarSistema(){
        System.out.print("Sistema inicializado");
        
    }
    public static void listarServicios(Servicio sv1){

    }
    public static void crearEmpleados(Empleado em1){

    }
    public static void listarClientes(Cliente cl1){

    }
    public static void registrarAtencion(String cedulaConsulta){
        
    }
    
        
    public static void menuCita() {
        int a=0;
        while (a==0){
            System.out.println("1.Crear Cita\n2.Eliminar Cita\n3.Consultar citas por fecha");
            System.out.print("Opci�n: ");
            int seleccion = sc.nextInt();
            sc.nextLine();
            switch (seleccion) {
                case 1:
                    int principalOpcion1=0;
                    while (principalOpcion1==0){
                        System.out.print("Ingrese los datos para la cita:");
                        String fechaIngresada= Validar.fecha();
                        String horaIngresada= Validar.horaRango(apertura, cierre,duracionCita);
                        System.out.println("Ingrese los datos del paciente");
                        String nombreIngresadoC= Validar.nombre();
                        String cedulaIngresadaC= Validar.cedula();
                        String telefonoIngresadoC = Validar.telefono();
                        String emailIngresadoC = Validar.email();
                        System.out.println("Ingrese los datos del representante");
                        String nombreIngresadoR = Validar.nombre();
                        String cedulaIngresadaR = Validar.cedula();
                        String telefonoIngresadoR = Validar.telefono();
                        String emailIngresadoR = Validar.email();
                        /*asumimos que se le asigna un empleado al azar, creo el empleado para la prueba
                        Empleado em1 = new Empleado();
                        Persona repr1 = new Persona(nombreIngresadoR,cedulaIngresadaR,telefonoIngresadoR,emailIngresadoR);
                        Cliente cl1 = new Cliente(nombreIngresadoC,cedulaIngresadaC,telefonoIngresadoC,emailIngresadoC,repr1);
                        boolean citaCreada=Cita.crearCita(fechaIngresada,horaIngresada,cl1,em1,citasAgendadas);
                        if (citaCreada){
                            System.out.println("Cita creada");
                            principalOpcion1=1;
                        } else {
                            System.out.println(System.out.println("No se puede agendar cita en el horario especificado "
                        + "en la fecha seleccionada porque se encuentra ocupado, ingrese los datos nuevamente");
                        }
                        */ 
                    }
                    a=1;
                    break;


            
                case 2:
                    int c=0;
                    while (c==0){
                        String cedulaIngresada = Validar.cedula();
                        boolean citaEliminada = Cita.eliminarCita(cedulaIngresada,citasAgendadas);
                        if (citaEliminada){
                            c=1;
                        } else {
                            System.out.println("Cedula no v�lida, ingrese nuevamente");                               
                        }
                    }
                    a=1;
                    break;

                    
                case 3:
                    int d=0;
                    while (d==0){
                        System.out.println("Ingrese la fecha cuyas citas desea consultar");
                        String fechaConsulta = sc.nextLine();
                        boolean fechaConsultada = Cita.consultarCita(fechaConsulta,citasAgendadas);
                        if (fechaConsultada == false){
                            System.out.println("No existen citas para ka fecha ingresada");
                        } else {
                            d=1;
                        }
                    } 
                    a=1;
                    break;
                default: 
                    System.out.println("Opcion no v�lida, vuelva a intentar");

            }
        }
    }
    
    public static void menuAtencion(){
        System.out.println("1.Registrar atenci�n\n2.Consultar atenci�n");
        System.out.print("Opci�n: ");
        int seleccion = sc.nextInt();
        sc.nextLine();
        switch (seleccion) {
            case 1:
                String cedulaConsulta=Validar.cedula();
                System.out.println("Ingrese la duraci�n de la atenci�n: ");
                System.out.println("Ingrese el nombre del empleado que lo atendi�: ");
                
                ArrayList<Integer> indicesCitasUsuario = new ArrayList<Integer>();
        
        for (int i=0; i<citasAgendadas.size();i++){ 
            if (cedulaConsulta.equals(citasAgendadas.get(i).getCliente().getCedula())){
                indicesCitasUsuario.add(i);
                System.out.println("ID: "+ i + " " + citasAgendadas.get(i).mostrarInformacion());
                
            }
            
        }
        
        System.out.print("Ingrese el ID de la cita cuya atenci�n desea registrar: ");
        int indiceIngresadoRegistrar = sc.nextInt();
        sc.nextLine();
                
                break;
            case 2:
                
                break;
    
    }
    }

    public static void salir(){
        System.out.print("Gracias por utilizar el sistema");
    }
}
