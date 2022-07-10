package test;

/**
 *
 * @author Christopher Acosta
 */
public class Menu {
    public static void mostrarMenuPrincipal(){
        System.out.println("Menú principal");
        System.out.println("1. Servicios");
        System.out.println("2. Empleados");
        System.out.println("3. Clientes");
        System.out.println("4. Citas");
        System.out.println("5. Atenciones");
        System.out.println("6. Salir");
        System.out.println("Ingrese una opción: ");
    }
    
    public static void mostrarMenuServicio(){
        System.out.println("Menú de Servicio:");
        System.out.println("1. Listar Servicios");
        System.out.println("2. Agregar Servicio");
        System.out.println("3. Editar Servicio");
        System.out.println("4. Eliminar Servicio");
        System.out.println("5. Salir al menú principal");
        System.out.println("Ingrese una opción: ");
    }
    
    public static void mostrarMenuEmpleado(){
        System.out.println("Menú de Empleado:");
        System.out.println("1. Listar Empleados");
        System.out.println("2. Agregar Empleado");
        System.out.println("3. Editar Empleado");
        System.out.println("4. Eliminar Empleado");
        System.out.println("5. Salir al menú principal");
        System.out.println("Ingrese una opción: ");
    }
    
    public static void mostrarMenuCliente(){
        System.out.println("Menú de Cliente:");
        System.out.println("1. Listar Clientes");
        System.out.println("2. Agregar Cliente");
        System.out.println("3. Editar Cliente");
        System.out.println("4. Salir al menú principal");
        System.out.println("Ingrese una opción: ");
    }
    
    public static void mostrarMenuCita(){
        System.out.println("Menú de Citas:");
        System.out.println("1. Agregar Cita");
        System.out.println("2. Consultar citas por fecha");
        System.out.println("3. Eliminar Citas");
        System.out.println("4. Salir al menú principal");
        System.out.println("Ingrese una opción: ");
    }
    
    public static void mostrarMenuAtencion(){
        System.out.println("Menú de Atenciones:");
        System.out.println("1. Registrar atencion");
        System.out.println("2. Consultar Atencion");
        System.out.println("3. Salir al menú principal");
        System.out.println("Ingrese una opción: ");
    }
}