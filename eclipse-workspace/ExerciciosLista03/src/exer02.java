//Dado um vetor V = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10} criar um 
//programa que efetua a soma dos valores e imprima o resultado.

public class exer02 {

	public static void main(String[] args) {
		
		int v[] = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10};
		
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
			soma = soma +v[i];			
		}
		
		System.out.printf("soma: " + soma);		

	}

}