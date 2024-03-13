package parámetros;


import java.util.Scanner;

public class área {
double res;

public void area(double b,double h) {
	res=b*h/2;
}
public void mostrar() {
	System.out.print("El área es"+res);
}
	public static void main(String[]args) {
		Scanner x=new Scanner(System.in);
		System.out.print("Ingresa la base");
		double b = x.nextDouble();
		System.out.print("Ingresa la altura");
		double h = x.nextDouble();
		
		área resu=new área();
		resu.area(b,h);
		resu.mostrar();
		
		}
}
