//Utilizando o Exerc�cio 03, criar uma sub-rotina que receba, via 
//argumento, um vetor de n�meros reais, calcule a m�dia e imprima o
//resultado. 
//OBS1.: Copie o arquivo do exerc�cio e renomeie para �Exercicio08�;
//OBS2.: Utilize a sub-rotina criada para processar o vetor criado 
//no exerc�cio.


public class exer08 {
	
	public static void main(String[] args) {
		
		double v[] = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0};
				
		imprimirMedia(v);
	}
	
	public static void imprimirMedia(double vetor[]) {
		double soma = 0;
		double media = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma = soma +vetor[i];			
		}
		
		media = soma / vetor.length;
		
		System.out.printf("soma: %s\nM�dia: %s\n", soma, media);		

	}
	}
	
	

		
	
	
	
	
	
	
	
	

