package lacosderepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero, par = 0, impar = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.printf("Digite o " + cont + "º numero: ");
			numero = scanner.nextInt();
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			

		}
	
		System.out.println(par + " é par");
		
		System.out.println(impar + " é ímpar");

		scanner.close();
	}
}
