package parámetros;

import java.util.Scanner;

public class suma {
	double sum,res,mul,div,resu;
	static double n1;
	static double n2;
	
	public static void main(String[]args) {
		
		
		Scanner x=new Scanner(System.in);
		System.out.print("Ingresa el primer número");
		n1=x.nextDouble();
		System.out.print("Ingresa el segundo número");
		n2=x.nextDouble();
		
		suma y=new suma();
		y.calcular();
		y.mostrar();
		
	}
	public void calcular() {
		
		sum=n1+n2;
		res=n1-n2;
		mul=n1*n2;
		div=n1/n2;
	}
		public void mostrar() {
			System.out.println("La suma es "+sum);
			
			System.out.println("La resta es "+res);
			
			System.out.println("La multiplicación es "+mul);
			
			System.out.println("La división es "+div);
		
	}

}
