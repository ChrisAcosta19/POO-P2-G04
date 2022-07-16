package test;
import modelo.*;
import java.util.*;

public class Usuario {
    //Listas para guardar los objetos creados
    ArrayList<Servicio> servicios;
    ArrayList<Empleado> empleados;
    ArrayList<Cliente> clientes;
    ArrayList<Cita> citas;
    ArrayList<Atencion> atenciones;
    
    //método para mostrar todos los servicios de la lista servicios
    public void listarServicios(){
        System.out.println("Listado de servicios registrados:");
        for(int i=0;i<servicios.size();i++){
            System.out.println((i+1)+") "+servicios.get(i));
        }
        System.out.println();
    }
    
    //método para crear objetos tipo Servicio
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
                System.out.println("Opción inválida, ingrese de nuevo\n");
        }while(opcion != 0 && opcion != 1);
        return new Servicio(nombre, duracion, precio, opcion != 0);
    }
    
    //método para ver si los datos de una persona coinciden con los de otra
    /*El parámetro Persona per se utiliza para quitar ese objeto de la lista personas
    Esto se hace para poder editar los datos de una persona que ya se encuentra en
    dicha lista, sino daría que coincide con una de las personas de la lista*/
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
    
    //método para mostrar todos los empleados de la lista empleados
    public void listarEmpleados(){
        System.out.println("Listado de empleados registrados:");
        for(int i=0;i<empleados.size();i++){
            System.out.println((i+1)+") "+empleados.get(i));
        }
    }
    
    //método para crear objetos tipo Empleado
    /*Persona p será recibido por el parámetro Persona per de validarPersona*/
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
                    System.out.println("Opción inválida, ingrese de nuevo\n");
            }while(opcion != 0 && opcion != 1);
            empleado = new Empleado (cedula, nombre, telefono, email, opcion != 0);
        }while(!validarPersona(empleado, p)); 
        return empleado;
    }
    
    //método para mostrar todos los clientes de la lista clientes
    public void listarClientes(){
        System.out.println("Listado de clientes registrados:");
        for(int i=0;i<clientes.size();i++){
            System.out.println((i+1)+") "+clientes.get(i));
        }
    }
    
    //método para crear un cliente con su representante
    /*Persona p será recibido por el parámetro Persona per de validarPersona
    en el caso del cliente y Persona rep será recibido por ese mismo parámetro
    cuando se intente crear el representante*/
    public Cliente crearCliente(Scanner sc, Persona per, Persona rep){
        String nombre, cedula, telefono, email;
        Persona cliente;
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
            cliente = new Persona(cedula, nombre, telefono, email);
        } while(!validarPersona(cliente, per));
        
        String cedulaR, nombreR, telefonoR, emailR;
        Persona representante;
        do{
            do {
                System.out.println("Ingrese cedula del Representante (10 dígitos):");
                cedulaR = sc.nextLine();
            } while (!Validacion.validarEntero(cedulaR) || cedulaR.length() != 10);
            do {
                System.out.println("Ingrese nombre del Representante:");
                nombreR = sc.nextLine();
            } while (!Validacion.validarNombre(nombreR));
            do {
                System.out.println("Ingrese telefono del Representante (10 dígitos):");
                telefonoR = sc.nextLine();
            } while (!Validacion.validarEntero(telefonoR) || telefonoR.length() != 10);
            do {
                System.out.println("Ingrese email del Representante:");
                emailR = sc.nextLine();
            } while (!Validacion.validarEmail(emailR));
            representante = new Persona(cedulaR, nombreR, telefonoR, emailR);
            if(representante.equals(cliente)){
                System.out.println("Alguno de los datos ingresados coincide con los de esta persona: ");
                System.out.println(cliente);
            }    
        } while (!validarPersona(representante, rep) || representante.equals(cliente));
        return new Cliente(cedula, nombre, telefono, email, representante);
    }
    
    //método que verifica si es posible crear la cita usando el contains
    /*Los criterios para que citas.contains(cita) dé true se encuentran en el equals de la
    clase Cita. Si no es posible crear la cita, se imprimen las posibles razones*/
    public void crearCita(Cita cita){
        if(citas.contains(cita)){
            System.out.println("No se pudo crear la cita por una de las siguientes razones:");
            System.out.println("1. Ya existe otra cita con ese encargado a esa fecha y hora");
            System.out.println("2. El cliente ya tiene otra cita a esa fecha y hora");
        } else if (!cita.getServicio().getEstado()) {
            System.out.println("No se pudo crear la cita por la siguente razón:");
            System.out.println("El servicio escogido se encuentra en estado Inactivo");
        }else if (!cita.getEncargadoServicio().getEstado()){
            System.out.println("No se pudo crear la cita la siguiente razón:");
            System.out.println("El encargado escogido se encuentra en estado Inactivo");
        }else if (!cita.getEncargadoServicio().getListaServicios().contains(cita.getServicio())){
            System.out.println("No se pudo crear la cita la razón:");
            System.out.println("El empleado escogido no ofrece tal servicio");
        } else {
            System.out.println("Datos de la cita creada:");
            System.out.println(cita);
            citas.add(cita);
        }
    }
    
    /*método que busca aquellas citas de un cliente en particular que no se encuentren
    en el atributo Cita de los objetos de tipo Atencion en la lista atenciones, y las
    agrega a una lista*/
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
    
    /*método que después de buscar las citas pendientes con el método anterior,
    se las muestra al usuario y este escoge la que quiere eliminar por un índice
    que se genera al momento de enlistarlas*/
    public void eliminarCita(Scanner sc, String cedula){
        ArrayList<Cita> citasPendientes = buscarCitasPendientes(cedula);
        if(citasPendientes.isEmpty()){
            System.out.println("El cliente con cédula " +cedula+ " no tiene citas pendientes\n");
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
                    System.out.println("Opcion fuera de rango, ingrese de nuevo\n");
            }while(opcion < 1 || opcion > i);
            citas.remove(citasPendientes.get(opcion - 1));
        }
    }
    
    /*método que recibe una fecha y busca aquellas citas cuya fecha coincida
    con las de este parámetro*/
    public void consultarCitas(String fecha){
        ArrayList<Cita> citasxFecha = new ArrayList<>();
        for(Cita cita: citas){
            if(cita.getFecha().equals(fecha)) {
                citasxFecha.add(cita);
            }
        }
        if(citasxFecha.isEmpty()){
            System.out.println("No hay citas para esta fecha\n");
        }else{
            System.out.println("Las citas para el día "+fecha+" son:");
            for(Cita cita: citasxFecha)
                System.out.println(cita);
        }
    }
    
    /*método para mostrar las atenciones ya sea por cédula del empleado,
    cédula del cliente o por una fecha*/
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
                        System.out.println("No hay atenciones registradas con esa cédula de empleado\n");
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
                        System.out.println("No hay atenciones registradas a ese cliente\n");
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

    //método que incializa las listas servicios, clientes, empleados, citas y atenciones
    /*crea 3 servicios, 1 empleado que ofrece los 3 servicios, 2 cliente con sus
    respectivos representantes, 3 citas y 1 atención*/
    public void inicializarSistema(){
        servicios = new ArrayList<>();
        servicios.add(new Servicio("Terapia de Lenguaje",15,22.50, true));
        servicios.add(new Servicio("Terapia Psicopedagógica",35,37.50, true));
        servicios.add(new Servicio("Terapia Relajante",20,15.15, true));
        
        empleados = new ArrayList<>();
        empleados.add(new Empleado("0914345665","Juan","0923573567","juan@gmail.com", true));
        empleados.get(0).getListaServicios().add(servicios.get(0));
        empleados.get(0).getListaServicios().add(servicios.get(1));
        empleados.get(0).getListaServicios().add(servicios.get(2));
        
        clientes = new ArrayList<>();
        Persona representante1 = new Persona("0453462369","María","0987445643","maria@gmail.com");
        clientes.add(new Cliente("0832834824","Mario","0992837659","mario@gmail.com",representante1));
        Persona representante2 = new Persona("0123456758","Carlos","2346263234","carlos@hotmail.com");
        clientes.add(new Cliente("0729586956","Melanie","0939872750","melanie@hotmail.com",representante2));
        
        citas = new ArrayList<>();
        citas.add(new Cita("2022-02-01","11:30:00",clientes.get(0),servicios.get(0),empleados.get(0)));
        citas.add(new Cita("2022-05-21","08:00:00",clientes.get(1),servicios.get(1),empleados.get(0)));
        citas.add(new Cita("2022-11-11","10:30:00",clientes.get(0),servicios.get(2),empleados.get(0)));
        
        atenciones = new ArrayList<>();
        atenciones.add(new Atencion(citas.get(0),34,empleados.get(0)));
    }
}
