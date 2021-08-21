//Dado um vetor V = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 
//22.0, 19.0, 50.0}, criar um programa que efetua a média dos 
//valores e imprima o resultado.


public class exer03 {

	public static void main(String[] args) {
		
		double v[] = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0};
		
		double soma = 0; //somatória
		double media = 0;
		
		for (int i = 0; i < v.length; i++) {
			soma = soma +v[i];			
		}
		
		media = soma / v.length;
		
		System.out.printf("soma: %s\nMédia: %s\n", soma, media);		

	}

}