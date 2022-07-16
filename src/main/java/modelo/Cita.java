package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Juan Pablo Plúas
 */

public class Cita {
<<<<<<< HEAD
    private String fecha,hora;
=======
    //Atributos de clase Cita
    private String fecha;
    private String hora;
>>>>>>> 768ccf0 (Documentacion del codigo)
    private Cliente cliente;
    private Empleado encargadoServicio;
    
<<<<<<< HEAD
    static Scanner sc = new Scanner(System.in);
    
    public Cita (String fecha , String hora, Cliente cliente, Empleado encargadoServicio){
=======
    //Constructor de la clase
    public Cita(String fecha, String hora, Cliente cliente, Servicio servicio, Empleado encargadoServicio){
>>>>>>> 768ccf0 (Documentacion del codigo)
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.encargadoServicio = encargadoServicio;
    }

    public static boolean crearCita(String fecha, String hora, Cliente cliente, Empleado encargado, ArrayList<Cita> citasAgendadas){
        
        Cita cita =new Cita(fecha,hora,cliente,encargado);
        
        boolean fechaOcupada = false;
        boolean horaOcupada = false;
        boolean encargadoOcupado = false;
        boolean citaAgendada = false;
        
        for (Cita c: citasAgendadas){
            if (fecha.equals(c.getFecha())){
                fechaOcupada = true;
            } else if (hora.equals(c.getHora())){
                horaOcupada = true;
            } else if (encargado.equals(c.getEncargadoServicio())){
                encargadoOcupado = true;
            }
        }
        
        if (fechaOcupada && horaOcupada && encargadoOcupado){
            return citaAgendada;
        }     
        else {
            citasAgendadas.add(cita);
            citaAgendada = true;
            System.out.println("Cita agendada con �xito");
            return citaAgendada;
        }      
    }
        
    public static boolean consultarCita(String fechaConsulta, ArrayList<Cita> citasAgendadas){
        boolean fechaExiste = false;
        for (Cita c: citasAgendadas){
            if (fechaConsulta.equals(c.getFecha())){
                System.out.println(c);
                fechaExiste = true;
            }
        }
         return fechaExiste;
    }
    public static boolean eliminarCita(String cedulaConsulta, ArrayList<Cita> citasAgendadas){
        ArrayList<Integer> indicesCitasUsuario = new ArrayList<Integer>();
        boolean cedulaExiste = false;
        for (int i=0; i<citasAgendadas.size();i++){
            int cantidadCitasUsuario=0;
            if (cedulaConsulta.equals(citasAgendadas.get(i).getCliente().getCedula())){
                indicesCitasUsuario.add(i);
                System.out.println("ID: "+ i + " " + citasAgendadas.get(i));
                cantidadCitasUsuario++;
                cedulaExiste = true;
                
                System.out.print("Ingrese el ID de la cita a eliminar: ");
                int indiceIngresadoEliminar = sc.nextInt();
                sc.nextLine();
                citasAgendadas.remove(indiceIngresadoEliminar);
                indicesCitasUsuario.remove(indicesCitasUsuario.indexOf(indiceIngresadoEliminar));

                for (int j=0;i<indicesCitasUsuario.size();j++){
                    int a= indicesCitasUsuario.get(j);
                    if (a>indiceIngresadoEliminar){
                        a-=1;
                        indicesCitasUsuario.set(j,a);
                    }
                }
            }   
        }   
        return cedulaExiste;
    }
    
<<<<<<< HEAD
    public String getFecha(){
=======
    //Getters
    public String getFecha() {
>>>>>>> 768ccf0 (Documentacion del codigo)
        return fecha;
    }
    public String getHora(){
        return hora;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public Empleado getEncargadoServicio(){
        return encargadoServicio;
    }
    
    //metodo toString para mostrar informacion del objeto
    @Override
    public String toString(){
<<<<<<< HEAD
        return "Fecha: "+ fecha + "\nHora: " + hora + 
                "\nCliente: " + cliente.getNombre() + 
                "\nEncargado de la cita: " + encargadoServicio.getNombre();
=======
        return "Fecha: " +fecha+ ", Hora: " +hora+ ", Cliente: " +cliente.getNombre()
                +", Encargado de la cita: "+encargadoServicio.getNombre();
    }
    
    
    /*metodo equals para comparar si dos citas son iguales
      primero evalua si coinciden en fecha, hora y encargado
      si lo anterior es falso, entonces evalua si coinciden en fecha, hora y cliente
    */
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        } else if(obj != null && obj instanceof Cita) {
            Cita cita = (Cita) obj;
            boolean mismaFecha = fecha.equals(cita.fecha);
            boolean mismaHora = hora.equals(cita.hora);
            boolean mismoCliente = cliente.equals(cita.cliente);
            boolean mismoEncargado = encargadoServicio.equals(cita.encargadoServicio);
            if(mismaFecha && mismaHora && mismoEncargado){
                return true;
            }
            return mismaFecha && mismaHora && mismoCliente;
        }
        return false;
>>>>>>> 768ccf0 (Documentacion del codigo)
    }
}