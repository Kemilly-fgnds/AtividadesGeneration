package lacosderepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int idade = 0, menor = 0, maior = 0, cont = 0;
		
		
	System.out.println("################ PESQUISA #################");

		while (cont <= 4) {
			
				System.out.printf("Digite a sua idade: ");
				idade = scanner.nextInt(); 
				if (idade < 0) {
					System.out.println("Sistema encerrado");
					break;
				} else if (idade < 21) {
					menor++;
				} else if (idade > 50) {
					maior++;
				}

				cont++;
				
		}
      
		System.out.println("Número de pessoas menores de 21 anos: " + menor);

		System.out.println("Número de pessoas maiores de 50 anos: " + maior);

		scanner.close();
	}
}
