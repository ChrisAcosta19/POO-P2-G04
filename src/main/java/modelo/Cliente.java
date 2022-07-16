package modelo;

/**
 *
 * @author Ronald Gaibor
 */

public class Cliente extends Persona {
    //Atributos de la clase
    private Persona datosRepresentante;
    
    //Constructores de la clase
    public Cliente(String cedula, String nombre, String telefono, String email, Persona datosRepresentante) {
        super(cedula, nombre, telefono, email);
        this.datosRepresentante = datosRepresentante;
    }

    //método para cambiar los datos del cliente
    public void editarCliente(String nombre, String telefono, String email, Persona datosRepresentante) {
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setEmail(email);
        this.datosRepresentante = datosRepresentante;
    }
    
    //metodo toString para mostrar informacion
    @Override
    public String toString() {
        return super.toString()+"\nDatos del representante:\n"+datosRepresentante+"\n";
    }
    
    //Getters
    public Persona getDatosRepresentante() {
        return datosRepresentante;
    }
}
