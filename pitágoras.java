package parámetros;

import java.util.Scanner;

public class pitágoras {
	double res;

	public void pitágoras(double co,double ca) {
		res=Math.sqrt(Math.pow(co,2) + Math.pow(ca,2));;
	}
	public void mostrar() {
		System.out.print("El resultado es:"+res);
	}
		public static void main(String[]args) {
			Scanner x=new Scanner(System.in);
			System.out.print("Ingresa cateto opuesto");
			double co = x.nextDouble();
			System.out.print("Ingresa cateto adyancente");
			double ca = x.nextDouble();
			
			pitágoras resu=new pitágoras();
			resu.pitágoras(co,ca);
			resu.mostrar();
			
			}
}


