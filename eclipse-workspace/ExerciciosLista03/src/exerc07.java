//Criar um programa preencha um vetor de inteiros de 20 posi��es, via 
//teclado. Ap�s o preenchimento do vetor, o programa dever� separar os 
//elementos pares e �mpares em dois vetores, e por fim, exibir os tr�s
//vetores


import java.util.Scanner;

public class exerc07 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int v[] = new int[20];	
		int par[] = new int[20];
		int impar[] = new int[20];
		
		//Preencher o vetor		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Digite o %s� numero: ", (i + 1));
			v[i] = leitor.nextInt();
			}
				
		//Separar os elemntos pares dos impares	
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				
				par[i] = v[i];
				
			} else {
				impar[i] = v[i];
			}
				
		}
		// Imprimir o vetor v[]
			
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%s  ", v[i]);
		}
				
		System.out.println();	
		// Imprimir o vetor par[]
		
		for (int i = 0; i < v.length; i++) {
			if(par[i] != 0)
			System.out.printf("%s  ", par[i]);
		}
		
		System.out.println();
		// Imprimir o vetor impar[]
		
		for (int i = 0; i < v.length; i++) {
			if(impar[i] != 0)
			System.out.printf("%s  ", impar[i]);
		}							
		
		System.out.printf("\nFim do programa");
	}

}
