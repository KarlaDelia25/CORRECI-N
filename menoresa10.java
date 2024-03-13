package parámetros;

import java.util.Scanner;

public class menoresa10 {
	public void menoresa10(double n1,double n2,double n3) {
		
		 if(n1<10 && n2<10  && n3<10) {
				System.out.print("Son menores a 10");
			   }else  {
				System.out.print("El 10 es mayor que todos o un número");
			  
			}

			}
			  
			
	
	
		public static void main(String[]args) {
			Scanner x=new Scanner(System.in);
			System.out.print("Ingresa el primer número");
			double n1 = x.nextDouble();
			System.out.print("Ingresa el segundo número");
			double n2 = x.nextDouble();
			System.out.print("Ingresa el tercer número");
			double n3 = x.nextDouble();
			
			menoresa10 resu=new menoresa10();
			resu.menoresa10(n1,n2,n3);
		
			
			}


	  
	

	}




