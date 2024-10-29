package atividades2910;

import java.util.Scanner;

public class Pedido {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int codigo, qntd;
		float valorTotal;
		
		System.out.println("        CARDÁPIO        ");
        System.out.println("Digite 1 para Cachorro Quente");
        System.out.println("Digite 2 para X-Salada");
        System.out.println("Digite 3 para X-Bacon");
        System.out.println("Digite 4 para Bauru");
        System.out.println("Digite 5 para Refrigerante");
        System.out.println("Digite 6 para Suco de Laranja");
		codigo = ler.nextInt();
		
		
		switch (codigo) {
		case 1:
			System.out.println("Qual foi a quantidade comprada? ");
			qntd = ler.nextInt();
			
			valorTotal = qntd * 10;
					System.out.println("Produto Cachorro Quente, Valor total: " + valorTotal);
			break;
			
		case 2:
			System.out.println("Qual foi a quantidade comprada? ");
			qntd = ler.nextInt();
			
			valorTotal = qntd * 15;
					System.out.println("Produto X-Salada, Valor total: " + valorTotal);
			break;
			
		case 3:
			System.out.println("Qual foi a quantidade comprada? ");
			qntd = ler.nextInt();
			
			valorTotal = qntd * 18;
					System.out.println("Produto X-Bacon, Valor total: " + valorTotal);
			break;
			
		case 4:
			System.out.println("Qual foi a quantidade comprada? ");
			qntd = ler.nextInt();
			
			valorTotal = qntd * 12;
					System.out.println("Produto Bauru, Valor total: " + valorTotal);
			break;
			
		case 5:
			System.out.println("Qual foi a quantidade comprada? ");
			qntd = ler.nextInt();
			
			valorTotal = qntd * 8;
					System.out.println("Produto Refrigerante, Valor total: " + valorTotal);
			break;
			
		case 6:
			System.out.println("Qual foi a quantidade comprada? ");
			qntd = ler.nextInt();
			
			valorTotal = qntd * 13;
					System.out.println("Produto Suco de Laranja, Valor total: " + valorTotal);
			break;
			
		default:
			System.out.println("Operação inválida");
			break;
		}
		
		ler.close();
	}

}

