package atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float calcularMedia;
		String nome;
		
		System.out.println("Informe o seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = ler.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = ler.nextFloat();
		
		calcularMedia = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Sua média é: " + calcularMedia);
		
		if (calcularMedia >= 7) {
			System.out.println(nome + " parabéns! Você passou de ano!");
		} else {
			System.out.println(nome + " infelizmente você reprovou. ");
		}

		
		ler.close();
		
		
	}

}
