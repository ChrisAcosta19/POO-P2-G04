package modelo;

import java.util.Arrays;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {
    
    static Scanner sc = new Scanner(System.in);
    
    public static boolean containsInt(int[] arr, int valor) {
        return Arrays.stream(arr).anyMatch(i -> i == valor);
    }

    public static String fecha1(){
        int[] meses31= {1,3,5,7,8,10,12};
        int fechaOk=0;
        String fechaIngresada=null;
        while (fechaOk==0){
            System.out.println("Fecha: ");
            fechaIngresada = sc.nextLine();
            if (fechaIngresada.contains("/")){
                String[] fechaIngresadaSplit = fechaIngresada.split("/");
                if (fechaIngresadaSplit.length==3){
                    int dia= Integer.valueOf(fechaIngresadaSplit[0]);
                    int mes= Integer.valueOf(fechaIngresadaSplit[1]);
                    int anio= Integer.valueOf(fechaIngresadaSplit[2]);
                    if (1<=mes && mes<=12 && 2022<=anio){
                        if (containsInt(meses31,mes)){
                            if (!(1<=dia && dia<=31)){
                                System.out.println("Fecha no valida, ingrese nuevamente");
                            } else {
                                fechaOk=1;
                                return fechaIngresada;  
                            }
                        } else {
                            if (!(1<=dia && dia<=30)){
                                System.out.println("Fecha no valida, ingrese nuevamente");
                            } else {
                                fechaOk=1;
                                return fechaIngresada;
                            }
                        }
                    } else {
                        System.out.println("Fecha no valida, ingrese nuevamente");
                    }
                    
                }
            }
             
        }
        return fechaIngresada;
    }
    
    public static String fecha() {
        Scanner sc=new Scanner(System.in);
        int fechaOk=0;
        String fechaIngresada=null;
        boolean valida=true;
        while (fechaOk==0){
            System.out.println("Fecha: ");
            fechaIngresada=sc.nextLine();
            valida=esFecha(fechaIngresada);
            if(valida){
                fechaOk=1;            
            } else { System.out.println("Fecha no valida, ingrese nuevamente"); }
        }
        return fechaIngresada;
    }
    
    public static boolean esFecha(String fecha){
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    public static String horaRango1(String apertura, String cierre, int duracionCita){
        
        String horaIngresada=null;
        int horaOk=0;
        String[] aperturaSplit = apertura.split(":");
        String[] cierreSplit = cierre.split(":");
        int horaA= Integer.valueOf(aperturaSplit[0]);
        int minutosA= Integer.valueOf(aperturaSplit[1]);
        int horaC= Integer.valueOf(cierreSplit[0]);
        int minutosC= Integer.valueOf(cierreSplit[1]);
        while (horaOk==0){
            System.out.print("Hora: ");
            horaIngresada = sc.nextLine();
            if (horaIngresada.contains(":")){
                String[] horaIngresadaSplit = horaIngresada.split(":");
                if (horaIngresadaSplit.length==2){
                    int horas= Integer.valueOf(horaIngresadaSplit[0]);
                    int minutos= Integer.valueOf(horaIngresadaSplit[1]);
                    int minLimite=minutosC-duracionCita;
                    if (horaC== horas && minLimite<0){
                        if (horaA<=horas && horas<horaC && horas!=horaC){
                            horaOk=1;
                    } else if (minLimite>=0){
                        if (horaA<=horas && (horas<horaC || horas==horaC)){
                            horaOk=1;
                        }      
                    }
                    
                    } else System.out.println("Horario no valido, ingrese nuevamente");
                    
                        
                } else System.out.println("Hora no valido, ingrese nuevamente");
            } else System.out.println("Hora no valido, ingrese nuevamente");
        }
        return horaIngresada;
    }
    
    private static boolean esHora(String horaIngresada, String apertura, String cierre) throws ParseException {
      Date actual = new SimpleDateFormat("HH:mm").parse(horaIngresada.trim());
      Date inicial = new SimpleDateFormat("HH:mm").parse(apertura.trim());
      Date fin = new SimpleDateFormat("HH:mm").parse(cierre.trim());
      if(actual.after(inicial) && actual.before(fin)){
          return true;
        }
      return false;
}
    
    public static String horaRango(String apertura, String cierre, int duracionCita){
        String horaIngresada=null;
        int horaOk=0;
        
        String[] aperturaSplit = apertura.split(":");
        int horaA= Integer.valueOf(aperturaSplit[0]);
        horaA--;
        String horaAS=String.valueOf(horaA);
        aperturaSplit[1]="59";
        aperturaSplit[0]=horaAS;
        apertura = String.join(":",aperturaSplit);
        
        String[] cierreSplit = cierre.split(":");
        int minutosC= Integer.valueOf(cierreSplit[1]);
        minutosC-=duracionCita;
        String minutosCS=String.valueOf(minutosC);
        cierreSplit[1]=minutosCS;
        cierre = String.join(":",cierreSplit);
        
        while (horaOk==0){
            System.out.print("Hora: ");
            horaIngresada = sc.nextLine();            
            if (horaIngresada.contains(":")){
                try {
                    if (esHora(horaIngresada,apertura,cierre)){
                        horaOk=1;
                    } else System.out.println("Horario no valido, ingrese nuevamente");
                } catch (ParseException ex) {
                    Logger.getLogger(Validar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        return horaIngresada;
    }
    
    public static String nombre(){
        
        int nombreOk=0;
        String nombreIngresado=null;
        while(nombreOk==0){
            System.out.print("Nombre: ");
            nombreIngresado = sc.nextLine();
        
            String[] nombreSplit = nombreIngresado.split(" ");
            boolean todoLetras=true;
            if (nombreSplit.length ==4){
                for (String s:nombreSplit){
                boolean a=esSoloLetras(s);
                    if (a==false){
                        todoLetras=false;
                    }
                }
            if (todoLetras){
                nombreOk=1;
                return nombreIngresado;  
            } else System.out.println("Nombre no valido, ingrese nuevamente");
                   
            } else System.out.println("Nombre no valido, ingrese nuevamente");
                   
        } 
        return nombreIngresado;
    }
    
    private static boolean esSoloLetras(String cadena){
	for (int i = 0; i < cadena.length(); i++){
            char caracter = cadena.toUpperCase().charAt(i);
            int valorASCII = (int)caracter;
	if (valorASCII == 165 || (valorASCII > 65 || valorASCII < 90))
            return true; }
		
        return false;
	}
    
    private static boolean esNumero(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    public static String cedula(){
        
        int cedulaOk=0;
        String cedulaIngresada=null;
        while(cedulaOk==0){
            System.out.print("Cedula: ");
            cedulaIngresada = sc.nextLine();
            if (cedulaIngresada.length()==10){
                if (esNumero(cedulaIngresada)){
                    cedulaOk=1;
                    return cedulaIngresada;    
                } else System.out.println("Cedula no valida, ingrese nuevamente");
            } else System.out.println("Cedula no valida, ingrese nuevamente");
        }
        return cedulaIngresada; 
    }
    
    public static String telefono(){
        
        int telefonoOk=0;
        String telefonoIngresado=null;
        while(telefonoOk==0){
            System.out.print("Telefono: ");
            telefonoIngresado = sc.nextLine();
            if (telefonoIngresado.length()==10){
                if (esNumero(telefonoIngresado)){
                    telefonoOk=1;
                    return telefonoIngresado;    
                } else System.out.println("Telfono no valido, ingrese nuevamente");
            } else System.out.println("Telfono no valido, ingrese nuevamente");
        }
        return telefonoIngresado; 
    }
    
    public static String email(){
        
        int emailOk=0;
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String emailIngresado=null;
        while(emailOk==0){
            System.out.print("Email: ");
            emailIngresado = sc.nextLine();
            
            Matcher mather = pattern.matcher(emailIngresado);
            if (mather.find()) {
                emailOk=1;
                return emailIngresado;
            } else {
            System.out.println("Email no es valido, ingrese nuevamente");
        }
        }
        return emailIngresado;    
    }
    
}
