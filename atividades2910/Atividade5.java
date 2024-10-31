package atividades2910;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		/* Escreva um algoritmo em Java, que leia um número inteiro via teclado 
		  e mostre na tela uma mensagem indicando se este número é par ou ímpar 
		  e se o número é positivo ou negativo. Veja os exemplos abaixo:
		 */
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = ler.nextInt();
		
		if ((num % 2 == 0) && (num > 0 )) {
			System.out.println(num + " é par e positivo!");
		} else if ((num % 2 == 1) && (num < 0)) {
			System.out.println(num + " é ímpar e negativo!");
		} else if ((num % 2 == 0) && (num < 0)) {
			System.out.println(num + " é par e negativo!");
		} else {
			System.out.println(num + " é ímpar e positivo!");
		}
		
		
		
		
		
		ler.close();
	}

}
