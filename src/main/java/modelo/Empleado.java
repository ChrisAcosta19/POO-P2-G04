package Modelo;

/**
 *
 * @author Ronald Gaibor
 */
import java.util.ArrayList;

public class Empleado extends Persona {
    private boolean estado; // true = Activo, false = Inactivo
    private ArrayList<Servicio> listaServicios = new ArrayList<>();
      
    public Empleado(String cedula, String nombre, String telefono, String email, boolean estado) {
        super(cedula, nombre, telefono, email);
        this.estado = true;
    }

    public void editarEmpleado(String nombre, String telefono, String email) {
        setNombre(nombre);
        setTelefono(telefono);
        setEmail(email);
    }
    
    public void eliminarEmpleado() {
        this.estado = false;
    }
    
    @Override
    public String mostrarInformacion() {
        String info = super.mostrarInformacion()+"\nEstado: "+(estado?"Activo":"Inactivo");
        return info;
    }
    
    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }

    public boolean getEstado() {
        return estado;
    }
}
