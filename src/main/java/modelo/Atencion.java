/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Christopher Acosta
 */
public class Atencion {
<<<<<<< HEAD
    private Cita cita;
    private int duracion;
    private Empleado empleadoAtencion;

    public Atencion(Cita cita, int duracion, Empleado empleadoAtencion) {
        this.cita = cita;
        this.duracion = duracion;
        this.empleadoAtencion = empleadoAtencion;
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