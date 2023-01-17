package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc;
		double valor1, valor2, valor3, valor4, valor5, valor6;
/* ex 1: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */
		
		/*System.out.print("Digite o primeiro numero: ");
		valor1 = sc.nextDouble();
		System.out.print("Digite o segundo numero: ");
		valor2 = sc.nextDouble();
		calc = new Calculator(valor1, valor2);
		double soma = calc.soma();
		
		System.out.printf("soma = %.0f%n", soma);
		System.out.println("-------------------------");*/
		

/* ex 2: Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos. */
		
		/*System.out.print("Digite o valor do raio: ");
		valor1 = sc.nextDouble();
		calc = new Calculator(valor1);
		double area = calc.area();
		
		System.out.printf("Area = %.4f%n", area);
		System.out.println("-------------------------");*/
		
/* ex 3: Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */ 
		
		/*System.out.print("Digite o valor de A: ");
		valor1 = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		valor2 = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		valor3 = sc.nextDouble();
		System.out.print("Digite o valor de D: ");
		valor4 = sc.nextDouble();
		calc = new Calculator(valor1, valor2, valor3, valor4);
		double diferenca = calc.dif();
		
		System.out.printf("Diferenca = %.0f%n", diferenca);
		System.out.println("-------------------------");*/
		
/* ex 4: Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */
		
		/*System.out.print("Digite seu numero de registro: ");
		valor1 = sc.nextDouble();
		System.out.print("Digite seu numero de horas trabalhadas: ");
		valor2 = sc.nextDouble();
		System.out.print("Digite o valor recebido por horas trabalhadas: ");
		valor3 = sc.nextDouble();
		calc = new Calculator(valor1, valor2, valor3);
		double salario = calc.salario();
		
		System.out.printf("NUMBER: %.0f%n", valor1);
		System.out.printf("SALARY: U$ %.2f%n", salario);
		System.out.println("-------------------------")*/
		
/* ex 5: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/		
		
		
		/*System.out.print("Digite o codigo da peça 1: ");
		valor1 = sc.nextDouble();
		System.out.print("Digite a quantidade de peças 1: ");
		valor2 = sc.nextDouble();
		System.out.print("Digite o valor unitário da peça 1: ");
		valor3 = sc.nextDouble();
		System.out.print("Digite o codigo da peça 2: ");
		valor4 = sc.nextDouble();
		System.out.print("Digite a quantidade de peças 2: ");
		valor5 = sc.nextDouble();
		System.out.print("Digite o valor unitário da peça 2: ");
		valor6 = sc.nextDouble();
		calc = new Calculator(valor1, valor2, valor3, valor4, valor5, valor6);
		double total = calc.total();
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);
		System.out.println("-------------------------");*/
		
/* ex 6: Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/	
		
		System.out.print("digite 3 valores: ");
		valor1 = sc.nextDouble();
		valor2 = sc.nextDouble();
		valor3 = sc.nextDouble();
		
		calc = new Calculator(valor1, valor2, valor3);
		double triangulo = calc.triangulo(); 
		double circulo = calc.circulo();
		double trapezio = calc.trapezio();
		double quadrado = calc.quadrado();
		double retangulo = calc.retangulo();
		
		System.out.printf("Triangulo: %.3f%n", triangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("trapezio: %.3f%n", trapezio);
		System.out.printf("quadrado: %.3f%n", quadrado);
		System.out.printf("retangulo: %.3f%n", retangulo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	sc.close();	
	}

}
