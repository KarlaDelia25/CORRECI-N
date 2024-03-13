package parámetros;

import java.util.Scanner;

public class operacion {
	double res;
	public void operacion(double n1,double n2,double n3) {
		
		  if(n1==n2 && n2==n3) {
			   res=((n1+n2)*n3);
			System.out.print("El resultado es "+res);
		   }else  {
			System.out.print("No son iguales");
		  
		}
	}
	

	
		public static void main(String[]args) {
			Scanner x=new Scanner(System.in);
			System.out.print("Ingresa el primer número ");
			double n1 = x.nextDouble();
			System.out.print("Ingresa el soegundo número");
			double n2 = x.nextDouble();
			System.out.print("Ingresa el tercer número");
			double n3 = x.nextDouble();
			
			operacion resu=new operacion();
			resu.operacion(n1,n2,n3);
		
			
			}


	  
	

	}


