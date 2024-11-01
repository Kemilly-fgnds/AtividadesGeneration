package collections;

import java.util.HashSet;
import java.util.Scanner;

public class SetNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continua = true;

		HashSet<Integer> setNumeros = new HashSet<Integer>();

		setNumeros.add(7);
		setNumeros.add(5);
		setNumeros.add(4);
		setNumeros.add(10);
		setNumeros.add(3);
		setNumeros.add(2);
		setNumeros.add(1);
		setNumeros.add(6);
		setNumeros.add(9);
		setNumeros.add(8);

		while (continua) {

			System.out.printf("Digite um número: ");
			int numero = scanner.nextInt();

			if (setNumeros.contains(numero)) {
				System.out.println("O número " + numero + " foi encontrado! ");
			} else {
				System.out.println("O número " + numero + " não foi encontrado");
			}

			System.out.print("Deseja continuar? (s/n): ");
			continua = scanner.next().equalsIgnoreCase("s");
			System.out.println("-------------------------");

		}

		scanner.close();
	}

}
