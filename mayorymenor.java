package parámetros;

import java.util.Scanner;

public class mayorymenor {
	public void mayorymenor(double n1,double n2) {
		
		  if(n1>n2) {
				System.out.print("El número"+n1+"es mayor");
			   }else if(n1<n2) {
				System.out.print("El número"+n2+"es mayor");
			   }else if(n1==n2) {
				System.out.print("Son iguales");
			}

			}
			  
			
	
	
		public static void main(String[]args) {
			Scanner x=new Scanner(System.in);
			System.out.print("Ingresa número 1");
			double n1 = x.nextDouble();
			System.out.print("Ingresa número 2");
			double n2 = x.nextDouble();
			
			mayorymenor resu=new mayorymenor();
			resu.mayorymenor(n1,n2);
		
			
			}


	  
	

	}




