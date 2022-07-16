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
    public Servicio(String nombre, int duracion, double precio, boolean estado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.estado = estado;
    }
       
    //metodo para cambiar los datos de un servicio
    public void editarServicio(Servicio s){
        this.nombre = s.nombre;
        this.duracion = s.duracion;
        this.precio = s.precio;
        this.estado = s.estado;
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