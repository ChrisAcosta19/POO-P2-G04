package modelo;
import java.util.ArrayList;

/**
 *
 * @author Ronald Gaibor
 */

public class Empleado extends Persona {
    //Atributos de la clase
    private boolean estado; // true = Activo, false = Inactivo
    private ArrayList<Servicio> listaServicios;
      
    //Constructor de la clase
    public Empleado(String cedula, String nombre, String telefono, String email, boolean estado) {
        super(cedula, nombre, telefono, email);
        this.estado = estado;
        this.listaServicios = new ArrayList<>();
    }

    //metodo para cambiar los datos del empleado
    public void editarEmpleado(String cedula, String nombre, String telefono, String email, boolean estado) {
        this.setCedula(cedula);
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setEmail(email);
        this.estado = estado;
    }
    
    //metodo que cambiar estado del empleado a Inactivo
    public void eliminarEmpleado() {
        this.estado = false;
    }
    
    //metodo toString para mostrar informacion
    @Override
    public String toString() {
        return super.toString()+", Estado: "+(estado?"Activo":"Inactivo");
    }
    
    //Getters
    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }

    public boolean getEstado() {
        return estado;
    }
}