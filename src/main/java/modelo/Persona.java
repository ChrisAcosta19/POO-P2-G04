package Modelo;

public abstract class Persona {
    private String cedula;
    private String nombre;
    private String telefono;
    private String email;
    
    public Persona(String cedula, String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
    }
    
    public String mostrarInformacion () {
        return "Nombre: "+nombre+"\nCedula: "+cedula+"\nTelefono: "+telefono+"\nEmail: "+email;
    }
    
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
