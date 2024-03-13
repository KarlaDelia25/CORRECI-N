package parámetros;

import java.util.Scanner;



public class cuadrantes {
	

	public void cuadrantes(double c1,double c2) {
		
		 if(c1>0 && c2>0) {
				System.out.print("CUADRANTE I");
			   }else if (c1<0 && c2>0) {
				System.out.print("CUADRANTE II");
			   }else if (c1>0 && c2>0) {
					System.out.print("CUADRANTE III");
			   }else if (c1>0 && c2<0) {
					System.out.print("CUADRANTE IV");
			   }
			}
			  
			
	
	
		public static void main(String[]args) {
			Scanner x=new Scanner(System.in);
			System.out.print("Ingresa cateto opuesto");
			double c1 = x.nextDouble();
			System.out.print("Ingresa cateto adyancente");
			double c2 = x.nextDouble();
			
			cuadrantes resu=new cuadrantes();
			resu.cuadrantes(c1,c2);
		
			
			}


	  
	

	}




