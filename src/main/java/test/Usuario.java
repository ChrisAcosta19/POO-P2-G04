<<<<<<< HEAD
<<<<<<< HEAD
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
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
=======

>>>>>>> 37a7c3b (Implementación de métodos relacionados a la clase Cliente en Usuario)
package test;
import modelo.*;
import java.util.*;

public class Usuario {
    
    ArrayList<Servicio> servicios;
    ArrayList<Empleado> empleados;
    ArrayList<Cliente> clientes;
    ArrayList<Cita> citas;
    ArrayList<Atencion> atenciones;
    
    //Operaciones de Menú Servicio
    public void listarServicios(){
        System.out.println("Listado de servicios registrados:");
        for(int i=0;i<servicios.size();i++){
            System.out.println((i+1)+") "+servicios.get(i));
        }
        System.out.println();
    }
    
    public Servicio crearServicio(Scanner sc){
        String nombre, entradaDatos;        
        do{
            System.out.println("Ingrese nombre del servicio:");
            nombre = sc.nextLine();
        }while(!Validacion.validarNombre(nombre));
        
        int duracion;
        do{
            System.out.println("Ingrese duración del servicio:");
            entradaDatos = sc.nextLine();
        }while(!Validacion.validarEntero(entradaDatos));
        duracion = Integer.parseInt(entradaDatos);
        
        double precio;
        do{
            System.out.println("Ingrese precio del servicio (con punto decimal):");
            entradaDatos = sc.nextLine();
        } while(!Validacion.validarDouble(entradaDatos));
        precio = Double.parseDouble(entradaDatos);
        
        int opcion;
        do{
            do{
               System.out.println("Ingrese estado del servicio: (0)Inactivo (1)Activo");
                entradaDatos = sc.nextLine();
            } while(!Validacion.validarEntero(entradaDatos));
            opcion = Integer.parseInt(entradaDatos);
            if(opcion != 0 && opcion != 1)
                System.out.println("Opción inválida, ingrese de nuevo");
        }while(opcion != 0 && opcion != 1);
        return new Servicio(nombre, duracion, precio, opcion != 0);
>>>>>>> c20595f (Implementación de métodos relacionados a la clase Servicio en Usuario)
    }
    
    public boolean validarPersona(Persona persona, Persona per){
        ArrayList<Persona> personas = new ArrayList<>();
        for (Empleado e : empleados) {
            personas.add(e);
        }
        for (Cliente c : clientes) {
            personas.add(c);
            personas.add(c.getDatosRepresentante());
        }
        if (per != null) {
            personas.remove(per);
        }
        if (personas.contains(persona)) {
            int indice = personas.indexOf(persona);
            Persona p = personas.get(indice);
            System.out.println("Alguno de los datos ingresado coincide con los de esta persona: ");
            System.out.println(new Persona(p.getCedula(), p.getNombre(), p.getTelefono(), p.getEmail()));
            System.out.println("\nIngrese de nuevo los datos:");
            return false;
        } else
            return true;
    }
    
    public void listarEmpleados(){
        System.out.println("Listado de empleados registrados:");
        for(int i=0;i<empleados.size();i++){
            System.out.println((i+1)+") "+empleados.get(i));
        }
    }
    
    public Empleado crearEmpleado(Scanner sc, Persona p){
        String nombre, cedula, telefono, email, entradaDatos;
        Empleado empleado; int opcion;
        do{
            do{
                System.out.println("Ingrese cedula del empleado (10 dígitos):");
                cedula = sc.nextLine();
            }while(!Validacion.validarEntero(cedula) || cedula.length()!=10);
            do{
                System.out.println("Ingrese nombre del empleado:");
                nombre = sc.nextLine();
            }while(!Validacion.validarNombre(nombre));
            do{
                System.out.println("Ingrese telefono del empleado (10 dígitos):");
                telefono = sc.nextLine();
            }while(!Validacion.validarEntero(telefono) || telefono.length()!=10);
            do{
                System.out.println("Ingrese email del empleado:");
                email = sc.nextLine();
            }while(!Validacion.validarEmail(email));
            do{
                do{
                    System.out.println("Ingrese estado del empleado: (0)Inactivo (1)Activo");
                    entradaDatos = sc.nextLine();
                }while(!Validacion.validarEntero(entradaDatos));
                opcion = Integer.parseInt(entradaDatos);
                if(opcion != 0 && opcion != 1)
                    System.out.println("Opción inválida, ingrese de nuevo");
            }while(opcion != 0 && opcion != 1);
            empleado = new Empleado (cedula, nombre, telefono, email, opcion != 0);
        }while(!validarPersona(empleado, p)); 
        return empleado;
    }
<<<<<<< HEAD
    
