package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListCores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite a " + (i + 1) + "º cor: ");
			cores.add(scanner.nextLine());
		}

		System.out.println("As cores inseridas foram: "+ cores);

		Collections.sort(cores);
		System.out.println("Cores listadas em ordem alfabética: " + cores);

		scanner.close();
	}

}
