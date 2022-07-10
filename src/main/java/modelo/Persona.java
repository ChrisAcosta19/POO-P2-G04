package modelo;

/**
 *
 * @author Ronald Gaibor
 */
public class Persona {
    //Atributos de la clase Persona
    private String cedula;
    private String nombre;
    private String telefono;
    private String email;
    
    //Constructor de Persona
    public Persona(String cedula, String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
    }
    
    //Método toString para mostrar información
    public String toString() {
        return "Nombre: "+nombre+", Cedula: "+cedula+", Telefono: "+telefono+", Email: "+email;
    }
    
    //Getters & Setters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
