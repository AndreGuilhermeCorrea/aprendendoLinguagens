package Tratamento_Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		//**********QUANDO A EXCEÇÃO NAO FOR TRATADA O PROGRAMA VAI TERMINAR**********
		method1();
		System.out.println("End of program");
		}
	
	
	public static void method1() {
		//marcador:
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
		}
	
	
	
	public static void method2() {
		//marcado:
		System.out.println("***METHOD2 START***");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Nome Pacato Cidadão: ");
		
		
		
		try {
			
			String[] vect = sc.nextLine().split(" ");
			System.out.println("Digite a posição truta: ");
			int position = sc.nextInt();
			System.out.println("Posição no vetor " + vect[position]);
			
		} 
		/*tratamento da exceção  gerado:*/
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			//Imprime na tela o rastreamento do stack
			//mostra na tela toda a chamada de métodos que geraram as exceçoes
			e.printStackTrace();
			//espera digitar algo para ver o rastreamento do stack
			sc.next();
			
		}  
		/*tratamento do erro  gerado:*/ 
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		
		System.out.println("End of program");
		sc.close();
	}
}
