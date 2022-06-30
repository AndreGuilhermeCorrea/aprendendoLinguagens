//********************CTRL + SHIFT + F************** INDENTAÇÃO*************

package aprendendoJava;

import java.util.Locale;
import java.util.Scanner;

import entidade.circulo_vs_3_classe;

public class circulo_vs_3 {

	// função main normalmente
	// ***********NÃO PODE-SE CHAMAR UM MÉTODO QUE NAO SEJA ESTÁTICO EM UM MÉTODO
	// ESTATICO COMO O MAIN*********
	// lembrando que por padrao o método main deve obrigatoriamente ser padrão
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// ******Scanner instanciado
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o raio: ");

		double raioCirculo3 = sc.nextDouble();

		// OPERAÇÕES CHAMADAS APARTIR DO OBETO calcCirculo*******

		// função que calcula a circunferencia e retorna o valor
		double c = circulo_vs_3_classe.circunferenciaCirculo3(raioCirculo3);

		double v = circulo_vs_3_classe.volumeCircunferencia3(raioCirculo3);

		System.out.printf("A Circunferencia desse circulo é: %.2f%n ", c);
		System.out.printf("A Volume desse circulo é: %.2f%n ", v);
		System.out.printf("O valor de Pi:  %.2f%n", circulo_vs_3_classe.PI);

		sc.close();

	}

}