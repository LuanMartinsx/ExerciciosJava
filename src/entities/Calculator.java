package entities;

public class Calculator {
	
	private double valor1;
	private double valor2;
	private double valor3;
	private double valor4;
	private double valor5;
	private double valor6;
	
	
	public Calculator(double valor1) {
		this.valor1 = valor1;
	}
	
	
	public Calculator(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	
	public Calculator(double valor1, double valor2, double valor3) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}
	
	
	public Calculator(double valor1, double valor2, double valor3, double valor4) {

		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
	}
	
	
	public Calculator(double valor1, double valor2, double valor3, double valor4, double valor5, double valor6) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
		this.valor5 = valor5;
		this.valor6 = valor6;
	}


	public double getValor1() {
		return valor1;
	}


	public double getValor2() {
		return valor2;
	}
	
	public double getValor3() {
		return valor3;
	}


	public double getValor4() {
		return valor4;
	}
	
	public double getValor5() {
		return valor5;
	}
	
	public double getValor6() {
		return valor6;
	}
	
	
	/* ex 1*/
	public double soma() {
		return valor1 += valor2;
	}
	/* ex 2*/
	public double area() {
		return  3.14159 * (valor1 * valor1);
	}
	
	/* ex 3*/
	
	public double dif() {
		return (valor1 * valor2) - (valor3 * valor4);
	}
	
	/* ex 4 */
	public double salario() {
		return valor2 * valor3;
	}

	/* ex 5*/
	
	public double total() {
		return (valor2 * valor3) + (valor5 * valor6);
	}
	
	/*ex 6*/
	
	public double triangulo() {
		 return (valor1 * valor3) / 2;
		 }
	
	public double circulo() {
		return 3.14159 * (valor3 * valor3);
		 
	}
	
	public double trapezio() {
		return (valor1 + valor2) * valor3 / 2;
		
	}
	
	public double quadrado() {
		 return (valor2 * valor2);
		 
	}
	
	public double retangulo()
	{
		return (valor1 * valor2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


