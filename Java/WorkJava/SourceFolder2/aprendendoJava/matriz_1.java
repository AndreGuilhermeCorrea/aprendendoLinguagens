package aprendendoJava;

import java.util.Locale;
import java.util.Scanner;

public class matriz_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Matrizzzzz***************************************

		System.out.println("Digite os dados da Matriz: ");
		int m = sc.nextInt();
		// instanciado matriz dimençao com linhas e colunas
		int[][] matriz = new int[m][m];

		System.out.println("Digite os valores da Matriz: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("\n\n MATRIZ:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(" " + matriz[i][j]);
				
			}
			System.out.println();
		}

		sc.close();
	}
}
