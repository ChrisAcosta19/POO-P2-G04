/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author chris
 */
public class Servicio {
    //Atributos de la clase
    private String nombre;
    private int duracion;
    private double precio;
    private boolean estado; // false "Inactivo" true "Activo"

    //Constructor de la clase
<<<<<<< HEAD
    public Servicio(String nombre, int duracion, double precio) {
=======
    public Servicio(String nombre, int duracion, double precio, boolean estado) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c20595f (Implementación de métodos relacionados a la clase Servicio en Usuario)
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.estado = true;
=======
=======
>>>>>>> 38c5eea (Implementación de métodos relacionados a la clase Empleado en Usuario)
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.estado = estado;
<<<<<<< HEAD
>>>>>>> aa401a2 (Implementación de métodos relacionados a la clase Servicio en Usuario)
=======
>>>>>>> 38c5eea (Implementación de métodos relacionados a la clase Empleado en Usuario)
    }
       
    //metodo para cambiar los datos de un servicio
    public void editarServicio(String nombre, int duracion, double precio, boolean estado){
<<<<<<< HEAD
=======
>>>>>>> 0a8e3c1 (Implementación de métodos relacionados a la clase Servicio en Usuario)
>>>>>>> c20595f (Implementación de métodos relacionados a la clase Servicio en Usuario)
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.estado = estado;
    }
    
    //metodo para cambiar estado de servicio a Inactivo
    public void eliminarServicio(){
        this.estado = false;
    }   
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean getEstado() {
        return estado;
    }
    
    //metodo toString para mostrar informacion
    public String toString(){
        return "Nombre: "+nombre+", Duración: "+duracion+", Precio: "+precio+", Estado:"+(estado?"Activo":"Inactivo");       
    }
    
    //método que compara si dos servicios son iguales
    //Devuelve true si coinciden en todos los atributos
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        } else if(obj != null && obj instanceof Servicio){
            Servicio servicio = (Servicio) obj;
            boolean mismoNombre = nombre.equals(servicio.nombre);
            boolean mismaDuracion = duracion == servicio.duracion;
            boolean mismoPrecio = precio == servicio.precio;
            boolean mismoEstado = estado == servicio.estado;
            return mismoNombre && mismaDuracion && mismoPrecio && mismoEstado;
        }
        return false;
    }
}