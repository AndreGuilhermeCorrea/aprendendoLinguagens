package aprendendoJava;

import java.util.Locale;
import java.util.Scanner;

import entidade.circulo_vs_2_classe;

public class circulo_vs_2 {

		//função main normalmente
		//***********NÃO PODE-SE CHAMAR UM MÉTODO QUE NAO SEJA ESTÁTICO EM UM MÉTODO ESTATICO COMO O MAIN*********
		//lembrando que por padrao o método main deve obrigatoriamente ser padrão
		public static void main(String[] args) {


			Locale.setDefault(Locale.US);
			
			//******Scanner instanciado
			Scanner sc = new Scanner(System.in);
			
			//*****************Objeto: calcCirculo INSTANCIADO: new circulo_vs_2_classe(); *************
			
			circulo_vs_2_classe calcCirculo = new circulo_vs_2_classe();
			
			System.out.printf("Digite o raio: ");
			
			
			double raioCirculo = sc.nextDouble();
			
			
			//OPERAÇÕES CHAMADAS APARTIR DO OBETO calcCirculo*******
			
			//função que calcula a circunferencia e retorna o valor
			double c = calcCirculo.circunferenciaCirculo(raioCirculo);
			
			double v = calcCirculo.volumeCircunferencia(raioCirculo);
			
			System.out.printf("A Circunferencia desse circulo é: %.2f%n ",  c);
			System.out.printf("A Volume desse circulo é: %.2f%n ",  v);
			System.out.printf("O valor de Pi:  %.2f%n",  calcCirculo.PI);
			
			sc.close();

	}

}
