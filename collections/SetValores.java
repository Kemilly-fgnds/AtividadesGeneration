package collections;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetValores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		TreeSet<Integer> setValores = new TreeSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.printf("INFORME 10 VALORES INTEIROS NÃO REPETIDOS. Digite o " + (i + 1) + "º valor: ");
			setValores.add(scanner.nextInt());
		}

		System.out.println("Lista dados do Set");

		Iterator<Integer> isetValores = setValores.iterator();

		while (isetValores.hasNext()) {
			System.out.println(isetValores.next());
		}

		scanner.close();
	}

}
