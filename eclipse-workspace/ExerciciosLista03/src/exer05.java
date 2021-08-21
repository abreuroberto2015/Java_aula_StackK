import java.util.Scanner;

//Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95,
//13, 26, 49, 50}, criar um programa a que receba um número pelo
//teclado, verifique e imprima na tela se este número existe no
//vetor.


public class exer05 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};		
				
		int n;
		
		System.out.print("Digite um numero inteiro: ");
		n = leitor.nextInt();
		
		boolean existe= false;		
		
		for (int i = 0; i < v.length; i++) {
			
			if (n == v[i]) {
				existe= true;
			}
		}
		
		if (existe  == true)
		{
			System.out.printf("%s existe no vetor", n);	
		} else {
			System.out.printf("%s Não existe no vetor", n);
		}

	}

}