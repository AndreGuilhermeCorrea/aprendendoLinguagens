package aprendendoJava;
import java.util.Scanner;
import java.util.Locale;
public class estrutura_faca_enquanto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Digite a Temperatura em graus Celsius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C /5.0 + 32.0;
		System.out.printf("A temperatura em Fahrenheit é: %.1f%n", F);
		
		System.out.println("Deseja repetir o cálculo (s/n)? ");
		char resp = sc.next().charAt(0);
		
		while (resp != 'n') {
			System.out.print("Digite a Temperatura em graus Celsius: ");
			C = sc.nextDouble();
			F = 9.0 * C /5.0 + 32.0;
			System.out.printf("A temperatura em Fahrenheit é: %.1f%n", F);
			
			System.out.println("Deseja repetir o cálculo (s/n)? ");
			resp = sc.next().charAt(0);
						
		}
				
			
		sc.close();

	}

}
