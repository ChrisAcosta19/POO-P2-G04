/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Christopher Acosta
 */
public class Atencion {
<<<<<<< HEAD
<<<<<<< HEAD
=======
    //Atributos de clase Atencion
>>>>>>> c17822a (Creacion de paquete test con clase Menu.java)
    private Cita cita;
    private int duracion;
    private Empleado empleadoAtencion;

    //Constructor de la clase
    public Atencion(Cita cita, int duracion, Empleado empleadoAtencion) {
        this.cita = cita;
        this.duracion = duracion;
        this.empleadoAtencion = empleadoAtencion;
    }
    
    //Getters
    public Cita getCita() {
        return cita;
    }

    public int getDuracion() {
        return duracion;
    }

    public Empleado getEmpleadoAtencion() {
        return empleadoAtencion;
    }
    
    //metodo toString para mostrar informacion
    @Override
    public String toString(){
        return "Cita registrada: "+cita.toString()+"\nduración: "+duracion+" minutos"
                +", Empleado que atendió: "+empleadoAtencion.getNombre();
    }
=======
  private Cita cita;
  private int duracion;
  private Empleado empleadoAtencion;

  public Atencion(Cita cita, int duracion, Empleado empleadoAtencion) {
    this.cita = cita;
    this.duracion = duracion;
    this.empleadoAtencion = empleadoAtencion;
  }
    
  @Override
  public String toString(){
    return "Cita registrada:\n"+cita.toString()+"\nduracion: "+duracion+
            "Empleado que atendió:\n"+empleadoAtencion.toString();
  }

  public Cita getCita() {
    return cita;
  }
  
  public int getDuracion() {
    return duracion;
  }

  public Empleado getEmpleadoCita() {
    return empleadoAtencion;
  }
>>>>>>> fc06587 (Creacion de clase Atencion.java)
}