    //Operaciones de Menú Clientes
    public void listarClientes(){
        System.out.println("Listado de clientes registrados:");
        for(int i=0;i<clientes.size();i++){
            System.out.println((i+1)+") "+clientes.get(i));
        }
    }
    
    public Cliente crearCliente(Scanner sc, Persona p, Persona rep){
        String nombre, cedula, telefono, email;
        Persona persona;
        do{
            do{
                System.out.println("Ingrese cedula del cliente (10 dígitos):");
                cedula = sc.nextLine();
            } while(!Validacion.validarEntero(cedula) || cedula.length()!=10);
            do{
                System.out.println("Ingrese nombre del cliente:");
                nombre = sc.nextLine();
            }while(!Validacion.validarNombre(nombre));
            do{
                System.out.println("Ingrese telefono del cliente (10 dígitos):");
                telefono = sc.nextLine();
            } while(!Validacion.validarEntero(telefono) || telefono.length()!=10);
            do{
                System.out.println("Ingrese email del cliente:");
                email = sc.nextLine();
            }while(!Validacion.validarEmail(email));
            persona = new Persona(cedula, nombre, telefono, email);
        } while(!validarPersona(persona, p));
        String nombreR, cedulaR, telefonoR, emailR;
        Persona representante;
        do{
            do{
                System.out.println("Ingrese cedula del Representante (10 dígitos):");
                cedulaR = sc.nextLine();
            }while(!Validacion.validarEntero(cedulaR) || cedulaR.length()!=10);
            do{
                System.out.println("Ingrese nombre del Representante:");
                nombreR = sc.nextLine();
            }while(!Validacion.validarNombre(nombreR));
            do{
                System.out.println("Ingrese telefono del Representante (10 dígitos):");
                telefonoR = sc.nextLine();
            }while(!Validacion.validarEntero(telefonoR) || telefonoR.length()!=10);
            do{
                System.out.println("Ingrese email del Representante:");
                emailR = sc.nextLine();
            }while(!Validacion.validarEmail(emailR));
            representante = new Persona(cedulaR, nombreR, telefonoR, emailR);
        } while(!validarPersona(representante, rep));
        return new Cliente(cedula, nombre, telefono, email, representante);
    }
    
<<<<<<< HEAD
=======
>>>>>>> 38c5eea (Implementación de métodos relacionados a la clase Empleado en Usuario)
=======
    public void crearCita(Cita cita){
        if(!citas.contains(cita)){
            System.out.println("Datos de la cita creada:");
            System.out.println(cita);
            citas.add(cita);
        } else {
            System.out.println("No se pudo crear la cita por una de las siguientes razones:");
            System.out.println("1. Ya existe otra cita con ese encargado a esa fecha y hora");
            System.out.println("2. El cliente ya tiene otra cita a esa fecha y hora");
        }
    }
    
    public ArrayList<Cita> buscarCitasPendientes(String cedula){
        Cliente cliente = new Cliente(cedula);
        ArrayList<Cita> citasAtendidas = new ArrayList<>();
        for(Atencion atencion: atenciones){
            citasAtendidas.add(atencion.getCita());
        }
        ArrayList<Cita> citasPendientes = new ArrayList<>();
        for(Cita cita: citas){
            if(!citasAtendidas.contains(cita) && cita.getCliente().equals(cliente)){
                citasPendientes.add(cita);
            }
        }
        return citasPendientes;
    }
    
