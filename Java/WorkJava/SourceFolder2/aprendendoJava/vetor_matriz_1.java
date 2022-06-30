package aprendendoJava;

import java.util.Locale;
import java.util.Scanner;

public class vetor_matriz_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho dessa bagaceira: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];

		System.out.println("Digite os valores para atribuir ao vetor dessa bagaceira: ");

		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();

		}

		double somaVetor = 0.0;
		for (int i = 0; i < n; i++) {
			somaVetor += vetor[i];
		}
		double mediaVetor = somaVetor / n;

		System.out.println();

		System.out.printf("A média dos valores inseridos no vetor dessa xoxeira é: %.2f%n", mediaVetor);

		System.out.println("-----------------");




		

		sc.close();

	}

}
