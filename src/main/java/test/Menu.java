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
<<<<<<< HEAD
=======
        do{
            System.out.println("Ingrese una opción: ");
            entradaDatos = sc.nextLine();
        } while(!Validacion.validarEntero(entradaDatos));
        return Integer.parseInt(entradaDatos);
>>>>>>> 22fc0c2 (Update Menu.java)
    }
    
<<<<<<< HEAD
    public static void mostrarMenuServicio(){
        System.out.println("Menú de Servicio:");
        System.out.println("1. Listar Servicios");
        System.out.println("2. Agregar Servicio");
        System.out.println("3. Editar Servicio");
        System.out.println("4. Eliminar Servicio");
        System.out.println("5. Salir al menú principal");
        System.out.println("Ingrese una opción: ");
=======
    public static void menuServicio(Scanner sc, Usuario usu){
        String entradaDatos; Servicio servicio;
        int opcion;
        do{
            System.out.println("Menú de Servicio:");
            System.out.println("1. Listar Servicios");
            System.out.println("2. Agregar Servicio");
            System.out.println("3. Editar Servicio");
            System.out.println("4. Eliminar Servicio");
            System.out.println("5. Salir al menú principal");
            do{
                System.out.println("Ingrese una opción: ");
                entradaDatos = sc.nextLine();
            }while(!Validacion.validarEntero(entradaDatos));
            opcion = Integer.parseInt(entradaDatos);
            switch(opcion){
                case 1:
                    usu.listarServicios();
                    break;
                case 2:
                    servicio = usu.crearServicio(sc);
                    usu.servicios.add(servicio);
                    break;
                case 3:
                    servicio = Main.buscarServicio(sc, usu);
                    Servicio s = usu.crearServicio(sc);
                    servicio.editarServicio(s);
                    break;
                case 4:
                    servicio = Main.buscarServicio(sc, usu);
                    servicio.eliminarServicio();
                    System.out.println("El Servicio "+servicio.getNombre()+" ha sido cambiado a Inactivo");
                case 5:
                    System.out.println("Regresando al menú princial\n");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo\n");
            }
        } while (opcion != 5);
>>>>>>> 64af89d (Actualización Menú Servicios)
    }
    
<<<<<<< HEAD
    public static void mostrarMenuEmpleado(){
        System.out.println("Menú de Empleado:");
        System.out.println("1. Listar Empleados");
        System.out.println("2. Agregar Empleado");
        System.out.println("3. Editar Empleado");
        System.out.println("4. Eliminar Empleado");
        System.out.println("5. Salir al menú principal");
        System.out.println("Ingrese una opción: ");
=======
    public static void menuEmpleado(Scanner sc, Usuario usu){
        String entradaDatos; Servicio servicio;
        int opcion; Empleado empleado;
        do{
            System.out.println("Menú de Empleado:");
            System.out.println("1. Listar Empleados");
            System.out.println("2. Agregar Empleado");
            System.out.println("3. Editar Empleado");
            System.out.println("4. Eliminar Empleado");
            System.out.println("5. Salir al menú principal");
            do{
                System.out.println("Ingrese una opción: ");
                entradaDatos = sc.nextLine();
            }while(!Validacion.validarEntero(entradaDatos));
            opcion = Integer.parseInt(entradaDatos);
            switch(opcion){
                case 1:
                    usu.listarEmpleados();
                    break;
                case 2:
                    empleado = usu.crearEmpleado(sc, null);
                    usu.empleados.add(empleado);
                    break;
                case 3:
                    empleado = Main.buscarEmpleado(sc, usu);
                    Empleado e = usu.crearEmpleado(sc, empleado);
                    empleado.editarEmpleado(e);
                do{
                    do{
                        System.out.println("Ingrese una de las opciones: ");
                        System.out.println("1) Agregar servicio al empleado");
                        System.out.println("2) Retirar servicio del empleado");
                        System.out.println("3) No modificar los servicios del empleado");
                        System.out.println("Ingrese su opción: ");
                        entradaDatos = sc.nextLine();
                    }while(!Validacion.validarEntero(entradaDatos));
                    opcion = Integer.parseInt(entradaDatos);
                    switch(opcion){
                        case 1:
                            servicio = Main.buscarServicio(sc, usu);
                            empleado.getListaServicios().add(servicio);
                            break;
                        case 2:
                            servicio = Main.buscarServicio(sc, usu);
                            empleado.getListaServicios().remove(servicio);
                            break;
                        case 3:
                            System.out.println("No se han modificado los servicios del empleado");
                            break;
                        default:
                            System.out.println("Opción inválida, ingrese de nuevo\n");
                    }
                } while (opcion < 1 || opcion > 3);
                break;
                case 4:
                    empleado = Main.buscarEmpleado(sc, usu);
                    empleado.eliminarEmpleado();
                    System.out.println("El empleado " + empleado.getNombre() + " ha sido cambiado a Inactivo");
                    break;
                case 5:
                    System.out.println("Regresando al menú princial\n");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo\n");
                }
        }while(opcion != 5);
>>>>>>> c9a8aad (Agregado metodo menuServicio en clase Menu)
    }
    
<<<<<<< HEAD
    public static void mostrarMenuCliente(){
        System.out.println("Menú de Cliente:");
        System.out.println("1. Listar Clientes");
        System.out.println("2. Agregar Cliente");
        System.out.println("3. Editar Cliente");
        System.out.println("4. Salir al menú principal");
        System.out.println("Ingrese una opción: ");
=======
    public static void menuCliente(Scanner sc, Usuario usu){
        String entradaDatos;
        int opcion; Cliente cliente;
        do{
            System.out.println("Menú de Cliente:");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Agregar Cliente");
            System.out.println("3. Editar Cliente");
            System.out.println("4. Salir al menú principal");
            do {
                System.out.println("Ingrese una opción: ");
                entradaDatos = sc.nextLine();
            } while (!Validacion.validarEntero(entradaDatos));
            opcion = Integer.parseInt(entradaDatos);
            switch (opcion) {
                case 1:
                    usu.listarClientes();
                    break;
                case 2:
                    cliente = usu.crearCliente(sc, null, null);
                    usu.clientes.add(cliente);
                    break;
                case 3:
                    cliente = Main.buscarCliente(sc, usu);
                    Persona representante = cliente.getDatosRepresentante();
                    Cliente c = usu.crearCliente(sc, cliente, representante);
                    cliente.editarCliente(c);
                    break;
                case 4:
                    System.out.println("Regresando al menú princial\n");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo\n");
            }
        } while (opcion != 4);
>>>>>>> 99375af (Actualización Menú Cliente)
    }
    
<<<<<<< HEAD
    public static void mostrarMenuCita(){
        System.out.println("Menú de Citas:");
        System.out.println("1. Agregar Cita");
        System.out.println("2. Consultar citas por fecha");
        System.out.println("3. Eliminar Citas");
        System.out.println("4. Salir al menú principal");
        System.out.println("Ingrese una opción: ");
=======
    public static void menuCita(Scanner sc, Usuario usu){
        String entradaDatos, fecha, hora, cedula; Servicio servicio;
        int opcion; Cliente cliente; Empleado empleado;
        do{
            System.out.println("Menú de Citas:");
            System.out.println("1. Agregar Cita");
            System.out.println("2. Consultar citas por fecha");
            System.out.println("3. Eliminar Citas");
            System.out.println("4. Salir al menú principal");
            do {
                System.out.println("Ingrese una opción: ");
                entradaDatos = sc.nextLine();
            } while (!Validacion.validarEntero(entradaDatos));
            opcion = Integer.parseInt(entradaDatos);
            switch (opcion) {
                case 1:
                    fecha = Main.crearFecha(sc);
                    hora = Main.crearHora(sc);
                    cliente = Main.buscarCliente(sc, usu);
                    servicio = Main.buscarServicio(sc, usu);
                    empleado = Main.buscarEmpleado(sc, usu);
                    Cita cita = new Cita(fecha, hora, cliente, servicio, empleado);
                    usu.crearCita(cita);
                    break;
                case 2:
                    fecha = Main.crearFecha(sc);
                    usu.consultarCitas(fecha);
                    break;
                case 3:
                    usu.listarClientes();
                    do {
                        System.out.println("Ingrese la cédula del cliente: ");
                        cedula = sc.nextLine();
                        cliente = new Cliente(cedula);
                        if (!usu.clientes.contains(cliente)) {
                            System.out.println("No existe un cliente con esa cédula, ingrese de nuevo\n");
                        }
                    } while (!usu.clientes.contains(cliente));
                    usu.eliminarCita(sc, cedula);
                    break;
                case 4:
                    System.out.println("Regresando al menú princial\n");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo\n");
            }
        } while (opcion != 4);
>>>>>>> 898e544 (Agregado metodo menuCita en clase Menu)
    }
    
<<<<<<< HEAD
    public static void mostrarMenuAtencion(){
        System.out.println("Menú de Atenciones:");
        System.out.println("1. Registrar atencion");
        System.out.println("2. Consultar Atencion");
        System.out.println("3. Salir al menú principal");
        System.out.println("Ingrese una opción: ");
=======
    public static void menuAtencion(Scanner sc, Usuario usu){
        String entradaDatos, cedula;
        int opcion; Empleado empleado;
        do{
            System.out.println("Menú de Atenciones:");
            System.out.println("1. Registrar atencion");
            System.out.println("2. Consultar Atencion");
            System.out.println("3. Salir al menú principal");
            do {
                System.out.println("Ingrese una opción: ");
                entradaDatos = sc.nextLine();
            } while (!Validacion.validarEntero(entradaDatos));
            opcion = Integer.parseInt(entradaDatos);
            switch (opcion) {
                case 1:
                    usu.listarClientes();
                    do {
                        System.out.println("Ingrese cédula del cliente:");
                        cedula = sc.nextLine();
                    } while (!Validacion.validarEntero(cedula));
                    ArrayList<Cita> citasPendientes = usu.buscarCitasPendientes(cedula);
                    int i;
                    if (!citasPendientes.isEmpty()) {
                        System.out.println("Escoja 1 de las citas que no han sido registradas:");
                        for (i = 0; i < citasPendientes.size(); i++) {
                            System.out.println((i + 1) + ") " + citasPendientes.get(i));
                        }
                        do {
                            do {
                                System.out.println("Ingrese su opción: ");
                                entradaDatos = sc.nextLine();
                            } while (!Validacion.validarEntero(entradaDatos));
                            opcion = Integer.parseInt(entradaDatos);
                            if (opcion < 1 || opcion > i) {
                                System.out.println("Opción inválida, ingrese de nuevo\n");
                            }
                        } while (opcion < 1 || opcion > i);
                        Cita cita = citasPendientes.get(opcion - 1);
                        do {
                            System.out.println("Ingrese la duración de la atención:");
                            entradaDatos = sc.nextLine();
                        } while (!Validacion.validarEntero(entradaDatos));
                        int duracion = Integer.parseInt(entradaDatos);
                        empleado = Main.buscarEmpleado(sc, usu);
                        usu.atenciones.add(new Atencion(cita, duracion, empleado));
                    } else {
                        System.out.println("Todas las citas del cliente " + cedula + " han sido atendidas");
                    }
                    break;
                case 2:
                    do {
                        do {
                            System.out.println("1) Consultar por cédula de Empleado");
                            System.out.println("2) Consultar por cédula de Cliente");
                            System.out.println("3) Consultar por fecha");
                            System.out.println("Ingrese su opción: ");
                            entradaDatos = sc.nextLine();
                        } while (!Validacion.validarEntero(entradaDatos));
                        opcion = Integer.parseInt(entradaDatos);
                        if (opcion < 1 || opcion > 3) {
                            System.out.println("Opcion inválida, ingrese de nuevo\n");
                        }
                    } while (opcion < 1 || opcion > 3);
                    usu.consultarAtenciones(sc, opcion);
                    break;
                case 3:
                    System.out.println("Regresando al menú princial\n");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo\n");
            }
        } while (opcion != 3);
>>>>>>> b797361 (Actualización Menú Atención)
    }
}