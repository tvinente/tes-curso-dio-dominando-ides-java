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
		int subtração = subtração(a, b);
		int multiplicação = multiplicação(a, b);
		double divisão = divisão(a, b);

		System.out.println("soma " + soma);
		System.out.println("sub " + subtração);
		System.out.println("mult " + multiplicação);
		System.out.println("div " + divisão);

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtração(int a, int b) {
		return a - b;
	}

	public static double divisão(Integer a, Integer b) {
		return a.doubleValue() / b.doubleValue();

	}

	public static int multiplicação(int a, int b) {
		return a * b;
	}

}
