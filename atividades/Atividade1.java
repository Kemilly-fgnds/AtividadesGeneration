package atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		float salario;
		float abono;
		float novoSalario;
		String nome;
		
		System.out.println("Informe o seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Digite o salário: ");
		salario = ler.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = ler.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println(nome +" seu novo salário é: "+ novoSalario);
		
		ler.close();
		
		
		
		
		
	}

}
