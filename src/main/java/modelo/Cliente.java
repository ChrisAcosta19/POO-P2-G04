package Modelo;

/**
 *
 * @author Ronald Gaibor
 */

public class Cliente extends Persona {
    private Persona datosRepresentante;
    
    public Cliente(String cedula, String nombre, String telefono, String email, Persona datosRepresentante) {
        super(cedula, nombre, telefono, email);
        this.datosRepresentante = datosRepresentante;
    }

    public void editarCliente(String nombre, String telefono, String email, Persona datosRepresentante) {
        setNombre(nombre);
        setTelefono(telefono);
        setEmail(email);
        this.datosRepresentante = datosRepresentante;
    }
    
    @Override
    public String mostrarInformacion() {
        String info = super.mostrarInformacion()+"\nDatos del representante:\n"+datosRepresentante.mostrarInformacion();
        return info;
    }
    
    public Persona getDatosRepresentante() {
        return datosRepresentante;
    }
}
