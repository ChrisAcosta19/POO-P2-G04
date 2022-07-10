package test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Christopher Acosta
 */
public class Validacion {
    public static boolean validarEntero(String entrada){
        try{
            int entero = Integer.parseInt(entrada);
            return true;
        } catch (Exception e) {
            System.out.println("Por favor ingrese un entero\n");
            return false;
        }
    }
    
    public static boolean validarDouble(String entrada){
        try{
            double real = Double.parseDouble(entrada);
            return true;
        } catch (Exception e) {
            System.out.println("Por favor ingrese un numero con decimales\n");
            return false;
        }
    }
    
    public static boolean validarFecha(String fecha){
        try{
            LocalDate date = LocalDate.parse(fecha);
            return true;
	} catch (Exception e) {
            System.out.println("Fecha no válida, ingrese de nuevo\n");
            return false;
        }
    }
    
    public static boolean validarHora(String horario){
        try{
            LocalTime time = LocalTime.parse(horario);
            return true;
	} catch (Exception e) {
            System.out.println("Hora no válida, ingrese de nuevo\n");
            return false;
        }
    }
    
    public static boolean validarNombre(String nombre){
        char[] letrasEspeciales = {'á','é','í','ó','ú','Á','É','Í','Ó','Ú','ñ','Ñ'};
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
    
    public static boolean validarEmail(String email){
        if(email.contains("@"))
            return true;
        else {
            System.out.println("Correo inválido\n");
            return false;
        }
    }
}