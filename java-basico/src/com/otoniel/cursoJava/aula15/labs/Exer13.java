package com.otoniel.cursoJava.aula15.labs;

import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int dia = input.nextInt();
		
		switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Dia Inválido.");
		}
	}
}
