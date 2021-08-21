//Dado um vetor V = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48,
//55, 9}, criar um programa que leia um número e informe na tela quantas
//vezes este número foi encontrado no vetor.

import java.util.Scanner;

public class exerc06 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};		
				
		int n;
		
		System.out.print("Digite um numero inteiro: ");
		n = leitor.nextInt();
		
		int contador = 0;		
		
		for (int i = 0; i < v.length; i++) {
			
			if (n == v[i]) {
				contador++;
			}
				
		}
		System.out.printf("%s foi encontrado %s vezes", n, contador);
	}

}
