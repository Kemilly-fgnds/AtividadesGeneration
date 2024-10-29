package atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		float numero1;
		float numero2;
		float numero3;
		float numero4;
		float diferenca;
		String nome;
		
		System.out.println("Informe o seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Digite o primeiro valor: ");
		numero1 = ler.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		numero2 = ler.nextFloat();
		
		
		System.out.println("Digite o terceiro valor: ");
		numero3 = ler.nextFloat();
		
		
		System.out.println("Digite o quarto valor: ");
		numero4 = ler.nextFloat();
		
		diferenca = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println(nome + " a diferença dos valores é: " + diferenca);

		
		ler.close();
		
	}

}
