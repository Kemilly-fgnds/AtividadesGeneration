package atividades2910;

import java.util.Scanner;

public class Doacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("Digite o seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("É a primeira doação? ");
		doacao = ler.nextBoolean();
		
		if (idade >= 18 && idade <= 59) {
			System.out.println(nome + " está apto para doar sangue!");
		} else if (idade >= 60 && idade <= 69 && doacao == false) {
			System.out.println(nome + " está apto para doar sangue!");
		} else {
			System.out.println(nome + " não está apto para doar sangue!");
		}
		
		ler.close();
	}

}
