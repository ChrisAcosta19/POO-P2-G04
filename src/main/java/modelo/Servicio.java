/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package modelo;

/**
 *
 * @author Christopher Acosta
 */
public class Servicio {
    private String nombre;
    private int duracion;
    private double precio;
    private boolean estado; // false "Inactivo" true "Activo"

    public Servicio(String nombre, int duracion, double precio) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.estado = true;
    }
    
    public Servicio(String nombre){
        this.nombre = nombre;
    }
       
    public void editarServicio(String nombre, int duracion, double precio, boolean estado){
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.estado = estado;
    }
    
    public void eliminarServicio(){
        this.estado = false;
    }   
    
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
    
    public String toString(){
        if(estado)
            return "Nombre: "+nombre+", Duracion: "+duracion+", Precio: "+precio+ ", Estado: Activo";
        else
            return "Nombre: "+nombre+", Duracion: "+duracion+", Precio: "+precio+ ", Estado: Inactivo";
    } 
    
    @Override
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if(obj != null && obj instanceof Servicio){
            Servicio servicio = (Servicio) obj;
            return nombre.equals(servicio.nombre);
        }
        return false;
    }
}