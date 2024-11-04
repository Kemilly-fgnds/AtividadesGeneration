package collection2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int opcao;
		boolean continua = true;

		while (continua) {
			System.out.println("                             ");
			System.out.println("    FILA DO BANCO   ");
			System.out.println(" Digite 1 para adicionar um novo cliente na fila");
			System.out.println(" Digite 2 para listar todos os clientes da fila");
			System.out.println(" Digite 3 para retirar cliente da fila");
			System.out.println(" Digite 0 para sair ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.printf("Digite o nome do cliente que deseja adicionar a fila: ");
				String cliente = scanner.next();

				fila.add(cliente);

				System.out.println("Fila:");

				Iterator<String> iterator1 = fila.iterator();

				while (iterator1.hasNext()) {
					System.out.println(iterator1.next());
				}

				System.out.println("Cliente adicionado!");

				break;

			case 2:

				System.out.println(fila.size());

				System.out.println("\nClientes da fila:");

				Iterator<String> iterator2 = fila.iterator();

				while (iterator2.hasNext()) {
					System.out.println(iterator2.next());
				}

				break;

			case 3:

				if (fila.isEmpty()) {
					System.out.println(" A fila está vazia!");
				}

				System.out.println("\nRemover cliente: " + fila.remove());

				System.out.println("Fila atualizada:");

				Iterator<String> iterator3 = fila.iterator();

				while (iterator3.hasNext()) {
					System.out.println(iterator3.next());
				}

				break;

			case 0:
				System.out.println("Programa encerrado.");
				continua = false;

				break;

			default:
				System.out.println("Operação inválida.");
				continua = false;
				break;
			}
		}
		scanner.close();
	}
}
