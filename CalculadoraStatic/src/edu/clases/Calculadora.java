package edu.clases;

public abstract class Calculadora {
	
	private static double a;
	private static double b;
	
	public static double getA() {
		return a;
	}

	public static void setA(double a) {
		Calculadora.a = a;
	}

	public static double getB() {
		return b;
	}

	public static void setB(double b) {
		Calculadora.b = b;
	}

	//Metodos static
	public static double Suma(double a,double b) {
		
		return a + b;		
	}
	
	public static double Resta(double a,double b) {
		
		return a - b;		
	}
	
	public static double Multiplicacion(double a,double b) {
		
		return a * b;		
	}
	
	public static double Division(double a,double b) {
		
		return a / b;		
	}
	
	

}
