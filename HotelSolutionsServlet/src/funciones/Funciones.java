package funciones;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funciones {


	public static int mcd(int a,int b) {
		 //sea a el mayor
		int aux=0;
		int r=1;
		
		if (a<b)
		    {
		      aux=a;
		      a=b;
		      b=aux;
		    		}
		 
		 while (b != 0){
			  r=a % b;
		      a=b;
		      aux=b;
		      b=r;
				 }
		
	return aux;
   }
	
	
	
	public static boolean esIgual(GregorianCalendar fecha1, GregorianCalendar fecha2){
		int anio1 = fecha1.get(GregorianCalendar.YEAR);
		int mes1 = fecha1.get(GregorianCalendar.MONTH);
		int dia1 = fecha1.get(GregorianCalendar.DAY_OF_MONTH);
		int anio2 = fecha2.get(GregorianCalendar.YEAR);
		int mes2 = fecha2.get(GregorianCalendar.MONTH);
		int dia2 = fecha2.get(GregorianCalendar.DAY_OF_MONTH);
		
		boolean flag=false;
		
		if(anio1 == anio2 && mes1 == mes2 && dia1 == dia2){
			flag=true;
			}	
			return flag;

		}
	
	public static int numeroDiaDeLaSemana(GregorianCalendar fecha){
		return fecha.get(Calendar.DAY_OF_WEEK);
	}
	
	public static String traerDiaDeLaSemana(GregorianCalendar fecha){
			
			int dia = fecha.get(GregorianCalendar.DAY_OF_WEEK);	
			
			
			if (dia == 1){
				String rta = "Domingo";
				return rta;
			}
			else if (dia == 2){
				String rta = "Lunes";
				return rta;
			}
			else if (dia == 3){
				String rta = "Martes";
				return rta;
			}
			else if (dia == 4){
				String rta = "Miercoles";
				return rta;
			}
			else if (dia == 5){
				String rta = "Jueves";
				return rta;
			}
			else if (dia == 6){
				String rta = "Viernes";
				return rta;
			}
			else if(dia == 7){
				String rta = "Sabado";
				return rta;
			}
			return null;
		}



	public static int traerMes(GregorianCalendar fecha){
		int mes = fecha.get(GregorianCalendar.MONTH);
		mes = mes + 1;
		
		return mes;
		
	}

	

	public static String traerMesLetras(GregorianCalendar fecha){
		int mes = fecha.get(GregorianCalendar.MONTH);
		mes = mes + 1;
		
		if (mes == 1){
			String rta = "Enero";
			return rta;
		}
		else if (mes == 2){
			String rta = "Febrero";
			return rta;
		}
		else if (mes == 3){
			String rta = "Marzo";
			return rta;
		}
		else if (mes == 4){
			String rta = "Abril";
			return rta;
		}
		else if (mes == 5){
			String rta = "Mayo";
			return rta;
		}
		else if (mes == 6){
			String rta = "Junio";
			return rta;
		}
		else if (mes == 7){
			String rta = "Julio";
			return rta;
		}
		else if (mes == 8){
			String rta = "Agosto";
			return rta;
		}
		else if (mes == 9){
			String rta = "Septiembre";
			return rta;
		}
		else if (mes == 10){
			String rta = "Octubre";
			return rta;
		}
		else if (mes == 11){
			String rta = "Noviembre";
			return rta;
		}
		else if (mes == 12){
			String rta = "Diciembre";
			return rta;
		}
	
		return null;
	
	}

	

	public static String traerFechaCorta(GregorianCalendar fecha){
		
		int anio = fecha.get(GregorianCalendar.YEAR);
		int mes = fecha.get(GregorianCalendar.MONTH);
		mes = mes+1;
		int dia = fecha.get(GregorianCalendar.DAY_OF_MONTH);
		
		return dia+ "/" +mes+ "/" +anio;
	}
	


	public static String traerFechaLarga(GregorianCalendar fecha1){
		
		int dia = fecha1.get(GregorianCalendar.DAY_OF_WEEK);
		int anio =fecha1.get(GregorianCalendar.YEAR);
		
		String FechaLarga = "La fecha es: "+traerDiaDeLaSemana(fecha1)+" "+dia+" de "+traerMesLetras(fecha1)+" de "+anio;
		
		return FechaLarga;
	}



	public static GregorianCalendar convertirGregorianCalendar(int anio, int mes, int dia){
		
		GregorianCalendar conversor = new GregorianCalendar(anio,mes,dia);
		
		return conversor;
	
		}



	public static boolean esBisiesto(int anio){
		
		if (anio%4 == 0 && anio%100 != 0){
			return true;
		}
		else if(anio%100 == 0 && anio%400 == 0){
			return true;
		 }
		else{
			return false;
		}
	 }
	
	
	
    public static int traerAnios(GregorianCalendar fNacimiento, GregorianCalendar fechaMaraton){
 

    	int difAnio = fechaMaraton.get(GregorianCalendar.YEAR) - fNacimiento.get(GregorianCalendar.YEAR);
    	int difMes = fechaMaraton.get(GregorianCalendar.MONTH) - fNacimiento.get(GregorianCalendar.MONTH);
    	int difDia = fechaMaraton.get(GregorianCalendar.DAY_OF_MONTH) - fNacimiento.get(GregorianCalendar.DAY_OF_MONTH);
    	
    	if (difDia < 0){
    		difMes -=1;
    	}
    	
    	if (difMes < 0) {
    			difAnio-=1;
    			difMes+=12;
    	}
    	
    	return difAnio;
    	
    }
    
    
    public static int traerEdad(GregorianCalendar fNacimiento){
    	
    	GregorianCalendar hoy = new GregorianCalendar();

    	int difAnio = hoy.get(GregorianCalendar.YEAR) - fNacimiento.get(GregorianCalendar.YEAR);
    	int difMes = (hoy.get(GregorianCalendar.MONTH)+1) - (fNacimiento.get(GregorianCalendar.MONTH)+1);
    	int difDia = hoy.get(GregorianCalendar.DAY_OF_MONTH) - fNacimiento.get(GregorianCalendar.DAY_OF_MONTH);
    	
    	if (difDia < 0){
    		difMes -=1;
    	}
    	
    	if (difMes < 0) {
    			difAnio-=1;
    			difMes+=12;
    	}
    	
    	return difAnio;
    	
    }
    
    
    
    
}