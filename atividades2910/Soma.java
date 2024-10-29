package atividades2910;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		int n1, n2, n3;
	
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextInt();
	
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
	
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		
		// A + B é maior, menor ou igual a C.
		if ((n1 + n2) > n3) {
			System.out.println("A soma do n1 e n2 é maior do que o n3");
		} else if ((n1 + n2) < n3) {
			System.out.println("A soma do n1 e n2 é menor do que n3");
		} else {
			System.out.println("A soma do n1 e n2 é igual ao n3");
		}
	
		ler.close();
	}

}
