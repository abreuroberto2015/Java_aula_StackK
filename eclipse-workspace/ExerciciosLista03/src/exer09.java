//Utilizando o Exerc�cio 04, criar uma sub-rotina que receba, via 
//argumento, um vetor de n�meros inteiros, e fa�a o mesmo
//procedimento do enunciado do exerc�cio.
//OBS1.: Copie o arquivo do exerc�cio e renomeie para �Exercicio09�;
//OBS2.: Utilize a sub-rotina criada para processar o vetor criado 
//no exerc�cio.


public class exer09 {

	public static void main(String[] args) {
		
		int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};		
				
		imprimirSimetria(v);

	}
	
	public static void imprimirSimetria(int vetor[]) {
       for (int i = 0; i < vetor.length; i++) {
			
			int pos = (vetor.length - 1) - i;	
			
			System.out.printf("%s - %s\n", vetor[i], vetor[pos]);	
		}						
	}
}


