package lacosderepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		int numero, cont = 0, soma = 0;
		
			do  {
				
				System.out.printf("Digite um número: ");
				numero = scanner.nextInt(); 
				if (numero == 0) {
				System.out.println("Sistema encerrado");
				break;
				}
				
				if (numero > 0) {
				soma = soma + numero;
				}
				
           cont++;
   	
		}while(cont < 5);
			
			System.out.println("A soma de todos os números positivos é: " + soma);
		
		
		scanner.close();	
	}
}
