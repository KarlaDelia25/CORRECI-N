package parámetros;

import java.util.Scanner;

public class fecha {
	public void fecha(int dia,int mes) {
		
		 if(dia==25 && mes==12) {
				System.out.print("Es navidad");
			   }else {
				System.out.print("No es navidad");
			   }
			  
			}
			  
			
	
	
		public static void main(String[]args) {
			Scanner x=new Scanner(System.in);
			System.out.print("Ingresa dia");
			int dia = x.nextInt();
			System.out.print("Ingresa mes");
			int mes = x.nextInt();
			
			fecha resu=new fecha();
			resu.fecha(dia,mes);
		
			
			}


	  
	

	}




