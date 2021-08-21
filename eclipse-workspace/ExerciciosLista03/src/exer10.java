//Utilizando o Exercício 06, criar uma sub-rotina que receba dois 
//argumentos, um vetor de inteiros e um número inteiro. Com base 
//nos dois argumentos, a sub-rotina deverá verificar e imprimir
//quantas vezes número aparece no vetor.
//OBS1.: Copie o arquivo do exercício e renomeie para “Exercicio10”;
//OBS2.: Utilize a sub-rotina criada para processar o vetor criado
//no exercício.

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};		
				
		int n;
		
		System.out.print("Digite um numero inteiro: ");
		n = leitor.nextInt();
				
		imprimirPesquisa(v, n);
				
	}

	public static void imprimirPesquisa(int vetor[], int search) {
        int contador = 0;		
		 
		for (int i = 0; i < vetor.length; i++) {
			
			if (search == vetor[i]) {
				contador++;
			}
	}
		System.out.printf("%s foi encontrado %s vezes", search, contador);
}
}
