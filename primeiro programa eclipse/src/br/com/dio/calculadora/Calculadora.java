package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;

		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();

		int soma = soma(a, b);
		int subtra��o = subtra��o(a, b);
		int multiplica��o = multiplica��o(a, b);
		double divis�o = divis�o(a, b);

		System.out.println("soma " + soma);
		System.out.println("sub " + subtra��o);
		System.out.println("mult " + multiplica��o);
		System.out.println("div " + divis�o);

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtra��o(int a, int b) {
		return a - b;
	}

	public static double divis�o(Integer a, Integer b) {
		return a.doubleValue() / b.doubleValue();

	}

	public static int multiplica��o(int a, int b) {
		return a * b;
	}

}
