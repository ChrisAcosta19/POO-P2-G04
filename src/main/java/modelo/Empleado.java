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
      
    //Constructores de la clase
    public Empleado(String cedula, String nombre, String telefono, String email, boolean estado) {
        super(cedula, nombre, telefono, email);
        this.estado = estado;
        this.listaServicios = new ArrayList<>();
    }
    
    public Empleado(String cedula) {
        super(cedula);
        this.listaServicios = new ArrayList<>();
    }

    //metodo para cambiar los datos del empleado
    public void editarEmpleado(Empleado e){
        this.setCedula(e.getCedula());
        this.setNombre(e.getNombre());
        this.setTelefono(e.getTelefono());
        this.setEmail(e.getEmail());
        this.estado = e.estado;
    }
    
    //metodo que cambiar estado del empleado a Inactivo
    public void eliminarEmpleado() {
        this.estado = false;
    }
    
    //metodo toString para mostrar informacion
    @Override
    public String toString(){
        String servicios = "\nServicios del empleado "+getNombre()+":";
        for(Servicio s: listaServicios){
            servicios += "\n" + s.getNombre();
        }
        return super.toString()+", Estado: "+(estado?"Activo":"Inactivo")+servicios+"\n";
    }
    
    //Getters
    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }

    public boolean getEstado() {
        return estado;
    }
}