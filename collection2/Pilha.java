package collection2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		int opcao;
		boolean continua = true;

		while (continua) {
			System.out.println("                             ");
			System.out.println("    BEM-VINDO A LOCADORA   ");
			System.out.println(" Digite 1 para adicionar um novo filme na pilha");
			System.out.println(" Digite 2 para listar todos os filmes da pilha");
			System.out.println(" Digite 3 para retirar um filme da pilha");
			System.out.println(" Digite 0 para sair ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.printf("Digite o nome do filme que deseja adicionar a pilha: ");
				String filme = scanner.nextLine();

				pilha.push(filme);

				System.out.println("Pilha:");

				Iterator<String> iterator1 = pilha.iterator();

				while (iterator1.hasNext()) {
					System.out.println(iterator1.next());
				}

				System.out.println("Filme adicionado!");

				break;

			case 2:

				System.out.println(pilha.size());

				System.out.println("\nFilmes da pilha:");

				Iterator<String> iterator2 = pilha.iterator();

				while (iterator2.hasNext()) {
					System.out.println(iterator2.next());
				}

				break;

			case 3:

				if (pilha.isEmpty()) {
					System.out.println(" A pilha está vazia!");
				} else {
					System.out.println("\nRemover filme: " + pilha.pop());
				}

				System.out.println("Pilha atualizada:");

				Iterator<String> iterator3 = pilha.iterator();

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