    public void eliminarCita(Scanner sc, String cedula){
        ArrayList<Cita> citasPendientes = buscarCitasPendientes(cedula);
        if(citasPendientes.isEmpty()){
            System.out.println("El cliente con cédula " +cedula+ " no tiene citas pendientes");
        }else{
            int i, opcion; String entradaDatos;
            System.out.println("Las citas pendientes del cliente con cédula "+ cedula +" son:");
            for(i=0; i<citasPendientes.size(); i++){
                System.out.println((i+1)+")"+citasPendientes.get(i));
            }
            do{
                do{
                    System.out.println("Ingrese su opción: ");
                    entradaDatos = sc.nextLine();
                }while(!Validacion.validarEntero(entradaDatos));
                opcion = Integer.parseInt(entradaDatos);
                if(opcion < 1 || opcion > i)
                    System.out.println("Opcion fuera de rango, ingrese de nuevo");
            }while(opcion < 1 || opcion > i);
            citas.remove(citasPendientes.get(opcion - 1));
        }
    }
    
    public void consultarCitas(String fecha){
        ArrayList<Cita> citasxFecha = new ArrayList<>();
        for(Cita cita: citas){
            if(cita.getFecha().equals(fecha)) {
                citasxFecha.add(cita);
            }
        }
        if(citasxFecha.isEmpty()){
            System.out.println("No hay citas para esta fecha");
        }else{
            System.out.println("Las citas para el día "+fecha+" son:");
            for(Cita cita: citasxFecha)
                System.out.println(cita);
        }
    }
<<<<<<< HEAD
>>>>>>> d271865 (Implementacion metodos relacionados a la clase Cita en Usuario)
=======
    
    //Operaciones de Menú Atención
    public void consultarAtenciones(Scanner sc, int opcion){
        ArrayList<Atencion> listaAtenciones = new ArrayList<>();
        String cedula, fecha;
        switch(opcion){
            case 1:
                listarEmpleados();
                do{
                    System.out.println("Ingrese la cédula del empleado: ");
                    cedula = sc.nextLine();
                } while(!Validacion.validarEntero(cedula));
                Empleado empleado = new Empleado(cedula);
                for(Atencion a: atenciones){
                    if(a.getEmpleadoAtencion().equals(empleado))
                        listaAtenciones.add(a);
                }
                if(listaAtenciones.isEmpty()){
                    if(!empleados.contains(empleado))
                        System.out.println("No existe un empleado con esa cédula\n");
                    else
                        System.out.println("No hay atenciones registradas con esa cédula de empleado");
                }else{
                    System.out.println("Las atenciones de ese empleado fueron: ");
                    for(Atencion a: listaAtenciones)
                        System.out.println(a + "\n");
                }
                break;
            case 2:
                listarClientes();
                do{
                    System.out.println("Ingrese la cédula del cliente: ");
                    cedula = sc.nextLine();
                } while(!Validacion.validarEntero(cedula));
                Cliente cliente = new Cliente(cedula);
                for(Atencion a: atenciones){
                    if(a.getCita().getCliente().equals(cliente))
                        listaAtenciones.add(a);
                }
                if(listaAtenciones.isEmpty()){
                    if(!clientes.contains(cliente))
                        System.out.println("No existe un cliente con esa cédula\n");
                    else
                        System.out.println("No hay atenciones registradas a ese cliente");
                }else{
                    System.out.println("Las atenciones a ese cliente fueron: ");
                    for(Atencion a: listaAtenciones)
                        System.out.println(a + "\n");
                }
                break;
            default:
                fecha = Main.crearFecha(sc);
                for(Atencion a: atenciones){
                    if(a.getCita().getFecha().equals(fecha))
                        listaAtenciones.add(a);
                }
                if(listaAtenciones.isEmpty()){
                    System.out.println("No hay atenciones registradas en esa fecha");
                }else{
                    System.out.println("Las atenciones en esa fecha fueron: ");
                    for(Atencion a: listaAtenciones)
                        System.out.println(a + "\n");
                }
        }
    }
>>>>>>> de7dcd3 (Implementación de métodos relacionados a la clase Atención en Usuario)
}
