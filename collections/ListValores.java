package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListValores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continua = true;

		ArrayList<Integer> valores = new ArrayList<Integer>();

		valores.add(7);
		valores.add(5);
		valores.add(4);
		valores.add(10);
		valores.add(3);
		valores.add(2);
		valores.add(1);
		valores.add(6);
		valores.add(9);
		valores.add(8);

		while (continua) {

			System.out.println("Digite um número para buscar na lista: ");
			int valor = scanner.nextInt();

			if (valores.contains(valor)) {
				int posicao = valores.indexOf(valor);
				System.out.println("O número " + valor + " foi encontrado na posição: " + posicao);
			} else {
				System.out.println("O número " + valor + " não foi encontrado na lista.");
			}

			System.out.print("Deseja continuar? (s/n): ");
			continua = scanner.next().equalsIgnoreCase("s");
			System.out.println("----------------------------");
		}

		scanner.close();
	}
}
