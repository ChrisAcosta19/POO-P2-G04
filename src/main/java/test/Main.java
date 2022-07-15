package test;
import modelo.*;
import java.util.*;

/*
Clase main con las funcionalidades de:

Buscar Servicio, Empleado y Cliente
Crear Fecha y Hora
Manejar el Sistema con un Usuario nuevo
*/
public class Main {
  
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
  
  public static String crearFecha(Scanner sc) {
        String fecha;
        do {
            System.out.println("Ingrese el día (en 2 dígitos): ");
            String dia = sc.nextLine();
            System.out.println("Ingrese el mes (en 2 dígitos): ");
            String mes = sc.nextLine();
            System.out.println("Ingrese el año (en 4 dígitos): ");
            String año = sc.nextLine();
            fecha = año + "-" + mes + "-" + dia;
        } while (!Validacion.validarFecha(fecha));
        return fecha;
    }
  
  public static String crearHora(Scanner sc) {
        String horario;
        do {
            System.out.println("Ingrese la hora (formato 24 horas y en 2 dígitos): ");
            String hora = sc.nextLine();
            System.out.println("Ingrese el minuto (en 2 dígitos): ");
            String minuto = sc.nextLine();
            horario = hora + ":" + minuto + ":00";
        } while (!Validacion.validarHora(horario));
        return horario;
    }
  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usu = new Usuario();
        int opcion;

        usu.inicializarSistema();
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
        sc.close();
    }
}
