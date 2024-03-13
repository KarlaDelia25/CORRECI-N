package parámetros;

import java.util.Scanner;

public class ecuación {

		double res;

		public void ecuación(double a,double b) {
			res=(a-b)*((a+b));
		}
		public void mostrar() {
			System.out.print("El resultado es:"+res);
		}
			public static void main(String[]args) {
				Scanner x=new Scanner(System.in);
				System.out.print("Ingresa a");
				double a = x.nextDouble();
				System.out.print("Ingresa b");
				double b = x.nextDouble();
				
				ecuación resu=new ecuación();
				resu.ecuación(a,b);
				resu.mostrar();
				
				}
}
