package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int num;
		int posicao = 0;

		Arrays.sort(vetorNumeros);

		System.out.println("###### ESCOLHA UM NÚMERO #######");

		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println(vetorNumeros[i]);
		}

		System.out.printf("Digite o numero desejado: ");
		num = scanner.nextInt();

		for (int cont = 0; cont < vetorNumeros.length; cont++) {
			posicao = Arrays.binarySearch(vetorNumeros, num);
		}

		if (posicao >= 0)
			System.out.println("O número " + num + " foi encontrado e está na posição: " + posicao);
		else
			System.out.println("Número " + num + " não encontrado!");

		scanner.close();
	}

}
