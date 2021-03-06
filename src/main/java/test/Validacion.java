package test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Christopher Acosta
 */

//Esta clase se encarga de validar numeros, nombres, fechas y horas
public class Validacion {
    //metodo que recibe un String y trata de convertirlo a entero
    /*se opto por Long porque tanto cedula como telefono tienen 10 digitos
    y Long acepta valores de esa longitud*/
    public static boolean validarEntero(String entrada){
        try{
            Long.parseLong(entrada);
            return true;
        } catch (Exception e) {
            System.out.println("Por favor ingrese un entero\n");
            return false;
        }
    }
    
    //metodo que recibe un String y trata de convertirlo a double
    public static boolean validarDouble(String entrada){
        try{
            Double.parseDouble(entrada);
            return true;
        } catch (Exception e) {
            System.out.println("Por favor ingrese un numero con decimales\n");
            return false;
        }
    }
    
    //metodo que recibe un String y trata de convertirlo a una fecha
    /*La sentencia LocalDate.parse(fecha) se encarga de revisar si lo digitado tiene
    un año en 4 digitos, un mes en 2 dígitos y un día en 2 dígitos. También controla
    que se puedan crear fechas válidas, es decir que ingrese un dia del 01 al 31 o
    del 01 al 30 según corresponda el mes, también que en el caso de febrero que
    ingrese del 01 al 28 si el año no es bisiesto y del 01 al 29 caso contrario*/
    public static boolean validarFecha(String fecha){
        try{
            LocalDate.parse(fecha);
            return true;
	} catch (Exception e) {
            System.out.println("Fecha no válida, ingrese de nuevo\n");
            return false;
        }
    }
    
    //metodo que recibe un String y trata de convertirlo a una hora
    /*La sentencia LocalTime.parse(horario) se encarga de revisar si lo digitado tiene
    una hora en 2 digitos, un minuto en 2 digitos y un segundo en 2 digitos. También
    controla que se puedan crear horarios válidos, es decir que la hora ingresada este
    entre 00 y 23, los minutos vayan del 00 al 59 y los segundos de igual forma*/
    public static boolean validarHora(String hora){
        try{
            LocalTime.parse(hora);
            return true;
	} catch (Exception e) {
            System.out.println("Hora no válida, ingrese de nuevo\n");
            return false;
        }
    }
    
    //metodo que recibe un String y trata de ver si califica para un nombre
    /*Un String será aceptado como un nombre solo si se ingresan leras o el espacio en blanco
    una letra puede estar en mayúscula, minúscula (clasificadas por su codigo ASCII)o ser uno
    de los caracteres del array de letrasEscpeciales*/
    public static boolean validarNombre(String nombre){
        char[] letrasEspeciales = {'á','é','í','ó','ú','Á','É','Í','Ó','Ú','ñ','Ñ','Ü','ü'};
        ArrayList<Character> listaLetras = new ArrayList<>();
        for (char letra:letrasEspeciales)
            listaLetras.add(letra);
        
        for(int i=0;i<nombre.length();i++){
            char letra = nombre.charAt(i);
            int valorASCII = (int) letra;
            boolean esMayuscula = valorASCII >= 65 && valorASCII <= 90;
            boolean esMinuscula = valorASCII >= 97 && valorASCII <= 122;
            boolean esLetraEspecial = listaLetras.contains(letra);
            if(!esMayuscula && !esMinuscula && !esLetraEspecial && valorASCII != 32) { //el 32 es el espacio en blanco
                System.out.println("Nombre no válido\n");
                return false;
            }
        }
        return true;
    }
    
    //metodo que recibe un String y trata de ver si califica para un email
    /*Un String será aceptado como email si por lo menos tiene el @ entre sus caracteres.
    Dado que resultaría complicado conocer todos los dominios de email que existen,
    entonces por lo menos debería tener el @*/
    public static boolean validarEmail(String email){
        if(email.contains("@"))
            return true;
        else {
            System.out.println("Correo inválido\n");
            return false;
        }
    }
}