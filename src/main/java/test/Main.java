package test;
import modelo.*;
import java.util.*;

public class Main {
    //método estático para buscar un servicio de la lista servicios de Usuario
    public static Servicio buscarServicio(Scanner sc, Usuario usu) {
        int i = usu.servicios.size(), opcion;
        String entradaDatos;
        System.out.println("Seleccione 1 de los siguientes servicios: ");
        usu.listarServicios();
        do {
            do {
                System.out.println("Ingrese una opcion: ");
                entradaDatos = sc.nextLine();
            } while (!Validacion.validarEntero(entradaDatos));
            opcion = Integer.parseInt(entradaDatos);
            if (opcion < 1 || opcion > i) {
                System.out.println("Opcion fuera de rango, ingrese de nuevo");
            }
        } while (opcion < 1 || opcion > i);
        return usu.servicios.get(opcion - 1);
    }
  
    //método estático para buscar un empleado de la lista empleados de Usuario
    public static Empleado buscarEmpleado(Scanner sc, Usuario usu) {
        int i = usu.empleados.size(), opcion;
        String entradaDatos;
        System.out.println("Seleccione 1 de los siguientes empleados: ");
        usu.listarEmpleados();
        do {
            do {
                System.out.println("Ingrese una opcion: ");
                entradaDatos = sc.nextLine();
            } while (!Validacion.validarEntero(entradaDatos));
            opcion = Integer.parseInt(entradaDatos);
            if (opcion < 1 || opcion > i) {
                System.out.println("Opcion fuera de rango, ingrese de nuevo");
            }
        } while (opcion < 1 || opcion > i);
        return usu.empleados.get(opcion - 1);
    }

    //método estático para buscar un cliente de la lista clientes de Usuario
    public static Cliente buscarCliente(Scanner sc, Usuario usu) {
        int i = usu.clientes.size(), opcion;
        String entradaDatos;
        System.out.println("Seleccione 1 de los siguientes clientes: ");
        usu.listarClientes();
        do {
            do {
                System.out.println("Ingrese una opcion: ");
                entradaDatos = sc.nextLine();
            } while (!Validacion.validarEntero(entradaDatos));
            opcion = Integer.parseInt(entradaDatos);
            if (opcion < 1 || opcion > i) {
                System.out.println("Opcion fuera de rango, ingrese de nuevo");
            }
        } while (opcion < 1 || opcion > i);
        return usu.clientes.get(opcion - 1);
    }
  
    //método estático para crear una fecha
    //El formato es AAAA-MM-DD de la norma ISO 8601
    public static String crearFecha(Scanner sc) {
        String fecha;
        System.out.println("Para la fecha utilice la norma ISO 8601, es decir AAAA-MM-DD");
        System.out.println("Por ejemplo 2020-03-02 sería 2 de marzo del 2020");
        do {
            System.out.println("Ingrese una fecha:");            
            fecha = sc.nextLine();
        } while (!Validacion.validarFecha(fecha));
        return fecha;
    }
    
    //método estático para crear expresiones de hora
    //El formato es hh-mm-ss de la norma ISO 8601
    public static String crearHora(Scanner sc) {
        String hora;
        System.out.println("Para la hora utilice la norma ISO 8601, es decir hh:mm:ss");
        System.out.println("donde hh está en formato 24 horas");
        System.out.println("Por ejemplo 14:30:00 sería 2:30 p.m.");
        System.out.println("Otro ejemplo 07:00:00 sería 7:00 a.m.");
        do {
            System.out.println("Ingrese la hora: ");
            hora = sc.nextLine();
        } while (!Validacion.validarHora(hora));
        return hora;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //objeto Scanner para leer por teclado
        Usuario usu = new Usuario(); //objeto usuario para usar sus métodos
        int opcion;

        usu.inicializarSistema(); //creación de los objetos
        /*en este lazo se muestra el menu principal donde se pide una opción de Menú
        y luego según sea el caso del switch llama el método correspondiente de la clase Menu
        Como se puede apreciar se pasa el objeto Scanner en cada método, esto se hace para
        no tener que estar creando más objetos Scanner dentro de cada método*/
        do {
            opcion = Menu.menuPrincipal(sc);
            switch (opcion) {
                case 1:
                    Menu.menuServicio(sc, usu);
                    break;
                case 2:
                    Menu.menuEmpleado(sc, usu);
                    break;
                case 3:
                    Menu.menuCliente(sc, usu);
                    break;
                case 4:
                    Menu.menuCita(sc, usu);
                    break;
                case 5:
                    Menu.menuAtencion(sc, usu);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo\n");
            }
        } while (opcion != 6);
        sc.close(); //Se cierra el objeto Scanner
    }
}