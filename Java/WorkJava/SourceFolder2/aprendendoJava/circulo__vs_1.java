package aprendendoJava;

import java.util.Locale;
import java.util.Scanner;

public class circulo__vs_1 {

	//** a palavra final declara que o valor é constante
	//é a declaração da constante pi
	//** o padrão de nomes para constantes são maiúsculas no caso de mais deuma palavra usa-se o (underline) ___ ***
	public static final double PI = 3.14159;
	
	
	//função main normalmente
	//***********NÃO PODE-SE CHAMAR UM MÉTODO QUE NAO SEJA ESTÁTICO EM UM MÉTODO ESTATICO COMO O MAIN*********
	//lembrando que por padrao o método main deve obrigatoriamente ser padrão
	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		
		//******Scanner instanciado
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o raio: ");
		
		
		double raioCirculo = sc.nextDouble();
		
		
		//função que calcula a circunferencia e retorna o valor
		double c = circunferenciaCirculo(raioCirculo);
		
		double v = volumeCircunferencia(raioCirculo);
		
		System.out.printf("A Circunferencia desse circulo é: %.2f%n ",  c);
		System.out.printf("A Volume desse circulo é: %.2f%n ",  v);
		System.out.printf("O valor de Pi:  %.2f%n",  PI);
		
		
		
		sc.close();
			
	}
	
	//função circunferencia
	//***********NÃO PODE-SE CHAMAR UM MÉTODO QUE NAO SEJA ESTÁTICO EM UM MÉTODO ESTATICO COMO O MAIN*********
	public static double circunferenciaCirculo(double raioCirculo) {
		
		return 2.0 * PI * raioCirculo;
		
	}
	
	//função volume
	//***********NÃO PODE-SE CHAMAR UM MÉTODO QUE NAO SEJA ESTÁTICO EM UM MÉTODO ESTATICO COMO O MAIN*********
	public static double volumeCircunferencia(double raioCirculo) {
		
		//não há necessidade de colocar entre os parenteses por questão de prioridade
		return (4.0 * PI * raioCirculo * raioCirculo * raioCirculo) / 3.0;
		
		
	}

}
