package aprendendoJava;

import java.util.Locale;
import java.util.Scanner;

public class circulo__vs_1 {

	//** a palavra final declara que o valor � constante
	//� a declara��o da constante pi
	//** o padr�o de nomes para constantes s�o mai�sculas no caso de mais deuma palavra usa-se o (underline) ___ ***
	public static final double PI = 3.14159;
	
	
	//fun��o main normalmente
	//***********N�O PODE-SE CHAMAR UM M�TODO QUE NAO SEJA EST�TICO EM UM M�TODO ESTATICO COMO O MAIN*********
	//lembrando que por padrao o m�todo main deve obrigatoriamente ser padr�o
	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		
		//******Scanner instanciado
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o raio: ");
		
		
		double raioCirculo = sc.nextDouble();
		
		
		//fun��o que calcula a circunferencia e retorna o valor
		double c = circunferenciaCirculo(raioCirculo);
		
		double v = volumeCircunferencia(raioCirculo);
		
		System.out.printf("A Circunferencia desse circulo �: %.2f%n ",  c);
		System.out.printf("A Volume desse circulo �: %.2f%n ",  v);
		System.out.printf("O valor de Pi:  %.2f%n",  PI);
		
		
		
		sc.close();
			
	}
	
	//fun��o circunferencia
	//***********N�O PODE-SE CHAMAR UM M�TODO QUE NAO SEJA EST�TICO EM UM M�TODO ESTATICO COMO O MAIN*********
	public static double circunferenciaCirculo(double raioCirculo) {
		
		return 2.0 * PI * raioCirculo;
		
	}
	
	//fun��o volume
	//***********N�O PODE-SE CHAMAR UM M�TODO QUE NAO SEJA EST�TICO EM UM M�TODO ESTATICO COMO O MAIN*********
	public static double volumeCircunferencia(double raioCirculo) {
		
		//n�o h� necessidade de colocar entre os parenteses por quest�o de prioridade
		return (4.0 * PI * raioCirculo * raioCirculo * raioCirculo) / 3.0;
		
		
	}

}
