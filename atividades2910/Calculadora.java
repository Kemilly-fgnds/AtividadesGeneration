package atividades2910;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float num1, num2;
		int codigo;
		
		System.out.println("    CALCULADORA   ");
		System.out.println(" Digite 1 para soma ");
		System.out.println(" Digite 2 para subtração ");
		System.out.println(" Digite 3 para multiplicação ");
		System.out.println(" Digite 4 para divisão ");
		codigo = ler.nextInt();		
		
		switch (codigo) {
		case 1:
			System.out.println("Digite o primeiro número: ");
			num1 = ler.nextFloat();	
			
			System.out.println("Digite o segundo número: ");
			num2 = ler.nextFloat();		
			
			if (codigo == 1) {
			System.out.println(num1 + num2);
			}
			
			break;
		case 2:	
			System.out.println("Digite o primeiro número: ");
			num1 = ler.nextFloat();	
			
			System.out.println("Digite o segundo número: ");
			num2 = ler.nextFloat();		
			
			if (codigo == 2) {
			System.out.println(num1 - num2);
			}
			
			break;
		case 3:
			System.out.println("Digite o primeiro número: ");
			num1 = ler.nextFloat();	
			
			System.out.println("Digite o segundo número: ");
			num2 = ler.nextFloat();		
			
			if (codigo == 3) {
			System.out.println(num1 * num2);
			}
			
			break;
			
		case 4:
				System.out.println("Digite o primeiro número: ");
				num1 = ler.nextFloat();	
				
				System.out.println("Digite o segundo número: ");
				num2 = ler.nextFloat();		
				
				if (codigo == 4) {
				System.out.println(num1 / num2);
				}
				
			break;
			
			default:
				System.out.println("Operação inválida");
				break;
		}
		
		ler.close();
	}
}

