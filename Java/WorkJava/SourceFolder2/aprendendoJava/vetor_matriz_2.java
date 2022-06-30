package aprendendoJava;
import java.util.Locale;
import java.util.Scanner;

import entidade.vetor_matriz_2_2;

public class vetor_matriz_2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o tamanho dessa bagaceira: ");
		int n = sc.nextInt();
		vetor_matriz_2_2[] vetor = new vetor_matriz_2_2[n];
		
		System.out.print("Digite os valores para atribuir ao vetor dessa bagaceira: ");
		
		for (int i=0; i<vetor.length; i++) {
			sc.nextLine();
			String produto = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new vetor_matriz_2_2(produto, preco);
			 
			
		}
		
		
		double somaVetor = 0.0;
		for (int i =0; i<vetor.length; i++) {
			somaVetor += vetor[i].getPreco();
		}
		double mediaVetor = somaVetor / vetor.length;
		
		System.out.printf("A média dos valores inseridos no vetor dessa xoxeira é: %.2f%n", mediaVetor);
		
		
		
		sc.close();
		
		
			

	}

}