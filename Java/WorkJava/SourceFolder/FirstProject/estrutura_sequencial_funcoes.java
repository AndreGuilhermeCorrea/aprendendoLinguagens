package FirstProject;

import java.util.Scanner;

public class estrutura_sequencial_funcoes {
	
	
	//as fun�oes s�o processamentos que representam um significado
	//Math.sqrt � a fun��o para calculo de ra�z quadrada
	
	// as vantagens s�o: 
		//modulariza��o: divide programa em v�rias partes ou v�rios m�dulos
		//delega��o: delega a l�gica de calcular tornando o programa mais enxuto
		//reaproveitamento: reaproveitar as fun�oes

	//podem ainda receber dados de entrada(par�metros e argumentos) e podem tb ou nao retornar uma sa�da
	
	//*****vale lembrar que as orienta�oes a objetos as fun�oes em classes recebem o nome de m�todo
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//vari�veis inteiras para calculo da equa��o do 2� grau
		
		int a, b, c;
		
		System.out.println("A f�rmula de Bhaskara � um c�lculo matem�tico para determinar as ra�zes de uma fun��o de 2� grau.");
		System.out.println("Vamos calcular fun��o do 2� Grau(ax� + bx + c = 0) pela f�rmula de Bhaskara?");
		
		System.out.println("Digite o valor de a: ");
		//entrada de dados do tipo inteiro para a fun��o 
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();
		System.out.println("Digite o valor de c: ");
		c = sc.nextInt();
		
		//processamento de dados
		
		//calculando delta com tipo double
		double delta;
		delta = Math.pow(b, 2.0) - 4* a * c;
		System.out.println("Para a Fun��o do 2� Grau: " +a+"x� + " +b+"x + "+c);
		
		//estrutura condicional se senao
		
		if (delta >= 0) {
			System.out.println("O Valor de DELTA �: " + delta);
			double x1, x2; 
			x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.println("O X� raiz dessa fun��o �: " + x1);
			System.out.println("O x� raiz dessa fun��o �: " + x2);
		}
		else {
			System.out.println("Seu delta resultou em n�mero negativo!");
		}
		
		
		//elemento para finalizar o scanner
	sc.close();
	
	}

}
