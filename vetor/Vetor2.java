package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetorInteiro[] = new int[10];
		int i = 0;
		int posicao = 0;
		float media, soma = 0;
		String impar = " ";
		String par = " ";

		for (i = 0; i < vetorInteiro.length; i++) {
			System.out.printf("Digite o " + (i + 1) + "º numero: ");
			vetorInteiro[i] = scanner.nextInt();
		}

		for (i = 1; i < vetorInteiro.length; i += 2) {
			impar += vetorInteiro[i];
		}

		for (i = 0; i < vetorInteiro.length; i += 2) {
			par += vetorInteiro[i];
		}

		for (i = 0; i < vetorInteiro.length; i++) {
			soma = (soma + vetorInteiro[i]);
		}

		media = (soma / 10);

		System.out.println("As posições " + impar + " são ímpares");
		System.out.println("AS posições " + par + " são pares");
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);

		scanner.close();

	}
}