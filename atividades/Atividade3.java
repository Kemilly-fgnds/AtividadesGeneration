package atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		String nome;
		
		System.out.println("Informe o seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Digite o seu Salário Bruto: ");
		salarioBruto = ler.nextFloat();
		
		System.out.println("Digite o seu Adicional Noturno: ");
		adicionalNoturno = ler.nextFloat();
		
		System.out.println("Digite as suas Horas Extras: ");
		horasExtras = ler.nextFloat();
		
		System.out.println("Digite os seus descontos: ");
		descontos = ler.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println(nome + " o seu Salário Líquido será de " + salarioLiquido);
		
		ler.close();

		
	}

}
